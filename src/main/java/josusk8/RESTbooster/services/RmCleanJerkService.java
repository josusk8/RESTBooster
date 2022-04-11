package josusk8.RESTbooster.services;



import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import josusk8.RESTbooster.models.RmCleanJerk;
import josusk8.RESTbooster.repositories.RmCleanJerkRepository;



@Service
public class RmCleanJerkService implements GenericServiceInterface<RmCleanJerk, Integer> {

	
	@Autowired
	RmCleanJerkRepository rmCleanJerkRepository;
	
	
	
	public ArrayList<RmCleanJerk> findByIdUsuario(Integer user){
		return rmCleanJerkRepository.findByIdUsuarioOrderByPesoDesc(user);
		
	}
	

	public Optional<RmCleanJerk> findByIdUsuarioAndIdRmCleanJerk( Integer idU, Integer id){
		return rmCleanJerkRepository.findByIdUsuarioAndIdRmCleanJerk(idU, id);
		
	}
	
	public Optional<RmCleanJerk> deleteByIdUsuarioAndIdRmCleanJerk( Integer idU, Integer id){
		return rmCleanJerkRepository.deleteByIdUsuarioAndIdRmCleanJerk(idU, id);
		
	}
	
	
	@Override
	public Iterable<RmCleanJerk> findAll() {
		
		return rmCleanJerkRepository.findAll();
	}

	@Override
	public Page<RmCleanJerk> findAll(Pageable page) {
		
		return null;
	}

	@Override
	public Optional<RmCleanJerk> findById(Integer id) {
		
		return rmCleanJerkRepository.findById(id);
	}

	@Override
	public RmCleanJerk save(RmCleanJerk objeto) {
		
		return rmCleanJerkRepository.save(objeto);
	}

	@Override
	public void deleteById(Integer id) {
		
		rmCleanJerkRepository.deleteById(id);
		
	}

	@Override
	public void delete(RmCleanJerk entity) {
	
		rmCleanJerkRepository.delete(entity);
		
	}

}
