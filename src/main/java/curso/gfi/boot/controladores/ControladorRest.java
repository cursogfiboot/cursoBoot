package curso.gfi.boot.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import curso.gfi.boot.entidades.Acceso;
import curso.gfi.boot.repositorios.AccesoCrudRepository;

@RestController
@RequestMapping(value = "/api")
public class ControladorRest {

	@Autowired
	private AccesoCrudRepository repositoryAcceso;
	
	
	@GetMapping("/estados/{tipo}")
	public Iterable<Acceso> getPersona(@PathVariable int tipo) {
		
		Iterable<Acceso> estados= getRepository().getEstadoByTipo(tipo);
		
		return estados;
	}


	public AccesoCrudRepository getRepository() {
		return repositoryAcceso;
	}


	public void setRepository(AccesoCrudRepository repositoryAcceso) {
		this.repositoryAcceso = repositoryAcceso;
	}

}
