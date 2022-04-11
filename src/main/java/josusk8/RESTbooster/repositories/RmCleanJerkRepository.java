package josusk8.RESTbooster.repositories;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import josusk8.RESTbooster.models.RmCleanJerk;




@Repository
public interface RmCleanJerkRepository extends CrudRepository<RmCleanJerk, Integer> {
	 
	
	@Transactional
	ArrayList<RmCleanJerk> findByIdUsuarioOrderByPesoDesc(Integer user);

	
	@Transactional
	Optional<RmCleanJerk> findByIdUsuarioAndIdRmCleanJerk(Integer idU, Integer id);

	@Transactional
	Optional<RmCleanJerk> deleteByIdUsuarioAndIdRmCleanJerk(Integer idU, Integer id);
}
