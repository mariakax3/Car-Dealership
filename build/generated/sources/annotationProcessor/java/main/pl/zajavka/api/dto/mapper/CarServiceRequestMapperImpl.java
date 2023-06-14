package pl.zajavka.api.dto.mapper;

import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;
import pl.zajavka.api.dto.CarServiceMechanicProcessingUnitDTO;
import pl.zajavka.api.dto.CarServiceRequestDTO;
import pl.zajavka.domain.CarServiceProcessingRequest;
import pl.zajavka.domain.CarServiceRequest;
import pl.zajavka.domain.CarToService;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-06-14T14:45:06+0200",
    comments = "version: 1.5.3.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-7.5.1.jar, environment: Java 17.0.1 (Oracle Corporation)"
)
@Component
public class CarServiceRequestMapperImpl implements CarServiceRequestMapper {

    @Override
    public CarServiceRequestDTO map(CarServiceRequest request) {
        if ( request == null ) {
            return null;
        }

        CarServiceRequestDTO.CarServiceRequestDTOBuilder carServiceRequestDTO = CarServiceRequestDTO.builder();

        carServiceRequestDTO.carVin( requestCarVin( request ) );
        carServiceRequestDTO.receivedDateTime( mapOffsetDateTimeToString( request.getReceivedDateTime() ) );
        carServiceRequestDTO.completedDateTime( mapOffsetDateTimeToString( request.getCompletedDateTime() ) );
        carServiceRequestDTO.carServiceRequestNumber( request.getCarServiceRequestNumber() );
        carServiceRequestDTO.customerComment( request.getCustomerComment() );

        return carServiceRequestDTO.build();
    }

    @Override
    public CarServiceProcessingRequest map(CarServiceMechanicProcessingUnitDTO dto) {
        if ( dto == null ) {
            return null;
        }

        CarServiceProcessingRequest.CarServiceProcessingRequestBuilder carServiceProcessingRequest = CarServiceProcessingRequest.builder();

        carServiceProcessingRequest.comment( dto.getMechanicComment() );
        carServiceProcessingRequest.mechanicPesel( dto.getMechanicPesel() );
        carServiceProcessingRequest.carVin( dto.getCarVin() );
        carServiceProcessingRequest.partSerialNumber( dto.getPartSerialNumber() );
        carServiceProcessingRequest.partQuantity( dto.getPartQuantity() );
        carServiceProcessingRequest.serviceCode( dto.getServiceCode() );
        carServiceProcessingRequest.hours( dto.getHours() );
        carServiceProcessingRequest.done( dto.getDone() );

        return carServiceProcessingRequest.build();
    }

    private String requestCarVin(CarServiceRequest carServiceRequest) {
        if ( carServiceRequest == null ) {
            return null;
        }
        CarToService car = carServiceRequest.getCar();
        if ( car == null ) {
            return null;
        }
        String vin = car.getVin();
        if ( vin == null ) {
            return null;
        }
        return vin;
    }
}
