package pl.zajavka.api.dto.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;
import pl.zajavka.api.dto.CarHistoryDTO;
import pl.zajavka.api.dto.CarToBuyDTO;
import pl.zajavka.api.dto.CarToServiceDTO;
import pl.zajavka.api.dto.PartDTO;
import pl.zajavka.api.dto.ServiceDTO;
import pl.zajavka.domain.CarHistory;
import pl.zajavka.domain.CarToBuy;
import pl.zajavka.domain.CarToService;
import pl.zajavka.domain.Part;
import pl.zajavka.domain.Service;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-07-06T08:09:39+0200",
    comments = "version: 1.5.3.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-7.5.1.jar, environment: Java 17.0.1 (Oracle Corporation)"
)
@Component
public class CarMapperImpl implements CarMapper {

    @Override
    public CarToBuyDTO map(CarToBuy car) {
        if ( car == null ) {
            return null;
        }

        CarToBuyDTO.CarToBuyDTOBuilder carToBuyDTO = CarToBuyDTO.builder();

        carToBuyDTO.vin( car.getVin() );
        carToBuyDTO.brand( car.getBrand() );
        carToBuyDTO.model( car.getModel() );
        carToBuyDTO.year( car.getYear() );
        carToBuyDTO.color( car.getColor() );
        carToBuyDTO.price( car.getPrice() );

        return carToBuyDTO.build();
    }

    @Override
    public CarToServiceDTO map(CarToService car) {
        if ( car == null ) {
            return null;
        }

        CarToServiceDTO.CarToServiceDTOBuilder carToServiceDTO = CarToServiceDTO.builder();

        carToServiceDTO.vin( car.getVin() );
        carToServiceDTO.brand( car.getBrand() );
        carToServiceDTO.model( car.getModel() );
        carToServiceDTO.year( car.getYear() );

        return carToServiceDTO.build();
    }

    @Override
    public CarHistoryDTO map(CarHistory carHistory) {
        if ( carHistory == null ) {
            return null;
        }

        CarHistoryDTO.CarHistoryDTOBuilder carHistoryDTO = CarHistoryDTO.builder();

        carHistoryDTO.carServiceRequests( mapServiceRequests( carHistory.getCarServiceRequests() ) );
        carHistoryDTO.carVin( carHistory.getCarVin() );

        return carHistoryDTO.build();
    }

    @Override
    public CarHistoryDTO.ServiceRequestDTO mapServiceRequest(CarHistory.CarServiceRequest request) {
        if ( request == null ) {
            return null;
        }

        CarHistoryDTO.ServiceRequestDTO.ServiceRequestDTOBuilder serviceRequestDTO = CarHistoryDTO.ServiceRequestDTO.builder();

        serviceRequestDTO.receivedDateTime( mapOffsetDateTimeToString( request.getReceivedDateTime() ) );
        serviceRequestDTO.completedDateTime( mapOffsetDateTimeToString( request.getCompletedDateTime() ) );
        serviceRequestDTO.carServiceRequestNumber( request.getCarServiceRequestNumber() );
        serviceRequestDTO.customerComment( request.getCustomerComment() );
        serviceRequestDTO.services( serviceListToServiceDTOList( request.getServices() ) );
        serviceRequestDTO.parts( partListToPartDTOList( request.getParts() ) );

        return serviceRequestDTO.build();
    }

    protected ServiceDTO serviceToServiceDTO(Service service) {
        if ( service == null ) {
            return null;
        }

        ServiceDTO.ServiceDTOBuilder serviceDTO = ServiceDTO.builder();

        serviceDTO.serviceCode( service.getServiceCode() );
        serviceDTO.description( service.getDescription() );
        serviceDTO.price( service.getPrice() );

        return serviceDTO.build();
    }

    protected List<ServiceDTO> serviceListToServiceDTOList(List<Service> list) {
        if ( list == null ) {
            return null;
        }

        List<ServiceDTO> list1 = new ArrayList<ServiceDTO>( list.size() );
        for ( Service service : list ) {
            list1.add( serviceToServiceDTO( service ) );
        }

        return list1;
    }

    protected PartDTO partToPartDTO(Part part) {
        if ( part == null ) {
            return null;
        }

        PartDTO.PartDTOBuilder partDTO = PartDTO.builder();

        partDTO.serialNumber( part.getSerialNumber() );
        partDTO.description( part.getDescription() );
        partDTO.price( part.getPrice() );

        return partDTO.build();
    }

    protected List<PartDTO> partListToPartDTOList(List<Part> list) {
        if ( list == null ) {
            return null;
        }

        List<PartDTO> list1 = new ArrayList<PartDTO>( list.size() );
        for ( Part part : list ) {
            list1.add( partToPartDTO( part ) );
        }

        return list1;
    }
}
