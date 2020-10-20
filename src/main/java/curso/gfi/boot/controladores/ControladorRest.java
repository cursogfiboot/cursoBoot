package curso.gfi.boot.controladores;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import curso.gfi.boot.entidades.Estado;

import curso.gfi.boot.servicios.EstadosService;

@RestController
@RequestMapping(value = "/api")
public class ControladorRest {

	@Autowired
	private EstadosService service;
	
	@GetMapping("/estadostipo/{tipo}")
	public Iterable<Estado> getPersona(@PathVariable int tipo) {
		
		Iterable<Estado> estados= getService().getEstadosByTipo(tipo);
		
		return estados;
	}

	public EstadosService getService() {
		return service;
	}

	public void setService(EstadosService service) {
		this.service = service;
	}


	
}
