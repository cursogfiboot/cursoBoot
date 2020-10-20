package curso.gfi.boot.servicios;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import curso.gfi.boot.entidades.Calendario;
import curso.gfi.boot.repositorios.CalendariosCrudRepository;

@Service
public class CalendariosService implements CalendariosServiceInterface {
	
	@Autowired
	private CalendariosCrudRepository repository;

	@Override
	public Iterable<Calendario> getCalendariosById(int id) {
		// TODO Auto-generated method stub
		return getRepository().getCalendarioById(id);
	}
		
		public CalendariosCrudRepository getRepository() {
			return repository;
		}

		public void setRepository(CalendariosCrudRepository repository) {
			this.repository = repository;
		}


		@Override
		public Calendario save(Calendario calendario) {
			return null;
		}

		@Override
		public void delete(Calendario entity) {
		}

		@Override
		public Iterable<Calendario> findAll() {
			return null;
		}

		@Override
		public Optional<Calendario> findById(Integer arg0) {
			return null;
		}

		@Override
		public void deleteAll() {
			
		}
	}

