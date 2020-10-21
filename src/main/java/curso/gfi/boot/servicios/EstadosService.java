package curso.gfi.boot.servicios;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import curso.gfi.boot.entidades.Estado;
import curso.gfi.boot.entidades.UsuarioEstado;
import curso.gfi.boot.repositorios.EstadoCrudRepository;

@Service
public class EstadosService implements EstadosServiceInterface {

	
	
	@Autowired
	private EstadoCrudRepository repositoryEstados;
	
	@Override
	public UsuarioEstado save(UsuarioEstado estado) {
		return getRepositoryEstados().save(estado);
	}

	@Override
	public Optional<UsuarioEstado> findById(Integer id) {
		return getRepositoryEstados().findById(id);
	}

	@Override
	public Iterable<UsuarioEstado> findAll() {
		return getRepositoryEstados().findAll();
	}

	@Override
	public void delete(UsuarioEstado entity) {
		getRepositoryEstados().delete(entity);

	}

	@Override
	public void deleteAll() {

	}

	public EstadoCrudRepository getRepositoryEstados() {
		return repositoryEstados;
	}

	public void setRepositoryEstados(EstadoCrudRepository repositoryEstados) {
		this.repositoryEstados = repositoryEstados;
	}

	@Override
	public void deleteById(Integer id) {
		getRepositoryEstados().deleteById(id);
		
	}
	
	
	

}
