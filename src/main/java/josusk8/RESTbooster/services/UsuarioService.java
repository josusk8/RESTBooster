package josusk8.RESTbooster.services;



import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import josusk8.RESTbooster.models.Usuario;
import josusk8.RESTbooster.repositories.UsuarioRepository;



@Service
public class UsuarioService implements GenericServiceInterface<Usuario, Integer> {

	
	@Autowired
	UsuarioRepository usuarioRepository;
	
	@Override
	public Iterable<Usuario> findAll() {
		
		return usuarioRepository.findAll();
	}

	@Override
	public Page<Usuario> findAll(Pageable page) {
		
		return null;
	}

	@Override
	public Optional<Usuario> findById(Integer id) {
		
		return usuarioRepository.findById(id);
	}

	@Override
	public Usuario save(Usuario objeto) {
		
		return usuarioRepository.save(objeto);
	}

	@Override
	public void deleteById(Integer id) {
		
		usuarioRepository.deleteById(id);
		
	}

	@Override
	public void delete(Usuario entity) {
	
		usuarioRepository.delete(entity);
		
	}

}
