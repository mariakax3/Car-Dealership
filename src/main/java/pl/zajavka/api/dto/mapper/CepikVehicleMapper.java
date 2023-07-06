package pl.zajavka.api.dto.mapper;

import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;
import pl.zajavka.api.dto.CepikVehicleDTO;
import pl.zajavka.domain.CepikVehicle;

@Component
@Mapper(componentModel = "spring")
public interface CepikVehicleMapper {

    CepikVehicleDTO map(CepikVehicle cepikVehicle);
}
