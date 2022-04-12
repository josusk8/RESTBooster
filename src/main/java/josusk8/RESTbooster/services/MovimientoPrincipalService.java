package josusk8.RESTbooster.services;



import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import josusk8.RESTbooster.models.MovimientoPrincipal;
import josusk8.RESTbooster.repositories.MovimientoPrincipalRepository;



@Service
public class MovimientoPrincipalService implements GenericServiceInterface<MovimientoPrincipal, Integer> {

	
	@Autowired
	MovimientoPrincipalRepository movimientoPrincipalRepository;
	
	
	
	public ArrayList<MovimientoPrincipal> findByIdWod(Integer idWod){
		return movimientoPrincipalRepository.findByIdWod(idWod);
		
	}
	

	public Optional<MovimientoPrincipal> findByIdWodAndIdMovimientoprincipal( Integer idWod, Integer id){
		return movimientoPrincipalRepository.findByIdWodAndIdMovimientoprincipal(idWod, id);
		
	}
	
	
	public Optional<MovimientoPrincipal> deleteByIdWodAndIdMovimientoprincipal( Integer idWod, Integer id){
		return movimientoPrincipalRepository.deleteByIdWodAndIdMovimientoprincipal(idWod, id);
		
	}
	
	
	
	@Override
	public Iterable<MovimientoPrincipal> findAll() {
		
		return movimientoPrincipalRepository.findAll();
	}

	@Override
	public Page<MovimientoPrincipal> findAll(Pageable page) {
		
		return null;
	}

	@Override
	public Optional<MovimientoPrincipal> findById(Integer id) {
		
		return movimientoPrincipalRepository.findById(id);
	}

	@Override
	public MovimientoPrincipal save(MovimientoPrincipal objeto) {
		
		return movimientoPrincipalRepository.save(objeto);
	}

	@Override
	public void deleteById(Integer id) {
		
		movimientoPrincipalRepository.deleteById(id);
		
	}

	@Override
	public void delete(MovimientoPrincipal entity) {
	
		movimientoPrincipalRepository.delete(entity);
		
	}

}
