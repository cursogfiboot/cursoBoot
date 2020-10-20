package curso.gfi.boot.repositorios;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import curso.gfi.boot.entidades.Jornada;

@Repository
public interface JornadasCrudRepository extends CrudRepository<Jornada, Integer> {

}