package pl.zajavka.business.dao;

import pl.zajavka.domain.Mechanic;

import java.util.List;
import java.util.Optional;

public interface MechanicDAO {

    Optional<Mechanic> findByPesel(String pesel);

    List<Mechanic> findAvailable();
}
