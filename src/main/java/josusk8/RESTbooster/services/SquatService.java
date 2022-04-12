package josusk8.RESTbooster.services;



import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import josusk8.RESTbooster.models.Squat;
import josusk8.RESTbooster.repositories.SquatRepository;



@Service
public class SquatService implements GenericServiceInterface<Squat, Integer> {

	
	@Autowired
	SquatRepository squatRepository;
	
	
	
	public ArrayList<Squat> findByIdWod(Integer idWod){
		return squatRepository.findByIdWod(idWod);
		
	}
	

	public Optional<Squat> findByIdWodAndIdSquat( Integer idWod, Integer id){
		return squatRepository.findByIdWodAndIdSquat(idWod, id);
		
	}
	
	
	public Optional<Squat> deleteByIdWodAndIdSquat( Integer idWod, Integer id){
		return squatRepository.deleteByIdWodAndIdSquat(idWod, id);
		
	}
	
	
	
	@Override
	public Iterable<Squat> findAll() {
		
		return squatRepository.findAll();
	}

	@Override
	public Page<Squat> findAll(Pageable page) {
		
		return null;
	}

	@Override
	public Optional<Squat> findById(Integer id) {
		
		return squatRepository.findById(id);
	}

	@Override
	public Squat save(Squat objeto) {
		
		return squatRepository.save(objeto);
	}

	@Override
	public void deleteById(Integer id) {
		
		squatRepository.deleteById(id);
		
	}

	@Override
	public void delete(Squat entity) {
	
		squatRepository.delete(entity);
		
	}

}
