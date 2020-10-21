package curso.gfi.boot.servicios;

import java.util.Optional;

import curso.gfi.boot.entidades.Calendario;

public interface CalendariosServiceInterface {

	public Iterable<Calendario> getCalendariosById(int id);
	
	public Calendario save(Calendario calendario);
	
	public void delete(Calendario entity);

	public Iterable<Calendario> findAll();

	public Optional<Calendario> findById(Integer arg0);
	
	public void deleteAll();
	
	public void deleteById(Integer id);
	

}
