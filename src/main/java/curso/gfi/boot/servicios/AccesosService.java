package curso.gfi.boot.servicios;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import curso.gfi.boot.entidades.Acceso;
import curso.gfi.boot.repositorios.AccesosCrudRepository;

@Service
public class AccesosService implements AccesosServiceInterface {

	@Autowired
	private AccesosCrudRepository repository; 
	
	@Override
	public Iterable<Acceso> findAll() {
		return repository.findAll();
	}
	
	@Override
	public Optional<Acceso> findById(Integer id) {
		return repository.findById(id);
	}

	@Override
	public Acceso save(Acceso acceso) {
		return repository.save(acceso);
	}

	@Override
	public void delete(Acceso acceso) {
	}

	public AccesosCrudRepository getRepository() {
		return repository;
	}

	public void setRepository(AccesosCrudRepository repository) {
		this.repository = repository;
	}
	
}
