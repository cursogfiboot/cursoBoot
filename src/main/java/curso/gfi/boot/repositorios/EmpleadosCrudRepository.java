package curso.gfi.boot.repositorios;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import curso.gfi.boot.entidades.Empleado;

@Repository
public interface EmpleadosCrudRepository extends CrudRepository<Empleado, Integer> {


	
	
}
