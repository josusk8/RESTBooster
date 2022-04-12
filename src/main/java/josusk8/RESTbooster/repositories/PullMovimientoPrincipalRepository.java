package josusk8.RESTbooster.repositories;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import josusk8.RESTbooster.models.PullMovimientoPrincipal;




@Repository
public interface PullMovimientoPrincipalRepository extends CrudRepository<PullMovimientoPrincipal, Integer> {
	 
	
	@Transactional
	ArrayList<PullMovimientoPrincipal> findByIdWod(Integer user);

	
	@Transactional
	Optional<PullMovimientoPrincipal> findByIdWodAndIdPullmovimientoprincipal(Integer idU, Integer id);

	@Transactional
	Optional<PullMovimientoPrincipal> deleteByIdWodAndIdPullmovimientoprincipal(Integer idU, Integer id);
}
