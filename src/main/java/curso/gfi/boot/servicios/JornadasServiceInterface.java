package curso.gfi.boot.servicios;

import java.util.Optional;

import curso.gfi.boot.entidades.Jornada;

public interface JornadasServiceInterface {

	
	public long count();

	
	public void delete(Jornada arg0) ;

	
	public void deleteAll() ;

	
	public Iterable<Jornada> findAll() ;

	
	public Optional<Jornada> findById(Integer arg0) ;

	
	public Jornada save(Jornada jornada) ;


}
