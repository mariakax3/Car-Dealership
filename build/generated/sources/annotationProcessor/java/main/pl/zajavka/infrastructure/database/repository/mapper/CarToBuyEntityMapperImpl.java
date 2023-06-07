package pl.zajavka.infrastructure.database.repository.mapper;

import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;
import pl.zajavka.domain.CarToBuy;
import pl.zajavka.infrastructure.database.entity.CarToBuyEntity;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-06-06T23:12:12+0200",
    comments = "version: 1.5.3.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-7.5.1.jar, environment: Java 17.0.1 (Oracle Corporation)"
)
@Component
public class CarToBuyEntityMapperImpl implements CarToBuyEntityMapper {

    @Override
    public CarToBuy mapFromEntity(CarToBuyEntity entity) {
        if ( entity == null ) {
            return null;
        }

        CarToBuy.CarToBuyBuilder carToBuy = CarToBuy.builder();

        carToBuy.carToBuyId( entity.getCarToBuyId() );
        carToBuy.vin( entity.getVin() );
        carToBuy.brand( entity.getBrand() );
        carToBuy.model( entity.getModel() );
        carToBuy.year( entity.getYear() );
        carToBuy.color( entity.getColor() );
        carToBuy.price( entity.getPrice() );

        return carToBuy.build();
    }
}
