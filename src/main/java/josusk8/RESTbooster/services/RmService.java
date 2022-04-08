package josusk8.RESTbooster.services;



import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import josusk8.RESTbooster.models.Rm;
import josusk8.RESTbooster.repositories.RmRepository;




@Service
public class RmService implements GenericServiceInterface<Rm, Integer> {

	
	@Autowired
	RmRepository rmRepository;
	
/*	
	public ArrayList<Rm> findByFkidusuario( Integer user){
		return rmRepository.findByFkidusuario(user);
		
	}
	
	public Optional<Rm> findByfkidusuarioAndidsquat( Integer idU, Integer id){
		return rmRepository.findByFkidusuarioAndIdsquat(idU, id);
		
	}
	
	*/
	
	
	
	@Override
	public Iterable<Rm> findAll() {
		
		return rmRepository.findAll();
	}
	

	@Override
	public Page<Rm> findAll(Pageable page) {
		
		return null;
	}

	@Override
	public Optional<Rm> findById(Integer id) {
		
		return rmRepository.findById(id);
	}

	@Override
	public Rm save(Rm objeto) {
		
		return rmRepository.save(objeto);
	}

	@Override
	public void deleteById(Integer id) {
		
		rmRepository.deleteById(id);
		
	}

	@Override
	public void delete(Rm entity) {
	
		rmRepository.delete(entity);
		
	}

}
