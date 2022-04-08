package josusk8.RESTbooster.services;



import java.util.Optional;

import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.data.domain.Page;

public interface GenericServiceInterface<T, E> {
	Iterable<T> findAll();
	Page<T> findAll (Pageable page);
	Optional<T> findById(E id);
	T save (T objeto);
	void deleteById(E id);
	void delete(T entity);

}
