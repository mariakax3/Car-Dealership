package pl.zajavka.api.dto.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Named;
import org.springframework.stereotype.Component;

import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.Optional;

@Component
@Mapper(componentModel = "spring")
public interface OffsetDateTimeMapper {

    DateTimeFormatter DATE_FORMAT = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    @Named("mapOffsetDateTimeToString")
    default String mapOffsetDateTimeToString(OffsetDateTime offsetDateTime) {
        return Optional.ofNullable(offsetDateTime)
                .map(odt -> odt.atZoneSameInstant(ZoneOffset.UTC))
                .map(odt -> odt.format(DATE_FORMAT))
                .orElse(null);
    }
}
