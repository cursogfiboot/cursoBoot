package curso.gfi.boot.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import curso.gfi.boot.entidades.Estado;
import curso.gfi.boot.repositorios.EstadoCrudRepository;

@Service
public class EstadosService implements EstadosServiceInterface {

	@Autowired	
	private EstadoCrudRepository repository;
	
	
	@Override
	public Iterable<Estado> getEstadosByTipo(int tipo) {
		// TODO Auto-generated method stub
		return getRepository().getEstadoByTipo(tipo);
	}
	 
	public EstadoCrudRepository getRepository() {
		return repository;
	}

	public void setRepository(EstadoCrudRepository repository) {
		this.repository = repository;
	}

}
