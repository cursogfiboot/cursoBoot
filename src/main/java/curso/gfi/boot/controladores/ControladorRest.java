package curso.gfi.boot.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import curso.gfi.boot.entidades.Estado;
import curso.gfi.boot.repositorios.EstadosCrudRepository;

@RestController
@RequestMapping(value = "/api")
public class ControladorRest {

	@Autowired
	private EstadosCrudRepository repository;
	
	
	@GetMapping("/estados/{tipo}")
	public Iterable<Estado> getPersona(@PathVariable int tipo) {
		
		Iterable<Estado> estados= getRepository().getEstadoByTipo(tipo);
		
		return estados;
	}


	public EstadosCrudRepository getRepository() {
		return repository;
	}


	public void setRepository(EstadosCrudRepository repository) {
		this.repository = repository;
	}

}
