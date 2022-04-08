package josusk8.RESTbooster.repositories;





import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import josusk8.RESTbooster.models.Usuario;



@Repository
public interface UsuarioRepository extends CrudRepository<Usuario, Integer> {
	 

}
