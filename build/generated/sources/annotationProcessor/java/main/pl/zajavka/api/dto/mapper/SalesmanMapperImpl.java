package pl.zajavka.api.dto.mapper;

import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;
import pl.zajavka.api.dto.SalesmanDTO;
import pl.zajavka.domain.Salesman;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-07-06T21:53:45+0200",
    comments = "version: 1.5.3.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-7.5.1.jar, environment: Java 17.0.1 (Oracle Corporation)"
)
@Component
public class SalesmanMapperImpl implements SalesmanMapper {

    @Override
    public SalesmanDTO map(Salesman salesman) {
        if ( salesman == null ) {
            return null;
        }

        SalesmanDTO.SalesmanDTOBuilder salesmanDTO = SalesmanDTO.builder();

        salesmanDTO.name( salesman.getName() );
        salesmanDTO.surname( salesman.getSurname() );
        salesmanDTO.pesel( salesman.getPesel() );

        return salesmanDTO.build();
    }
}
