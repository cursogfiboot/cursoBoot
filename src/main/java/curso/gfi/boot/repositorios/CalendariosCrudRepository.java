package curso.gfi.boot.repositorios;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import curso.gfi.boot.entidades.Calendario;

@Repository
public interface CalendariosCrudRepository extends CrudRepository<Calendario, Integer>{
	
	

	@Query(value = "from Calendario c where c.id=:id")
	public Iterable<Calendario> getCalendarioById(int id);

	

}
