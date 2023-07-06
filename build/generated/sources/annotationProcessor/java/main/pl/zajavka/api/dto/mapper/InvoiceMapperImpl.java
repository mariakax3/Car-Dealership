package pl.zajavka.api.dto.mapper;

import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;
import pl.zajavka.api.dto.InvoiceDTO;
import pl.zajavka.domain.Invoice;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-07-06T21:53:45+0200",
    comments = "version: 1.5.3.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-7.5.1.jar, environment: Java 17.0.1 (Oracle Corporation)"
)
@Component
public class InvoiceMapperImpl implements InvoiceMapper {

    @Override
    public InvoiceDTO map(Invoice invoice) {
        if ( invoice == null ) {
            return null;
        }

        InvoiceDTO.InvoiceDTOBuilder invoiceDTO = InvoiceDTO.builder();

        invoiceDTO.invoiceNumber( invoice.getInvoiceNumber() );
        invoiceDTO.dateTime( invoice.getDateTime() );

        return invoiceDTO.build();
    }
}
