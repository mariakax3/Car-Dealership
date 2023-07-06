package pl.zajavka.api.dto.mapper;

import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;
import pl.zajavka.api.dto.PartDTO;
import pl.zajavka.domain.Part;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-07-06T20:11:18+0200",
    comments = "version: 1.5.3.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-7.5.1.jar, environment: Java 17.0.1 (Oracle Corporation)"
)
@Component
public class PartMapperImpl implements PartMapper {

    @Override
    public PartDTO map(Part part) {
        if ( part == null ) {
            return null;
        }

        PartDTO.PartDTOBuilder partDTO = PartDTO.builder();

        partDTO.serialNumber( part.getSerialNumber() );
        partDTO.description( part.getDescription() );
        partDTO.price( part.getPrice() );

        return partDTO.build();
    }
}
