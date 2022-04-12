package josusk8.RESTbooster.repositories;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import josusk8.RESTbooster.models.Squat;




@Repository
public interface SquatRepository extends CrudRepository<Squat, Integer> {
	 
	
	@Transactional
	ArrayList<Squat> findByIdWod(Integer user);

	
	@Transactional
	Optional<Squat> findByIdWodAndIdSquat(Integer idU, Integer id);

	@Transactional
	Optional<Squat> deleteByIdWodAndIdSquat(Integer idU, Integer id);
}
