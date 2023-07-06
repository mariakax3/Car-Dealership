package pl.zajavka.api.dto.mapper;

import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;
import pl.zajavka.api.dto.MechanicDTO;
import pl.zajavka.domain.Mechanic;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-07-06T08:09:39+0200",
    comments = "version: 1.5.3.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-7.5.1.jar, environment: Java 17.0.1 (Oracle Corporation)"
)
@Component
public class MechanicMapperImpl implements MechanicMapper {

    @Override
    public MechanicDTO map(Mechanic mechanic) {
        if ( mechanic == null ) {
            return null;
        }

        MechanicDTO.MechanicDTOBuilder mechanicDTO = MechanicDTO.builder();

        mechanicDTO.name( mechanic.getName() );
        mechanicDTO.surname( mechanic.getSurname() );
        mechanicDTO.pesel( mechanic.getPesel() );

        return mechanicDTO.build();
    }
}
