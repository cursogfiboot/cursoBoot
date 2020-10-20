package curso.gfi.boot.servicios;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import curso.gfi.boot.entidades.Estado;
import curso.gfi.boot.repositorios.EstadosCrudRepository;

@Service
public class EstadosService implements EstadosServiceInterface {

	@Autowired	
	private EstadosCrudRepository repository;

	@Override
	public Iterable<Estado> findAll() {
		return repository.findAll();
	}

	@Override
	public Optional<Estado> findById(Integer id) {
		return repository.findById(id);
	}
	
	@Override
	public  Estado save(Estado estado) {
		return repository.save(estado);
	}

	@Override
	public void delete(Estado estado) {
	}
	
	public EstadosCrudRepository getRepository() {
		return repository;
	}

	public void setRepository(EstadosCrudRepository repository) {
		this.repository = repository;
	}

	
}
