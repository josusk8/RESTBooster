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

import josusk8.RESTbooster.models.RmSnatch;
import josusk8.RESTbooster.services.RmSnatchService;



@RestController
@RequestMapping("/booster/v1/rm/snatch")
public class RmSnatchRESTv1 {
	
	
	@Autowired
	RmSnatchService rmSnatchService;
	
	
	@GetMapping()
	public ArrayList<RmSnatch> findAll(){
		return (ArrayList<RmSnatch>) rmSnatchService.findAll();
	}
	
	
	@GetMapping (path = "/{idU}")
	public ArrayList<RmSnatch>findByIdUsuario(@PathVariable("idU") int idU){
		return this.rmSnatchService.findByIdUsuario(idU);
	}
	
	
	@GetMapping (path = "/{idU}/{id}")
	public Optional<RmSnatch>findByIdUsuarioAndIdRmSnatch(@PathVariable("idU") int idU,@PathVariable("id") int id ){
		return this.rmSnatchService.findByIdUsuarioAndIdRmSnatch(idU,id);
	}
	
	
	
	@PostMapping 
	public RmSnatch save (@RequestBody RmSnatch rmSnatch) {
		return this.rmSnatchService.save(rmSnatch);
	}
	
	@DeleteMapping (path = "/{idU}/{id}")
	public ResponseEntity<?> ddeleteByIdUsuarioAndIdRmSnatch(@PathVariable("idU") int idU,@PathVariable("id") int id ){
		Optional<RmSnatch> opt = rmSnatchService.findById(id);
		if(opt.isPresent()) {
			rmSnatchService.deleteByIdUsuarioAndIdRmSnatch(idU, id);
			return ResponseEntity.ok("rmSnatch borrado");	
		}else {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("el id del registro no existe");
		}

	}
	
	@PutMapping("/{id}")
	public ResponseEntity<?> update(@PathVariable Integer id, @RequestBody RmSnatch rmSnatch){
		Optional<RmSnatch> opt = rmSnatchService.findById(id);
		if(opt.isPresent()) {
			RmSnatch u = opt.get();
			u.setPeso(rmSnatch.getPeso());
			return ResponseEntity.ok(rmSnatchService.save(u));
			
		}else {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("el id del registro no existe");
		}

	}	
		
}

	
	

