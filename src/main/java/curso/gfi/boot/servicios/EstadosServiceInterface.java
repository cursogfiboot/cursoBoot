package curso.gfi.boot.servicios;

import java.util.Optional;

import curso.gfi.boot.entidades.Estado;

public interface EstadosServiceInterface {
	
	public Iterable<Estado> getEstadosByTipo(int tipo);
	

	public void deleteById(Integer id);
	
	public Iterable<Estado> findAll();

	
	public Optional<Estado> findById(Integer id);
	
	public Estado save (Estado estado);
	

}
