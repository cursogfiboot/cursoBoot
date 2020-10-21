package curso.gfi.boot.servicios;

import java.util.Optional;

import curso.gfi.boot.entidades.Estado;
import curso.gfi.boot.entidades.Jornada;

public interface JornadasServiceInterface {


	Jornada save(Jornada jornada);


	Optional<Jornada> findById(Integer id);


	Iterable<Jornada> findAll();


	void delete(Jornada jornada);


	void deleteAll();
}