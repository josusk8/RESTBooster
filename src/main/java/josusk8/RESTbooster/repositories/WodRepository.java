package josusk8.RESTbooster.repositories;





import java.util.ArrayList;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import josusk8.RESTbooster.models.Wod;



@Repository
public interface WodRepository extends CrudRepository<Wod, Integer> {
	 

	@Transactional
	ArrayList<Wod> findByIdUsuario(Integer user);

	@Transactional
	Optional<Wod> findByIdUsuarioAndIdWod(Integer idU, Integer id);
	
	@Transactional
	Optional<Wod> deleteByIdUsuarioAndIdWod(Integer idU, Integer id);

}
