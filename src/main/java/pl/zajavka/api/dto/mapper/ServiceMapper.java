package pl.zajavka.api.dto.mapper;

import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;
import pl.zajavka.api.dto.ServiceDTO;
import pl.zajavka.domain.Service;

@Component
@Mapper(componentModel = "spring")
public interface ServiceMapper {

    ServiceDTO map(Service service);
}
