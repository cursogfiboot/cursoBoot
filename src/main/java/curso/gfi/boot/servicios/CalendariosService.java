package curso.gfi.boot.servicios;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import curso.gfi.boot.entidades.Calendario;
import curso.gfi.boot.repositorios.CalendariosCrudRepository;

@Service
public class CalendariosService implements CalendariosServiceInterface {

	@Autowired
	private CalendariosCrudRepository repositoryCalendarios;

	@Override
	public Iterable<Calendario> getCalendariosById(int id) {
		return getRepositoryCalendarios().getCalendarioById(id);
	}

	@Override
	public Calendario save(Calendario calendario) {
		return getRepositoryCalendarios().save(calendario);
	}

	@Override
	public void delete(Calendario entity) {
	}

	@Override
	public Iterable<Calendario> findAll() {
		return getRepositoryCalendarios().findAll();
	}

	@Override
	public Optional<Calendario> findById(Integer id) {
		return getRepositoryCalendarios().findById(id);
	}

	@Override
	public void deleteAll() {

	}

	public CalendariosCrudRepository getRepositoryCalendarios() {
		return repositoryCalendarios;
	}

	public void setRepositoryCalendarios(CalendariosCrudRepository repositoryCalendarios) {
		this.repositoryCalendarios = repositoryCalendarios;
	}

	@Override
	public void deleteById(Integer id) {
		getRepositoryCalendarios().deleteById(id);
	}
}
