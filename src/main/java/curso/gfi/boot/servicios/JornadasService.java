package curso.gfi.boot.servicios;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import curso.gfi.boot.entidades.Jornada;
import curso.gfi.boot.repositorios.JornadasCrudRepository;

public class JornadasService implements JornadasServiceInterface {
	@Autowired	
	private JornadasCrudRepository repository;
	
	@Override
	public long count() {
		return getRepository().count();
	}

	@Override
	public void delete(Jornada arg0) {
		 getRepository().delete(arg0);
	}

	@Override
	public void deleteAll() {
		 getRepository().deleteAll();
	}

	@Override
	public Iterable<Jornada> findAll() {
		return getRepository().findAll();
	}

	@Override
	public Optional<Jornada> findById(Integer arg0) {
		return getRepository().findById(arg0);
	}

	@Override
	public Jornada save(Jornada arg0) {
		return getRepository().save(arg0);
	}
	
	public JornadasCrudRepository getRepository() {
		return repository;
	}

	public void setRepository(JornadasCrudRepository repository) {
		this.repository = repository;
	}
}
