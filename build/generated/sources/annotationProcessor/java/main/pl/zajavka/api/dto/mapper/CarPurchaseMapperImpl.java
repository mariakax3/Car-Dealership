package pl.zajavka.api.dto.mapper;

import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;
import pl.zajavka.api.dto.CarPurchaseDTO;
import pl.zajavka.domain.CarPurchaseRequestInputData;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-06-04T14:40:11+0200",
    comments = "version: 1.5.3.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-7.5.1.jar, environment: Java 17.0.1 (Oracle Corporation)"
)
@Component
public class CarPurchaseMapperImpl implements CarPurchaseMapper {

    @Override
    public CarPurchaseRequestInputData map(CarPurchaseDTO dto) {
        if ( dto == null ) {
            return null;
        }

        CarPurchaseRequestInputData.CarPurchaseRequestInputDataBuilder carPurchaseRequestInputData = CarPurchaseRequestInputData.builder();

        carPurchaseRequestInputData.customerName( dto.getCustomerName() );
        carPurchaseRequestInputData.customerSurname( dto.getCustomerSurname() );
        carPurchaseRequestInputData.customerPhone( dto.getCustomerPhone() );
        carPurchaseRequestInputData.customerEmail( dto.getCustomerEmail() );
        carPurchaseRequestInputData.customerAddressCountry( dto.getCustomerAddressCountry() );
        carPurchaseRequestInputData.customerAddressCity( dto.getCustomerAddressCity() );
        carPurchaseRequestInputData.customerAddressPostalCode( dto.getCustomerAddressPostalCode() );
        carPurchaseRequestInputData.customerAddressStreet( dto.getCustomerAddressStreet() );
        carPurchaseRequestInputData.carVin( dto.getCarVin() );
        carPurchaseRequestInputData.salesmanPesel( dto.getSalesmanPesel() );

        return carPurchaseRequestInputData.build();
    }
}
