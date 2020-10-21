package curso.gfi.boot.controladores;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import curso.gfi.boot.entidades.Jornada;
import curso.gfi.boot.servicios.JornadasService;
import curso.gfi.boot.servicios.JornadasServiceInterface;

@RestController
@RequestMapping(value = "/api")
public class ControladorJornada {

	@Autowired
	private JornadasServiceInterface serviceJornada;
	
	@Autowired
	private JornadasService servicioJornadas;
	
	@GetMapping("/jornadas")
	public Iterable<Jornada> findAll(){
		return getServicioJornadas().findAll();
	}
	
	@GetMapping("/jornadas/{id}")
	public Optional<Jornada>findById(@PathVariable int id){
		return getServicioJornadas().findById(id);
	}
	
	@PostMapping("/jornadas")
	public Jornada save(@RequestBody Jornada jornada) {
		return getServicioJornadas().save(jornada);
	}

	@DeleteMapping("/jornadas")
	public void delete(@PathVariable Jornada jornada) {
		getServicioJornadas().delete(jornada);
	}
	
	@DeleteMapping("/jornadas")
	public void deleteAll() {
		getServicioJornadas().deleteAll();
	}
	
	public JornadasService getServicioJornadas() {
		return servicioJornadas;
	}

	public void setServicioJornadas(JornadasService servicioJornadas) {
		this.servicioJornadas = servicioJornadas;
	}


	
}
