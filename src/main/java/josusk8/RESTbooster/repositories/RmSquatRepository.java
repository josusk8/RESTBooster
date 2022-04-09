package josusk8.RESTbooster.repositories;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import josusk8.RESTbooster.models.RmSquat;



@Repository
public interface RmSquatRepository extends CrudRepository<RmSquat, Integer> {
	 
	
	@Transactional
	ArrayList<RmSquat> findByIdUsuario(Integer user);

	
	@Transactional
	Optional<RmSquat> findByIdUsuarioAndIdRmSquat(Integer idU, Integer id);


}
