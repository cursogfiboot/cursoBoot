package curso.gfi.boot.controladores;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import curso.gfi.boot.entidades.Calendario;
import curso.gfi.boot.servicios.CalendariosService;

@RestController
@RequestMapping("/api")
public class CalendariosController {
	
	@Autowired
	private CalendariosService servicioCalendarios;
	
	@GetMapping("/calendarios")
	public Iterable<Calendario> findAll(){
		return getServicioCalendarios().findAll();
	}
	
	@GetMapping("/calendarios/{id}")
	public Optional<Calendario>findById(@PathVariable int id){
		return getServicioCalendarios().findById(id);
	}
	
	@PostMapping("/calendarios")
	public Calendario save(@RequestBody Calendario calendario) {
		return getServicioCalendarios().save(calendario);
	}

	@DeleteMapping("/estados/{id}")
	public void delete(@PathVariable int id) {
		getServicioCalendarios().deleteById(id);
	}
	
	@DeleteMapping("/estados")
	public void deleteAll() {
		getServicioCalendarios().deleteAll();
	}
	
	public CalendariosService getServicioCalendarios() {
		return servicioCalendarios;
	}

	public void setServicioCalendarios(CalendariosService servicioCalendarios) {
		this.servicioCalendarios = servicioCalendarios;
	}

	

	

}
