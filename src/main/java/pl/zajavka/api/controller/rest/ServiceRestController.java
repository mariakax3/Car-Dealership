package pl.zajavka.api.controller.rest;

import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import pl.zajavka.api.dto.CarServiceCustomerRequestDTO;
import pl.zajavka.api.dto.CarServiceRequestDTO;
import pl.zajavka.api.dto.CarServiceRequestsDTO;
import pl.zajavka.api.dto.mapper.CarServiceRequestMapper;
import pl.zajavka.business.CarServiceRequestService;
import pl.zajavka.domain.CarServiceRequest;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping(ServiceRestController.API_SERVICE)
public class ServiceRestController {

    public static final String API_SERVICE = "/service/new";
    private static final String SERVICE_REQUEST = "/service/request";

    private final CarServiceRequestService carServiceRequestService;
    private final CarServiceRequestMapper carServiceRequestMapper;

    @PostMapping(SERVICE_REQUEST)
    public CarServiceRequestsDTO makeServiceRequest(
            @Valid @RequestBody CarServiceCustomerRequestDTO request
    ) {
        CarServiceRequest serviceRequest = carServiceRequestMapper.map(request);
        carServiceRequestService.makeServiceRequest(serviceRequest);

        return CarServiceRequestsDTO.builder()
                .carServiceRequests(getAvailableCarServiceRequests())
                .build();
    }

    private List<CarServiceRequestDTO> getAvailableCarServiceRequests() {
        return carServiceRequestService.availableServiceRequests().stream()
                .map(carServiceRequestMapper::map)
                .toList();
    }

}
