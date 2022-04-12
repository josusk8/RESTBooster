package josusk8.RESTbooster.services;



import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import josusk8.RESTbooster.models.VarMovimientoSecundario;
import josusk8.RESTbooster.repositories.VarMovimientoSecundarioRepository;



@Service
public class VarMovimientoSecundarioService implements GenericServiceInterface<VarMovimientoSecundario, Integer> {

	
	@Autowired
	VarMovimientoSecundarioRepository varMovimientoSecundarioRepository;
	
	
	
	public ArrayList<VarMovimientoSecundario> findByIdWod(Integer idWod){
		return varMovimientoSecundarioRepository.findByIdWod(idWod);
		
	}
	

	public Optional<VarMovimientoSecundario> findByIdWodAndIdVarmovimientosecundario( Integer idWod, Integer id){
		return varMovimientoSecundarioRepository.findByIdWodAndIdVarmovimientosecundario(idWod, id);
		
	}
	
	
	public Optional<VarMovimientoSecundario> deleteByIdWodAndIdVarmovimientosecundario( Integer idWod, Integer id){
		return varMovimientoSecundarioRepository.deleteByIdWodAndIdVarmovimientosecundario(idWod, id);
		
	}
	
	
	
	@Override
	public Iterable<VarMovimientoSecundario> findAll() {
		
		return varMovimientoSecundarioRepository.findAll();
	}

	@Override
	public Page<VarMovimientoSecundario> findAll(Pageable page) {
		
		return null;
	}

	@Override
	public Optional<VarMovimientoSecundario> findById(Integer id) {
		
		return varMovimientoSecundarioRepository.findById(id);
	}

	@Override
	public VarMovimientoSecundario save(VarMovimientoSecundario objeto) {
		
		return varMovimientoSecundarioRepository.save(objeto);
	}

	@Override
	public void deleteById(Integer id) {
		
		varMovimientoSecundarioRepository.deleteById(id);
		
	}

	@Override
	public void delete(VarMovimientoSecundario entity) {
	
		varMovimientoSecundarioRepository.delete(entity);
		
	}

}
