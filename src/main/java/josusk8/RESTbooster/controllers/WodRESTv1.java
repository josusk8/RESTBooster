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
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import josusk8.RESTbooster.models.Wod;
import josusk8.RESTbooster.services.WodService;



@RestController
@RequestMapping("/booster/v1/wod")
public class WodRESTv1 {
	
	
	@Autowired
	WodService wodService;
	
	
	@GetMapping()
	public ArrayList<Wod> findAll(){
		return (ArrayList<Wod>) wodService.findAll();
	}
	
	@PostMapping 
	public Wod save (@RequestBody Wod wod) {
		return this.wodService.save(wod);
	}
	
	
	@GetMapping (path = "/{idU}")
	public ArrayList<Wod>findByIdUsuario(@PathVariable("idU") int idU){
		return this.wodService.findByIdUsuario(idU);
	}
	
	
	@GetMapping (path = "/{idU}/{idWod}")
	public Optional<Wod>findByIdUsuarioAndIdWod(@PathVariable("idU") int idU,@PathVariable("idWod") int idWod ){
		return this.wodService.findByIdUsuarioAndIdWod(idU,idWod);
	}
	
	
	
	@DeleteMapping (path = "/{idU}/{idWod}")
	public ResponseEntity<?> deleteByIdUsuarioAndIdWod(@PathVariable("idU") int idU,@PathVariable("idWod") int idWod ){
		Optional<Wod> opt = wodService.findByIdUsuarioAndIdWod(idU,idWod);
		if(opt.isPresent()) {
			wodService.deleteByIdUsuarioAndIdWod(idU, idWod);
			return ResponseEntity.ok("Wod borrado");	
		}else {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("el id del registro no existe");
		}

	}
	
	/*
	
	@PutMapping("/{id}")
	public ResponseEntity<?> update(@PathVariable Integer id, @RequestBody Wod wod){
		Optional<Wod> opt = wodService.findById(id);
		if(opt.isPresent()) {
			Wod u = opt.get();
			u.setNombre(wod.getNombre());
			return ResponseEntity.ok(wodService.save(u));
			
		}else {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("el id del registro no existe");
		}

	}	
	
    */
}

	
	

