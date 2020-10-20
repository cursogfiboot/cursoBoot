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
	public Iterable<Estado> getEstadosByTipo(int tipo) {
		// TODO Auto-generated method stub
		return getRepository().getEstadoByTipo(tipo);
	}

	public EstadosCrudRepository getRepository() {
		return repository;
	}

	public void setRepository(EstadosCrudRepository repository) {
		this.repository = repository;
	}

	@Override
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
		getRepository().deleteById(id);
	}

	@Override
	public Iterable<Estado> findAll() {
		// TODO Auto-generated method stub
		return getRepository().findAll();
	}

	@Override
	public Optional<Estado> findById(Integer id) {
		// TODO Auto-generated method stub
		return getRepository().findById(id);
	}

	@Override
	public Estado save(Estado estado) {
		// TODO Auto-generated method stub
		return getRepository().save(estado);
	}

}
