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

import josusk8.RESTbooster.models.PullMovimientoPrincipal;
import josusk8.RESTbooster.services.PullMovimientoPrincipalService;



@RestController
@RequestMapping("/booster/v1/PullMovimientoPrincipal")
public class PullMovimientoPrincipalRESTv1 {
	
	
	@Autowired
	PullMovimientoPrincipalService pullMovimientoPrincipalService;
	
	
	@GetMapping()
	public ArrayList<PullMovimientoPrincipal> findAll(){
		return (ArrayList<PullMovimientoPrincipal>) pullMovimientoPrincipalService.findAll();
	}
	
	
	@GetMapping (path = "/{idWod}")
	public ArrayList<PullMovimientoPrincipal>findByIdWod(@PathVariable("idWod") int idWod){
		return this.pullMovimientoPrincipalService.findByIdWod(idWod);
	}
	
	
	@GetMapping (path = "/{idWod}/{id}")
	public Optional<PullMovimientoPrincipal>findByIdWodAndIdPullmovimientoprincipal(@PathVariable("idWod") int idWod,@PathVariable("id") int id ){
		return this.pullMovimientoPrincipalService.findByIdWodAndIdPullmovimientoprincipal(idWod,id);
	}
	
	
	
	@PostMapping 
	public PullMovimientoPrincipal save (@RequestBody PullMovimientoPrincipal PullMovimientoPrincipal) {
		return this.pullMovimientoPrincipalService.save(PullMovimientoPrincipal);
	}
	
	@DeleteMapping (path = "/{idWod}/{id}")
	public ResponseEntity<?> deleteByIdWodAndIdPullmovimientoprincipal(@PathVariable("idWod") int idWod,@PathVariable("id") int id ){
		Optional<PullMovimientoPrincipal> opt = pullMovimientoPrincipalService.findById(id);
		if(opt.isPresent()) {
			pullMovimientoPrincipalService.deleteByIdWodAndIdPullmovimientoprincipal(idWod, id);
			return ResponseEntity.ok("PullMovimientoPrincipal borrado");	
		}else {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("el id del registro no existe");
		}

	}

	/*
	@PutMapping("/{id}")
	public ResponseEntity<?> update(@PathVariable Integer id, @RequestBody PullMovimientoPrincipal PullMovimientoPrincipal){
		Optional<PullMovimientoPrincipal> opt = pullMovimientoPrincipalService.findById(id);
		if(opt.isPresent()) {
			PullMovimientoPrincipal u = opt.get();
			u.setPeso(PullMovimientoPrincipal.getPeso());
			return ResponseEntity.ok(pullMovimientoPrincipalService.save(u));
			
		}else {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("el id del registro no existe");
		}

	}	*/
		
}

	
	

