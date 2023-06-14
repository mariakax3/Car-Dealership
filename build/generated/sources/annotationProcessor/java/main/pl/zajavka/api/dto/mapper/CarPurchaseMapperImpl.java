package pl.zajavka.api.dto.mapper;

import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;
import pl.zajavka.api.dto.CarPurchaseDTO;
import pl.zajavka.domain.CarPurchaseRequest;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-06-14T14:45:05+0200",
    comments = "version: 1.5.3.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-7.5.1.jar, environment: Java 17.0.1 (Oracle Corporation)"
)
@Component
public class CarPurchaseMapperImpl implements CarPurchaseMapper {

    @Override
    public CarPurchaseRequest map(CarPurchaseDTO dto) {
        if ( dto == null ) {
            return null;
        }

        CarPurchaseRequest.CarPurchaseRequestBuilder carPurchaseRequest = CarPurchaseRequest.builder();

        carPurchaseRequest.existingCustomerEmail( dto.getExistingCustomerEmail() );
        carPurchaseRequest.customerName( dto.getCustomerName() );
        carPurchaseRequest.customerSurname( dto.getCustomerSurname() );
        carPurchaseRequest.customerPhone( dto.getCustomerPhone() );
        carPurchaseRequest.customerEmail( dto.getCustomerEmail() );
        carPurchaseRequest.customerAddressCountry( dto.getCustomerAddressCountry() );
        carPurchaseRequest.customerAddressCity( dto.getCustomerAddressCity() );
        carPurchaseRequest.customerAddressPostalCode( dto.getCustomerAddressPostalCode() );
        carPurchaseRequest.customerAddressStreet( dto.getCustomerAddressStreet() );
        carPurchaseRequest.carVin( dto.getCarVin() );
        carPurchaseRequest.salesmanPesel( dto.getSalesmanPesel() );

        return carPurchaseRequest.build();
    }
}
