package pl.zajavka.business;

import lombok.AllArgsConstructor;
import pl.zajavka.business.dao.CarServiceRequestDAO;
import pl.zajavka.business.management.FileDataPreparationService;
import pl.zajavka.domain.CarServiceRequest;
import pl.zajavka.infrastructure.database.entity.CarServiceRequestEntity;
import pl.zajavka.infrastructure.database.entity.CarToBuyEntity;
import pl.zajavka.infrastructure.database.entity.CarToServiceEntity;
import pl.zajavka.infrastructure.database.entity.CustomerEntity;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;

@AllArgsConstructor
public class CarServiceRequestService {

    private final FileDataPreparationService fileDataPreparationService;
    private final CarService carService;
    private final CustomerService customerService;
    private final CarServiceRequestDAO carServiceRequestDAO;

    public void requestService() {
        Map<Boolean, List<CarServiceRequest>> serviceRequests = fileDataPreparationService.createCarServiceRequests().stream()
                .collect(Collectors.groupingBy(element -> element.getCar().shouldExistInCarToBuy()));

        serviceRequests.get(true).forEach(this::saveServiceRequestsForExistingCar);
        serviceRequests.get(false).forEach(this::saveServiceRequestsForNewCar);
    }

    private void saveServiceRequestsForExistingCar(CarServiceRequest request) {
        CarToServiceEntity car = carService.findCarToService(request.getCar().getVin())
                .orElse(findInCarToBuyAndSaveInCarToService(request.getCar()));
        CustomerEntity customer = customerService.findCustomer(request.getCustomer().getEmail());

        CarServiceRequestEntity carServiceRequestEntity = buildCarServiceRequetsEntity(request, car, customer);
        customer.addServiceRequest(carServiceRequestEntity);
        customerService.saveServiceRequest(customer);
    }

    private CarToServiceEntity findInCarToBuyAndSaveInCarToService(CarServiceRequest.Car car) {
        CarToBuyEntity carToBuy = carService.findCarToBuy(car.getVin());
        return carService.saveCarToService(carToBuy);
    }

    private void saveServiceRequestsForNewCar(CarServiceRequest request) {
        CarToServiceEntity car = carService.saveCarToService(request.getCar());
        CustomerEntity customer = customerService.saveCustomer(request.getCustomer());

        CarServiceRequestEntity carServiceRequestEntity = buildCarServiceRequetsEntity(request, car, customer);
        customer.addServiceRequest(carServiceRequestEntity);
        customerService.saveServiceRequest(customer);
    }

    private CarServiceRequestEntity buildCarServiceRequetsEntity(
            CarServiceRequest request,
            CarToServiceEntity car,
            CustomerEntity customer
    ) {
        OffsetDateTime when = OffsetDateTime.now();
        return CarServiceRequestEntity.builder()
                .carServiceRequestNumber(generateCarServiceNumber(when))
                .receivedDateTime(when)
                .customerComment(request.getCustomerComment())
                .customer(customer)
                .car(car)
                .build();
    }

    private String generateCarServiceNumber(OffsetDateTime when) {
        return "%s.%s.%s-%s.%s.%s.%s".formatted(
                when.getYear(),
                when.getMonth().ordinal(),
                when.getDayOfMonth(),
                when.getHour(),
                when.getMinute(),
                when.getSecond(),
                randomInt(10, 100));
    }

    @SuppressWarnings("SameParameterValue")
    private int randomInt(int min, int max) {
        return new Random().nextInt(max - min) + min;
    }

    public CarServiceRequestEntity findAnyActiveServiceRequest(String carVin) {
        Set<CarServiceRequestEntity> serviceRequests = carServiceRequestDAO.findAnyActiveServiceRequestsByCarVin(carVin);
        if (serviceRequests.size() != 1) {
            throw new RuntimeException("There should be only one active service request at a time, cat vin: [%s]".formatted(carVin));
        }
        return serviceRequests.stream()
                .findAny()
                .orElseThrow(() -> new RuntimeException("Could not find eny service requests, car vin: [%s]".formatted(carVin)));
    }
}
