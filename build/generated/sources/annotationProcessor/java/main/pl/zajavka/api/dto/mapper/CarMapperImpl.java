package pl.zajavka.api.dto.mapper;

import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;
import pl.zajavka.api.dto.CarToBuyDTO;
import pl.zajavka.domain.CarToBuy;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-06-04T22:44:10+0200",
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
}
