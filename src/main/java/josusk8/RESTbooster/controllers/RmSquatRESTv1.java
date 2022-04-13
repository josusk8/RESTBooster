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

import josusk8.RESTbooster.models.RmSquat;
import josusk8.RESTbooster.services.RmSquatService;



@RestController
@RequestMapping("/booster/v1/rm/squat")
public class RmSquatRESTv1 {
	
	
	@Autowired
	RmSquatService rmSquatService;
	
	
	@GetMapping()
	public ArrayList<RmSquat> findAll(){
		return (ArrayList<RmSquat>) rmSquatService.findAll();
	}
	
	
	@GetMapping (path = "/{idU}")
	public ArrayList<RmSquat>findByIdUsuario(@PathVariable("idU") int idU){
		return this.rmSquatService.findByIdUsuario(idU);
	}
	
	
	@GetMapping (path = "/{idU}/{id}")
	public Optional<RmSquat>findByIdUsuarioAndIdRmSquat(@PathVariable("idU") int idU,@PathVariable("id") int id ){
		return this.rmSquatService.findByIdUsuarioAndIdRmSquat(idU,id);
	}
	
	
	
	@PostMapping 
	public RmSquat save (@RequestBody RmSquat rmSquat) {
		return this.rmSquatService.save(rmSquat);
	}
	
	@DeleteMapping (path = "/{idU}/{id}")
	public ResponseEntity<?> deleteByIdUsuarioAndIdRmSquat(@PathVariable("idU") int idU,@PathVariable("id") int id ){
		Optional<RmSquat> opt = rmSquatService.findById(id);
		if(opt.isPresent()) {
			rmSquatService.deleteByIdUsuarioAndIdRmSquat(idU, id);
			return ResponseEntity.ok("rmSquat borrado");	
		}else {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("el id del registro no existe");
		}

	}
	
	@PutMapping("/{id}")
	public ResponseEntity<?> update(@PathVariable Integer id, @RequestBody RmSquat rmSquat){
		Optional<RmSquat> opt = rmSquatService.findById(id);
		if(opt.isPresent()) {
			RmSquat u = opt.get();
			u.setPeso(rmSquat.getPeso());
			return ResponseEntity.ok(rmSquatService.save(u));
			
		}else {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("el id del registro no existe");
		}

	}	
		
}

	
	

