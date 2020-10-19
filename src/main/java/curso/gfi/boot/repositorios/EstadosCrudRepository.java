package curso.gfi.boot.repositorios;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import curso.gfi.boot.entidades.Estado;

@Repository
public interface EstadosCrudRepository extends CrudRepository<Estado, Integer> {

	
	@Query(value = "from Estado e where e.tipo=:tipo")
	public Iterable<Estado> getEstadoByTipo(int tipo);
	
	
}
