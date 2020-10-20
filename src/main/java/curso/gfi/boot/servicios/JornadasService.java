package curso.gfi.boot.servicios;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import curso.gfi.boot.entidades.Jornada;
import curso.gfi.boot.repositorios.JornadasCrudRepository;

@Service
public class JornadasService implements JornadasServiceInterface {

	@Autowired
	private JornadasCrudRepository jornadasCrudRepository;

	@Override
	public void delete(Jornada jornada) {
		this.getJornadasCrudRepository().delete(jornada);
	}

	@Override
	public void deleteAll() {
		this.getJornadasCrudRepository().deleteAll();
	}

	@Override
	public Iterable<Jornada> findAll() {
		return this.getJornadasCrudRepository().findAll();
	}

	@Override
	public Optional<Jornada> findById(Integer id) {
		return this.getJornadasCrudRepository().findById(id);
	}

	@Override
	public Jornada save(Jornada jornada) {
		return this.getJornadasCrudRepository().save(jornada);
	}

	public JornadasCrudRepository getJornadasCrudRepository() {
		return jornadasCrudRepository;
	}

	public void setJornadasCrudRepository(JornadasCrudRepository jornadasCrudRepository) {
		this.jornadasCrudRepository = jornadasCrudRepository;
	}
}