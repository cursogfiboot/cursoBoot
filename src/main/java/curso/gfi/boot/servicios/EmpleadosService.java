package curso.gfi.boot.servicios;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import curso.gfi.boot.entidades.Empleado;
import curso.gfi.boot.repositorios.EmpleadosCrudRepository;

@Service
public class EmpleadosService implements EmpleadosServiceInterface {
	
	
	@Autowired	
	private EmpleadosCrudRepository repository;
	
	

	@Override
	public Empleado save(Empleado empleado) {
		return getRepository().save(empleado);
	}

	@Override
	public Optional<Empleado> findById(Integer id) {
		return getRepository().findById(id);
	}

	@Override
	public Iterable<Empleado> findAll() {
		return getRepository().findAll();
	}

	@Override
	public void delete(Empleado empleado) {
		getRepository().delete(empleado);
	}

	@Override
	public void deleteAll() {
		getRepository().deleteAll();
	}

	public EmpleadosCrudRepository getRepository() {
		return repository;
	}

	public void setRepository(EmpleadosCrudRepository repository) {
		this.repository = repository;
	}
	
	

	

}
