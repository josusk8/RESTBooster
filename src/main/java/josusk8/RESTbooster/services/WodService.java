package josusk8.RESTbooster.services;



import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import josusk8.RESTbooster.models.Wod;
import josusk8.RESTbooster.repositories.WodRepository;



@Service
public class WodService implements GenericServiceInterface<Wod, Integer> {

	
	@Autowired
	WodRepository wodRepository;
	
	
	
	public ArrayList<Wod> findByIdUsuario(Integer idU){
		return wodRepository.findByIdUsuario(idU);
		
	}
	

	public Optional<Wod> findByIdUsuarioAndIdWod( Integer idU, Integer idWod){
		return wodRepository.findByIdUsuarioAndIdWod(idU, idWod);
		
	}
	
	
	public Optional<Wod> deleteByIdUsuarioAndIdWod( Integer idU, Integer idWod){
		return wodRepository.deleteByIdUsuarioAndIdWod(idU, idWod);
		
	}
	
	
	
	@Override
	public Iterable<Wod> findAll() {
		
		return wodRepository.findAll();
	}

	@Override
	public Page<Wod> findAll(Pageable page) {
		
		return null;
	}

	@Override
	public Optional<Wod> findById(Integer id) {
		
		return wodRepository.findById(id);
	}

	@Override
	public Wod save(Wod objeto) {
		
		return wodRepository.save(objeto);
	}

	@Override
	public void deleteById(Integer id) {
		
		wodRepository.deleteById(id);
		
	}

	@Override
	public void delete(Wod entity) {
	
		wodRepository.delete(entity);
		
	}

}
