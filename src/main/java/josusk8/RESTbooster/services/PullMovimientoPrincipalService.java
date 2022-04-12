package josusk8.RESTbooster.services;



import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import josusk8.RESTbooster.models.PullMovimientoPrincipal;
import josusk8.RESTbooster.repositories.PullMovimientoPrincipalRepository;



@Service
public class PullMovimientoPrincipalService implements GenericServiceInterface<PullMovimientoPrincipal, Integer> {

	
	@Autowired
	PullMovimientoPrincipalRepository pullMovimientoPrincipalRepository;
	
	
	
	public ArrayList<PullMovimientoPrincipal> findByIdWod(Integer idWod){
		return pullMovimientoPrincipalRepository.findByIdWod(idWod);
		
	}
	

	public Optional<PullMovimientoPrincipal> findByIdWodAndIdPullmovimientoprincipal( Integer idWod, Integer id){
		return pullMovimientoPrincipalRepository.findByIdWodAndIdPullmovimientoprincipal(idWod, id);
		
	}
	
	
	public Optional<PullMovimientoPrincipal> deleteByIdWodAndIdPullmovimientoprincipal( Integer idWod, Integer id){
		return pullMovimientoPrincipalRepository.deleteByIdWodAndIdPullmovimientoprincipal(idWod, id);
		
	}
	
	
	
	@Override
	public Iterable<PullMovimientoPrincipal> findAll() {
		
		return pullMovimientoPrincipalRepository.findAll();
	}

	@Override
	public Page<PullMovimientoPrincipal> findAll(Pageable page) {
		
		return null;
	}

	@Override
	public Optional<PullMovimientoPrincipal> findById(Integer id) {
		
		return pullMovimientoPrincipalRepository.findById(id);
	}

	@Override
	public PullMovimientoPrincipal save(PullMovimientoPrincipal objeto) {
		
		return pullMovimientoPrincipalRepository.save(objeto);
	}

	@Override
	public void deleteById(Integer id) {
		
		pullMovimientoPrincipalRepository.deleteById(id);
		
	}

	@Override
	public void delete(PullMovimientoPrincipal entity) {
	
		pullMovimientoPrincipalRepository.delete(entity);
		
	}

}
