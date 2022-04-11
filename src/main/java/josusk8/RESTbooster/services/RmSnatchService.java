package josusk8.RESTbooster.services;



import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import josusk8.RESTbooster.models.RmSnatch;
import josusk8.RESTbooster.repositories.RmSnatchRepository;



@Service
public class RmSnatchService implements GenericServiceInterface<RmSnatch, Integer> {

	
	@Autowired
	RmSnatchRepository rmSnatchRepository;
	
	
	
	public ArrayList<RmSnatch> findByIdUsuario(Integer user){
		return rmSnatchRepository.findByIdUsuarioOrderByPesoDesc(user);
		
	}
	

	public Optional<RmSnatch> findByIdUsuarioAndIdRmSnatch( Integer idU, Integer id){
		return rmSnatchRepository.findByIdUsuarioAndIdRmSnatch(idU, id);
		
	}
	
	public Optional<RmSnatch> deleteByIdUsuarioAndIdRmSnatch( Integer idU, Integer id){
		return rmSnatchRepository.deleteByIdUsuarioAndIdRmSnatch(idU, id);
		
	}
	
	
	@Override
	public Iterable<RmSnatch> findAll() {
		
		return rmSnatchRepository.findAll();
	}

	@Override
	public Page<RmSnatch> findAll(Pageable page) {
		
		return null;
	}

	@Override
	public Optional<RmSnatch> findById(Integer id) {
		
		return rmSnatchRepository.findById(id);
	}

	@Override
	public RmSnatch save(RmSnatch objeto) {
		
		return rmSnatchRepository.save(objeto);
	}

	@Override
	public void deleteById(Integer id) {
		
		rmSnatchRepository.deleteById(id);
		
	}

	@Override
	public void delete(RmSnatch entity) {
	
		rmSnatchRepository.delete(entity);
		
	}

}
