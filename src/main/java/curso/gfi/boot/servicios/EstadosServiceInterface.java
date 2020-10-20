package curso.gfi.boot.servicios;

import java.util.Optional;

import curso.gfi.boot.entidades.Estado;

public interface EstadosServiceInterface {

	public Estado save(Estado estado);

	public Optional<Estado> findById(Integer id);

	public Iterable<Estado> findAll();

	public void delete(Estado entity);

	public void deleteAll();

}
