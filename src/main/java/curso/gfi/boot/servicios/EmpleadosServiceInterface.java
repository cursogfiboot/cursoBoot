package curso.gfi.boot.servicios;

import java.util.Optional;

import curso.gfi.boot.entidades.Empleado;

public interface EmpleadosServiceInterface {
	
	void delete(Empleado arg0);
	
	Iterable<Empleado> findAll();
	
	Optional<Empleado> findById(Integer arg0);
	
	Empleado save(Empleado arg0);

}
