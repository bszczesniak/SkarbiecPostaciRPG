package pl.knak.characterSheets.dao;

import org.springframework.data.repository.CrudRepository;
import pl.knak.characterSheets.model.Wolsung;

import java.util.List;

public interface WolsungDao extends CrudRepository<Wolsung, Long>{
    Wolsung findFirstByOwner(String owner);
    List<Wolsung> findByOwner(String owner);
    Wolsung password (String password);

}
