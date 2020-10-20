package curso.gfi.boot.servicios;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import curso.gfi.boot.entidades.Empleado;
import curso.gfi.boot.repositorios.EmpleadoCrudRepository;

@Service
public class EmpleadosService implements EmpleadosServiceInterface {
	
	
	@Autowired	
	private EmpleadoCrudRepository repository;

	@Override
	public void delete(Empleado empleado) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Iterable<Empleado> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Empleado> findById(Integer arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Empleado save(Empleado emplead0) {
		// TODO Auto-generated method stub
		return null;
	}

	public EmpleadoCrudRepository getRepository() {
		return repository;
	}

	public void setRepository(EmpleadoCrudRepository repository) {
		this.repository = repository;
	}
	
	

}
