package josusk8.RESTbooster.repositories;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import josusk8.RESTbooster.models.VarMovimientoSecundario;




@Repository
public interface VarMovimientoSecundarioRepository extends CrudRepository<VarMovimientoSecundario, Integer> {
	 
	
	@Transactional
	ArrayList<VarMovimientoSecundario> findByIdWod(Integer user);

	
	@Transactional
	Optional<VarMovimientoSecundario> findByIdWodAndIdVarmovimientosecundario(Integer idU, Integer id);

	@Transactional
	Optional<VarMovimientoSecundario> deleteByIdWodAndIdVarmovimientosecundario(Integer idU, Integer id);
}
