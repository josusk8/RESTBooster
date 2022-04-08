package josusk8.RESTbooster.repositories;





import java.util.ArrayList;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import josusk8.RESTbooster.models.Wod;




@Repository
public interface WodRepository extends CrudRepository<Wod, Integer> {
	
	/*
	@Transactional
	ArrayList<Rm> findByFkidusuario(Integer user);
	
	@Transactional
	Optional<Rm> findByFkidusuarioAndIdsquat(Integer idU, Integer id);
*/
}
