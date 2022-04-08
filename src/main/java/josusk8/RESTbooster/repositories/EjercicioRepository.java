package josusk8.RESTbooster.repositories;





import java.util.ArrayList;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import josusk8.RESTbooster.models.Ejercicio;




@Repository
public interface EjercicioRepository extends CrudRepository<Ejercicio, Integer> {
	
	/*
	@Transactional
	ArrayList<Rm> findByFkidusuario(Integer user);
	
	@Transactional
	Optional<Rm> findByFkidusuarioAndIdsquat(Integer idU, Integer id);
*/
}
