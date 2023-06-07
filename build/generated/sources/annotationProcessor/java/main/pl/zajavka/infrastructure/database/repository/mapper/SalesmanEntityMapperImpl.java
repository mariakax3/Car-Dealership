package pl.zajavka.infrastructure.database.repository.mapper;

import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;
import pl.zajavka.domain.Salesman;
import pl.zajavka.infrastructure.database.entity.SalesmanEntity;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-06-06T23:12:12+0200",
    comments = "version: 1.5.3.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-7.5.1.jar, environment: Java 17.0.1 (Oracle Corporation)"
)
@Component
public class SalesmanEntityMapperImpl implements SalesmanEntityMapper {

    @Override
    public Salesman mapFromEntity(SalesmanEntity entity) {
        if ( entity == null ) {
            return null;
        }

        Salesman.SalesmanBuilder salesman = Salesman.builder();

        salesman.salesmanId( entity.getSalesmanId() );
        salesman.name( entity.getName() );
        salesman.surname( entity.getSurname() );
        salesman.pesel( entity.getPesel() );

        return salesman.build();
    }
}
