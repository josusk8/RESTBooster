package josusk8.RESTbooster.repositories;





import java.util.ArrayList;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import josusk8.RESTbooster.models.Rm;




@Repository
public interface RmRepository extends CrudRepository<Rm, Integer> {
	
	/*
	@Transactional
	ArrayList<Rm> findByFkidusuario(Integer user);
	
	@Transactional
	Optional<Rm> findByFkidusuarioAndIdsquat(Integer idU, Integer id);
*/
}
