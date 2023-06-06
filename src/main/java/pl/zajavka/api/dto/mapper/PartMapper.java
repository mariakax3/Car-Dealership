package pl.zajavka.api.dto.mapper;

import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;
import pl.zajavka.api.dto.PartDTO;
import pl.zajavka.domain.Part;

@Component
@Mapper(componentModel = "spring")
public interface PartMapper {

    PartDTO map(Part part);
}
