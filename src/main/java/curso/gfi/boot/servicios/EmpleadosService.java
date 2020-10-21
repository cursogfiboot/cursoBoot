package curso.gfi.boot.servicios;

import java.util.Optional;

import org.aspectj.apache.bcel.generic.InstructionTargeter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import curso.gfi.boot.entidades.Empleado;
import curso.gfi.boot.repositorios.EmpleadoCrudRepository;

@Service
public class EmpleadosService implements EmpleadosServiceInterface {
	
	
	@Autowired	
	private EmpleadoCrudRepository repositoryEmpleados;

	@Override
	public void delete(Empleado empleado) {
		// TODO Auto-generated method stub
		getRepositoryEmpleados().delete(empleado);
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		getRepositoryEmpleados().deleteAll();
	}

	@Override
	public Iterable<Empleado> findAll() {
		return getRepositoryEmpleados().findAll();
	}

	@Override
	public Optional<Empleado> findById(Integer arg0) {
		// TODO Auto-generated method stub
		return getRepositoryEmpleados().findById(arg0);
	}

	@Override
	public Empleado save(Empleado empleado) {
		return getRepositoryEmpleados().save(empleado);
	}

	@Override
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
		getRepositoryEmpleados().deleteById(id);
	}

	
	public EmpleadoCrudRepository getRepositoryEmpleados() {
		return repositoryEmpleados;
	}

	public void setRepositoryEmpleados(EmpleadoCrudRepository repositoryEmpleados) {
		this.repositoryEmpleados = repositoryEmpleados;
	}

	
	
	

}
