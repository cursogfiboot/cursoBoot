package curso.gfi.boot.servicios;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import curso.gfi.boot.entidades.UsuarioEstado;
import curso.gfi.boot.repositorios.UsuarioEstadoCrudRepository;

@Service
public class UsuarioEstadoService implements UsuarioEstadoServiceInterface {

	
	
	@Autowired
	private UsuarioEstadoCrudRepository repositoryUsuarioEstado;
	
	@Override
	public UsuarioEstado save(UsuarioEstado usuarioEstado) {
		return getRepositoryUsuarioEstado().save(usuarioEstado);
	}

	@Override
	public Optional<UsuarioEstado> findById(Integer id) {
		return getRepositoryUsuarioEstado().findById(id);
	}

	private UsuarioEstadoCrudRepository getRepositoryUsuarioEstado() {
		// TODO Auto-generated method stub
		return repositoryUsuarioEstado;
	}

	public void setRepositoryEstados(UsuarioEstadoCrudRepository repositoryUsuarioEstado) {
		this.repositoryUsuarioEstado = repositoryUsuarioEstado;
	}
	
	@Override
	public Iterable<UsuarioEstado> findAll() {
		return null;
	}

	@Override
	public void delete(UsuarioEstado entity) {

	}

	@Override
	public void deleteAll() {

	}
	
	@Override
	public void deleteById(Integer id) {
		getRepositoryUsuarioEstado().deleteById(id);
		
	}
	


}
