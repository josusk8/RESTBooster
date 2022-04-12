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

import josusk8.RESTbooster.models.VarMovimientoSecundario;
import josusk8.RESTbooster.services.VarMovimientoSecundarioService;



@RestController
@RequestMapping("/booster/v1/VarMovimientoSecundario")
public class VarMovimientoSecundarioRESTv1 {
	
	
	@Autowired
	VarMovimientoSecundarioService varMovimientoSecundarioService;
	
	
	@GetMapping()
	public ArrayList<VarMovimientoSecundario> findAll(){
		return (ArrayList<VarMovimientoSecundario>) varMovimientoSecundarioService.findAll();
	}
	
	
	@GetMapping (path = "/{idWod}")
	public ArrayList<VarMovimientoSecundario>findByIdWod(@PathVariable("idWod") int idWod){
		return this.varMovimientoSecundarioService.findByIdWod(idWod);
	}
	
	
	@GetMapping (path = "/{idWod}/{id}")
	public Optional<VarMovimientoSecundario>findByIdWodAndIdVarmovimientosecundario(@PathVariable("idWod") int idWod,@PathVariable("id") int id ){
		return this.varMovimientoSecundarioService.findByIdWodAndIdVarmovimientosecundario(idWod,id);
	}
	
	
	
	@PostMapping 
	public VarMovimientoSecundario save (@RequestBody VarMovimientoSecundario VarMovimientoSecundario) {
		return this.varMovimientoSecundarioService.save(VarMovimientoSecundario);
	}
	
	@DeleteMapping (path = "/{idWod}/{id}")
	public ResponseEntity<?> deleteByIdWodAndIdVarmovimientosecundario(@PathVariable("idWod") int idWod,@PathVariable("id") int id ){
		Optional<VarMovimientoSecundario> opt = varMovimientoSecundarioService.findById(id);
		if(opt.isPresent()) {
			varMovimientoSecundarioService.deleteByIdWodAndIdVarmovimientosecundario(idWod, id);
			return ResponseEntity.ok("VarMovimientoSecundario borrado");	
		}else {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("el id del registro no existe");
		}

	}

	/*
	@PutMapping("/{id}")
	public ResponseEntity<?> update(@PathVariable Integer id, @RequestBody VarMovimientoSecundario VarMovimientoSecundario){
		Optional<VarMovimientoSecundario> opt = varMovimientoSecundarioService.findById(id);
		if(opt.isPresent()) {
			VarMovimientoSecundario u = opt.get();
			u.setPeso(VarMovimientoSecundario.getPeso());
			return ResponseEntity.ok(varMovimientoSecundarioService.save(u));
			
		}else {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("el id del registro no existe");
		}

	}	*/
		
}

	
	

