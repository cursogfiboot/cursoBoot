package curso.gfi.boot.servicios;

import java.util.Optional;

import curso.gfi.boot.entidades.Acceso;


public interface AccesosServiceInterface {
	
	
	public void delete(Acceso acceso);


	public Iterable<Acceso> findAll() ;

	
	public Optional<Acceso> findById(Integer id);

	
	public Acceso save(Acceso acceso);
	

	public void deleteById(Integer id);

}
