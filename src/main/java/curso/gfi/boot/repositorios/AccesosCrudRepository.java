package curso.gfi.boot.repositorios;

import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;

import curso.gfi.boot.entidades.Acceso;


@Repository
public interface AccesosCrudRepository extends CrudRepository<Acceso, Integer> {

	
	
	
}
