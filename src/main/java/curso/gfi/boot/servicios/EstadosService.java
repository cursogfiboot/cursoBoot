package curso.gfi.boot.servicios;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import curso.gfi.boot.entidades.Estado;
import curso.gfi.boot.repositorios.EstadoCrudRepository;

@Service
public class EstadosService implements EstadosServiceInterface {

	
	
	@Autowired
	private EstadoCrudRepository repository;
	
	@Override
	public Estado save(Estado estado) {
		return null;
	}

	@Override
	public Optional<Estado> findById(Integer id) {
		return null;
	}

	@Override
	public Iterable<Estado> findAll() {
		return null;
	}

	@Override
	public void delete(Estado entity) {

	}

	@Override
	public void deleteAll() {

	}
	
	
	public EstadoCrudRepository getRepository() {
		return repository;
	}

	public void setRepository(EstadoCrudRepository repository) {
		this.repository = repository;
	}

}
