package josusk8.RESTbooster.services;



import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import josusk8.RESTbooster.models.RmSquat;
import josusk8.RESTbooster.repositories.RmSquatRepository;



@Service
public class RmSquatService implements GenericServiceInterface<RmSquat, Integer> {

	
	@Autowired
	RmSquatRepository rmSquatRepository;
	
	
	
	public ArrayList<RmSquat> findByidUsuario(Integer user){
		return rmSquatRepository.findByidUsuario(user);
		
	}
	
/*
	public Optional<RmSquat> findByidUsuarioAndidRmSquat( Integer idU, Integer id){
		return rmSquatRepository.findByidUsuarioAndidRmSquat(idU, id);
		
	}
	*/
	
	
	@Override
	public Iterable<RmSquat> findAll() {
		
		return rmSquatRepository.findAll();
	}

	@Override
	public Page<RmSquat> findAll(Pageable page) {
		
		return null;
	}

	@Override
	public Optional<RmSquat> findById(Integer id) {
		
		return rmSquatRepository.findById(id);
	}

	@Override
	public RmSquat save(RmSquat objeto) {
		
		return rmSquatRepository.save(objeto);
	}

	@Override
	public void deleteById(Integer id) {
		
		rmSquatRepository.deleteById(id);
		
	}

	@Override
	public void delete(RmSquat entity) {
	
		rmSquatRepository.delete(entity);
		
	}

}
