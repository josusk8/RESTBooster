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

import josusk8.RESTbooster.models.Squat;
import josusk8.RESTbooster.services.SquatService;



@RestController
@RequestMapping("/booster/v1/Squat")
public class SquatRESTv1 {
	
	
	@Autowired
	SquatService squatService;
	
	
	@GetMapping()
	public ArrayList<Squat> findAll(){
		return (ArrayList<Squat>) squatService.findAll();
	}
	
	
	@GetMapping (path = "/{idWod}")
	public ArrayList<Squat>findByIdWod(@PathVariable("idWod") int idWod){
		return this.squatService.findByIdWod(idWod);
	}
	
	
	@GetMapping (path = "/{idWod}/{id}")
	public Optional<Squat>findByIdWodAndIdSquat(@PathVariable("idWod") int idWod,@PathVariable("id") int id ){
		return this.squatService.findByIdWodAndIdSquat(idWod,id);
	}
	
	
	
	@PostMapping 
	public Squat save (@RequestBody Squat Squat) {
		return this.squatService.save(Squat);
	}
	
	@DeleteMapping (path = "/{idWod}/{id}")
	public ResponseEntity<?> deleteByIdWodAndIdSquat(@PathVariable("idWod") int idWod,@PathVariable("id") int id ){
		Optional<Squat> opt = squatService.findById(id);
		if(opt.isPresent()) {
			squatService.deleteByIdWodAndIdSquat(idWod, id);
			return ResponseEntity.ok("Squat borrado");	
		}else {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("el id del registro no existe");
		}

	}

	/*
	@PutMapping("/{id}")
	public ResponseEntity<?> update(@PathVariable Integer id, @RequestBody Squat Squat){
		Optional<Squat> opt = squatService.findById(id);
		if(opt.isPresent()) {
			Squat u = opt.get();
			u.setPeso(Squat.getPeso());
			return ResponseEntity.ok(squatService.save(u));
			
		}else {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("el id del registro no existe");
		}

	}	*/
		
}

	
	

