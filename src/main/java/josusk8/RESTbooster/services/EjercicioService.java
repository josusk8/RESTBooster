package josusk8.RESTbooster.services;



import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import josusk8.RESTbooster.models.Ejercicio;
import josusk8.RESTbooster.repositories.EjercicioRepository;





@Service
public class EjercicioService implements GenericServiceInterface<Ejercicio, Integer> {

	
	@Autowired
	EjercicioRepository ejercicioRepository;
	
/*	
	public ArrayList<Ejercicio> findByFkidusuario( Integer user){
		return ejercicioRepository.findByFkidusuario(user);
		
	}
	
	public Optional<Ejercicio> findByfkidusuarioAndidsquat( Integer idU, Integer id){
		return ejercicioRepository.findByFkidusuarioAndIdsquat(idU, id);
		
	}
	
	*/
	
	
	
	@Override
	public Iterable<Ejercicio> findAll() {
		
		return ejercicioRepository.findAll();
	}
	

	@Override
	public Page<Ejercicio> findAll(Pageable page) {
		
		return null;
	}

	@Override
	public Optional<Ejercicio> findById(Integer id) {
		
		return ejercicioRepository.findById(id);
	}

	@Override
	public Ejercicio save(Ejercicio objeto) {
		
		return ejercicioRepository.save(objeto);
	}

	@Override
	public void deleteById(Integer id) {
		
		ejercicioRepository.deleteById(id);
		
	}

	@Override
	public void delete(Ejercicio entity) {
	
		ejercicioRepository.delete(entity);
		
	}

}
