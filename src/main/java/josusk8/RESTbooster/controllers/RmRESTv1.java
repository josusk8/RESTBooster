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

import josusk8.RESTbooster.models.Rm;
import josusk8.RESTbooster.services.RmService;



@RestController
@RequestMapping("/booster/v1/rm")
public class RmRESTv1 {
	
	
	@Autowired
	RmService rmService;
	
	
	@GetMapping()
	public ArrayList<Rm> findAll(){
		return (ArrayList<Rm>) rmService.findAll();
	}
	
	/*
	
	@GetMapping (path = "/{idU}")
	public ArrayList<Rm>findByIdu(@PathVariable("idU") int idU){
		return this.rmService.findByFkidrm(idU);
	}
	
	@GetMapping (path = "/{idU}/{id}")
	public Optional<Rm>findByFkidrmAndIdsquat(@PathVariable("idU") int idU,@PathVariable("id") int id ){
		return this.rmService.findByfkidrmAndidsquat(idU,id);
	}
	
	*/
	
	@PostMapping 
	public Rm save (@RequestBody Rm rm) {
		return this.rmService.save(rm);
	}
	
	@DeleteMapping (path = "/{id}")
	public ResponseEntity<?> delete(@PathVariable Integer id){
		Optional<Rm> opt = rmService.findById(id);
		if(opt.isPresent()) {
			rmService.deleteById(id);
			return ResponseEntity.ok("rm borrado");	
		}else {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("el id del registro no existe");
		}

	}
	
	@PutMapping("/{id}")
	public ResponseEntity<?> update(@PathVariable Integer id, @RequestBody Rm rm){
		Optional<Rm> opt = rmService.findById(id);
		if(opt.isPresent()) {
			Rm u = opt.get();
			u.setPeso(rm.getPeso());
			return ResponseEntity.ok(rmService.save(u));
			
		}else {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("el id del registro no existe");
		}

	}	
		
}

	
	

