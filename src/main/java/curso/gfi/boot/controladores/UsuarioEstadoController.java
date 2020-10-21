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
import curso.gfi.boot.servicios.UsuarioEstadoServiceInterface;

@RestController
@RequestMapping("/api")
public class UsuarioEstadoController {
	
	/*
	 * /api/usuarioestado GET -> todos registros POST (json estado) -> graba el obleto
	 * 
	 * 
	 * /api/usuarioestado(íd} GET -> el registro del id DELETE -> elimina el registro
	 */
	
	@Autowired
	private UsuarioEstadoServiceInterface servicioUsuarioEstado;
	
	@GetMapping("/usuarioestado")
	public Iterable<UsuarioEstado> findAll(){
		return getServicioUsuarioEstado().findAll();
		
	}
	
	@GetMapping("/usuarioestado/{id}")
	public Optional<UsuarioEstado> findById(@PathVariable int id){
		return getServicioUsuarioEstado().findById(id);
	}
	
	@PostMapping(value="/usuarioestado")
	public UsuarioEstado save(@RequestBody UsuarioEstado usuarioEstado) {
		
		return getServicioUsuarioEstado().save(usuarioEstado);
	}


	@DeleteMapping("/usuarioestado/{id}")
	public void delete(@PathVariable int id) {
		getServicioUsuarioEstado().deleteById(id);
	}

	@DeleteMapping("/usuarioestado")
	public void deleteAll() {
		getServicioUsuarioEstado().deleteAll();
	}

	public UsuarioEstadoServiceInterface getServicioUsuarioEstado() {
		return servicioUsuarioEstado;
	}


	public void setServicioEstados(UsuarioEstadoServiceInterface servicioUsuarioEstado) {
		this.servicioUsuarioEstado = servicioUsuarioEstado;
	}
	
}
