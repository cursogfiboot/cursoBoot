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

import curso.gfi.boot.entidades.UsuarioEstado;
import curso.gfi.boot.servicios.EstadosServiceInterface;

@RestController
@RequestMapping("/api")
public class EstadosController {

	/*
	 * /api/estados GET -> todos registros POST (json estado) -> graba el obleto
	 * 
	 * 
	 * /api/estados(íd} GET -> el registro del id DELETE -> elimina el registro
	 */

	@Autowired
	private EstadosServiceInterface servicioEstados;

	@GetMapping("/estados")
	public Iterable<UsuarioEstado> findAll() {
		return getServicioEstados().findAll();
	}
	
	
	
	
	@GetMapping("/estados/{id}")
	public Optional<UsuarioEstado> findById(@PathVariable int id){
		return getServicioEstados().findById(id);
	}
	
	@PostMapping(value="/estados")

	public UsuarioEstado save(@RequestBody UsuarioEstado estado) {
		
		return getServicioEstados().save(estado);
	}


	@DeleteMapping("/estados/{id}")
	
	public void delete(@PathVariable int id) {
		getServicioEstados().deleteById(id);
	}

	@DeleteMapping("/estados")
	public void deleteAll() {
		getServicioEstados().deleteAll();
	}

	public EstadosServiceInterface getServicioEstados() {
		return servicioEstados;
	}




	public void setServicioEstados(EstadosServiceInterface servicioEstados) {
		this.servicioEstados = servicioEstados;
	}
	

	

}
