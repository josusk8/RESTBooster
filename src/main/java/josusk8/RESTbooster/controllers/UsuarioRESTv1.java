package josusk8.RESTbooster.controllers;



import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import josusk8.RESTbooster.models.Usuario;
import josusk8.RESTbooster.services.UsuarioService;



@RestController
@RequestMapping("/booster/v1/usuario")
public class UsuarioRESTv1 {
	
	
	@Autowired
	UsuarioService usuarioService;
	
	
	@GetMapping()
	public ArrayList<Usuario> findAll(){
		return (ArrayList<Usuario>) usuarioService.findAll();
	}
	
	@GetMapping (path = "/{id}")
	public Optional<Usuario>findById(@PathVariable("id") int id){
		return this.usuarioService.findById(id);
	}
	
	
	
	@PostMapping 
	public Usuario save (@RequestBody Usuario usuario) {
		return this.usuarioService.save(usuario);
	}
	
	@DeleteMapping (path = "/{id}")
	public ResponseEntity<?> delete(@PathVariable Integer id){
		Optional<Usuario> opt = usuarioService.findById(id);
		if(opt.isPresent()) {
			usuarioService.deleteById(id);
			return ResponseEntity.ok("usuario borrado");	
		}else {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("el id del registro no existe");
		}

	}
	
	@PutMapping("/{id}")
	public ResponseEntity<?> update(@PathVariable Integer id, @RequestBody Usuario usuario){
		Optional<Usuario> opt = usuarioService.findById(id);
		if(opt.isPresent()) {
			Usuario u = opt.get();
			u.setNombre(usuario.getNombre());
			return ResponseEntity.ok(usuarioService.save(u));
			
		}else {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("el id del registro no existe");
		}

	}	
		
}

	
	

