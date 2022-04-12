package josusk8.RESTbooster.repositories;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import josusk8.RESTbooster.models.MovimientoPrincipal;




@Repository
public interface MovimientoPrincipalRepository extends CrudRepository<MovimientoPrincipal, Integer> {
	 
	
	@Transactional
	ArrayList<MovimientoPrincipal> findByIdWod(Integer user);

	
	@Transactional
	Optional<MovimientoPrincipal> findByIdWodAndIdMovimientoprincipal(Integer idU, Integer id);

	@Transactional
	Optional<MovimientoPrincipal> deleteByIdWodAndIdMovimientoprincipal(Integer idU, Integer id);
}
