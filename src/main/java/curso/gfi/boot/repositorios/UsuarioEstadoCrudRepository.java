package curso.gfi.boot.repositorios;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import curso.gfi.boot.entidades.Estado;
import curso.gfi.boot.entidades.UsuarioEstado;

@Repository
public interface UsuarioEstadoCrudRepository extends CrudRepository<UsuarioEstado, Integer> {

	
}
