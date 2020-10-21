package curso.gfi.boot.servicios;

import java.util.Optional;

import curso.gfi.boot.entidades.UsuarioEstado;

public interface UsuarioEstadoServiceInterface {

	public UsuarioEstado save(UsuarioEstado estado);

	public Optional<UsuarioEstado> findById(Integer id);

	public Iterable<UsuarioEstado> findAll();

	public void delete(UsuarioEstado entity);

	public void deleteAll();
	
	public void deleteById(Integer id);

}
