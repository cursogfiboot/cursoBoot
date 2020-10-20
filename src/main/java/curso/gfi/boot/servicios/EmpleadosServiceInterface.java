package curso.gfi.boot.servicios;

import java.util.Optional;

import curso.gfi.boot.entidades.Empleado;

public interface EmpleadosServiceInterface {

	
	public void delete(Empleado empleado);

	public void deleteAll() ;

	public Iterable<Empleado> findAll();
	
	public Optional<Empleado> findById(Integer arg0);

	public Empleado save(Empleado emplead0);

}
