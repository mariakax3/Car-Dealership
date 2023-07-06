package pl.zajavka.api.dto.mapper;

import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;
import pl.zajavka.api.dto.InvoiceDTO;
import pl.zajavka.domain.Invoice;


@Component
@Mapper(componentModel = "spring")
public interface InvoiceMapper extends OffsetDateTimeMapper {

    InvoiceDTO map(Invoice invoice);
}
