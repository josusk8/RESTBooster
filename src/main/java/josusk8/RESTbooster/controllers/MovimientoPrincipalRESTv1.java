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

import josusk8.RESTbooster.models.MovimientoPrincipal;
import josusk8.RESTbooster.services.MovimientoPrincipalService;



@RestController
@RequestMapping("/booster/v1/MovimientoPrincipal")
public class MovimientoPrincipalRESTv1 {
	
	
	@Autowired
	MovimientoPrincipalService MovimientoPrincipalService;
	
	
	@GetMapping()
	public ArrayList<MovimientoPrincipal> findAll(){
		return (ArrayList<MovimientoPrincipal>) MovimientoPrincipalService.findAll();
	}
	
	
	@GetMapping (path = "/{idWod}")
	public ArrayList<MovimientoPrincipal>findByIdWod(@PathVariable("idWod") int idWod){
		return this.MovimientoPrincipalService.findByIdWod(idWod);
	}
	
	
	@GetMapping (path = "/{idWod}/{id}")
	public Optional<MovimientoPrincipal>findByIdWodAndIdMovimientoprincipal(@PathVariable("idWod") int idWod,@PathVariable("id") int id ){
		return this.MovimientoPrincipalService.findByIdWodAndIdMovimientoprincipal(idWod,id);
	}
	
	
	
	@PostMapping 
	public MovimientoPrincipal save (@RequestBody MovimientoPrincipal MovimientoPrincipal) {
		return this.MovimientoPrincipalService.save(MovimientoPrincipal);
	}
	
	@DeleteMapping (path = "/{idWod}/{id}")
	public ResponseEntity<?> deleteByIdWodAndIdMovimientoprincipal(@PathVariable("idWod") int idWod,@PathVariable("id") int id ){
		Optional<MovimientoPrincipal> opt = MovimientoPrincipalService.findById(id);
		if(opt.isPresent()) {
			MovimientoPrincipalService.deleteByIdWodAndIdMovimientoprincipal(idWod, id);
			return ResponseEntity.ok("MovimientoPrincipal borrado");	
		}else {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("el id del registro no existe");
		}

	}

	/*
	@PutMapping("/{id}")
	public ResponseEntity<?> update(@PathVariable Integer id, @RequestBody MovimientoPrincipal MovimientoPrincipal){
		Optional<MovimientoPrincipal> opt = MovimientoPrincipalService.findById(id);
		if(opt.isPresent()) {
			MovimientoPrincipal u = opt.get();
			u.setPeso(MovimientoPrincipal.getPeso());
			return ResponseEntity.ok(MovimientoPrincipalService.save(u));
			
		}else {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("el id del registro no existe");
		}

	}	*/
		
}

	
	

