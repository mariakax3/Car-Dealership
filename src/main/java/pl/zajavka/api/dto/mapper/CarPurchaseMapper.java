package pl.zajavka.api.dto.mapper;

import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;
import pl.zajavka.api.dto.CarPurchaseDTO;
import pl.zajavka.domain.CarPurchaseRequestInputData;

@Component
@Mapper(componentModel = "spring")
public interface CarPurchaseMapper {

    CarPurchaseRequestInputData map(final CarPurchaseDTO dto);
}
