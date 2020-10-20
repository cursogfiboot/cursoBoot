package curso.gfi.boot.servicios;

import java.util.Optional;

import curso.gfi.boot.entidades.Empleado;

public interface EmpleadosServiceInterface {
	
	
	
	public Empleado save(Empleado empleado) ;

	public Optional<Empleado> findById(Integer id);

	public Iterable<Empleado> findAll() ;

	public void delete(Empleado empleado) ;

	public void deleteAll() ;

}
