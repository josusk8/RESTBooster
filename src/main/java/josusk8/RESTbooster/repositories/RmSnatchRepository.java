package josusk8.RESTbooster.repositories;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import josusk8.RESTbooster.models.RmSnatch;




@Repository
public interface RmSnatchRepository extends CrudRepository<RmSnatch, Integer> {
	 
	
	@Transactional
	ArrayList<RmSnatch> findByIdUsuarioOrderByPesoDesc(Integer user);
	
	@Transactional
	Optional<RmSnatch> findByIdUsuarioAndIdRmSnatch(Integer idU, Integer id);

	@Transactional
	Optional<RmSnatch> deleteByIdUsuarioAndIdRmSnatch(Integer idU, Integer id);
}
