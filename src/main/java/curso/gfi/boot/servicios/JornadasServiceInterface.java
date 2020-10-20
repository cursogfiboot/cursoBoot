package curso.gfi.boot.servicios;

import java.util.Optional;

import curso.gfi.boot.entidades.Jornada;

public interface JornadasServiceInterface {

	/**
	 * Guardar un registro (Insert + Update)
	 * 
	 * @param jornada {@link Jornada}
	 * @return {@link Jornada}
	 */
	Jornada save(Jornada jornada);

	/**
	 * Recupera un registro por el id
	 * 
	 * @param id {@link Integer}
	 * @return {@link Jornada}
	 */
	Optional<Jornada> findById(Integer id);

	/**
	 * Recupera una lista Iterable con todos los registros
	 * 
	 * @return {@link Iterable} of {@link Jornada}
	 */
	Iterable<Jornada> findAll();

	/**
	 * Elimina un registro con el id del objeto pasado
	 * 
	 * @param jornada {@link Jornada}
	 */
	void delete(Jornada jornada);

	/**
	 * Elimina todos los registros de la tabla
	 */
	void deleteAll();
}