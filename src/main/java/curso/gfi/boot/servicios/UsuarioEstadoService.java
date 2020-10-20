package curso.gfi.boot.servicios;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import curso.gfi.boot.entidades.UsuarioEstado;
import curso.gfi.boot.repositorios.UsuarioEstadoCrudRepository;

@Service
public class UsuarioEstadoService implements UsuarioEstadoServiceInterface {

	
	@Autowired	
	private UsuarioEstadoCrudRepository repository;
	
	@Override
	public void deleteById(Integer id) {
		getRepository().deleteById(id);
	}

	@Override
	public UsuarioEstado save(UsuarioEstado entity) {
		return getRepository().save(entity);
	}

	@Override
	public Optional<UsuarioEstado> findById(Integer id) {
		return getRepository().findById(id);
	}

	@Override
	public Iterable<UsuarioEstado> findAll() {
		return getRepository().findAll();
	}

	@Override
	public void delete(UsuarioEstado entity) {
		getRepository().delete(entity);
	}

	@Override
	public void deleteAll() {
		getRepository().deleteAll();
	}

	public UsuarioEstadoCrudRepository getRepository() {
		return repository;
	}

	public void setRepository(UsuarioEstadoCrudRepository repository) {
		this.repository = repository;
	}

	

}
