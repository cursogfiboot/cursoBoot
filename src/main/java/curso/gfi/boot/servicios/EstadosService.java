package curso.gfi.boot.servicios;

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

}
