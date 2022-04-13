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

import josusk8.RESTbooster.models.RmCleanJerk;
import josusk8.RESTbooster.services.RmCleanJerkService;



@RestController
@RequestMapping("/booster/v1/rm/cleanjerk")
public class RmCleanJerkRESTv1 {
	
	
	@Autowired
	RmCleanJerkService rmCleanJerkService;
	
	
	@GetMapping()
	public ArrayList<RmCleanJerk> findAll(){
		return (ArrayList<RmCleanJerk>) rmCleanJerkService.findAll();
	}
	
	
	@GetMapping (path = "/{idU}")
	public ArrayList<RmCleanJerk>findByIdUsuario(@PathVariable("idU") int idU){
		return this.rmCleanJerkService.findByIdUsuario(idU);
	}
	
	
	@GetMapping (path = "/{idU}/{id}")
	public Optional<RmCleanJerk>findByIdUsuarioAndIdRmCleanJerk(@PathVariable("idU") int idU,@PathVariable("id") int id ){
		return this.rmCleanJerkService.findByIdUsuarioAndIdRmCleanJerk(idU,id);
	}
	
	
	
	@PostMapping 
	public RmCleanJerk save (@RequestBody RmCleanJerk rmCleanJerk) {
		return this.rmCleanJerkService.save(rmCleanJerk);
	}
	
	@DeleteMapping (path = "/{idU}/{id}")
	public ResponseEntity<?> ddeleteByIdUsuarioAndIdRmCleanJerk(@PathVariable("idU") int idU,@PathVariable("id") int id ){
		Optional<RmCleanJerk> opt = rmCleanJerkService.findById(id);
		if(opt.isPresent()) {
			rmCleanJerkService.deleteByIdUsuarioAndIdRmCleanJerk(idU, id);
			return ResponseEntity.ok("rmCleanJerk borrado");	
		}else {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("el id del registro no existe");
		}

	}
	
	@PutMapping("/{id}")
	public ResponseEntity<?> update(@PathVariable Integer id, @RequestBody RmCleanJerk rmCleanJerk){
		Optional<RmCleanJerk> opt = rmCleanJerkService.findById(id);
		if(opt.isPresent()) {
			RmCleanJerk u = opt.get();
			u.setPeso(rmCleanJerk.getPeso());
			return ResponseEntity.ok(rmCleanJerkService.save(u));
			
		}else {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("el id del registro no existe");
		}

	}	
		
}

	
	

