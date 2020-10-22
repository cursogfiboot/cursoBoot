package curso.gfi.boot.controladores;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import curso.gfi.boot.entidades.Jornada;
import curso.gfi.boot.servicios.JornadasServiceInterface;

@RestController
@RequestMapping(value = "/api")
public class JornadasController {

	@Autowired
	private JornadasServiceInterface service;
	
	@GetMapping("/jornadas")
	public Iterable<Jornada> findAll() {
		
		Iterable<Jornada> jornadas= getService().findAll();
		
		return jornadas;
	}
	
	@PostMapping("/jornadas")
	public Jornada save(@RequestBody Jornada jornada) {
		return getService().save(jornada);
	}
	
	@GetMapping("/jornadas/{id}")
	public Optional<Jornada> getPersona(@PathVariable int id) {
		
		Optional<Jornada> jornadas= getService().findById(id);
		
		return jornadas;
	}

	public JornadasServiceInterface getService() {
		return service;
	}

	public void setService(JornadasServiceInterface service) {
		this.service = service;
	}


	
}
