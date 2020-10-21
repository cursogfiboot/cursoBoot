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

import curso.gfi.boot.entidades.Empleado;
import curso.gfi.boot.servicios.EmpleadosService;
import curso.gfi.boot.servicios.EmpleadosServiceInterface;

@RestController
@RequestMapping("/api")
public class EmpleadosController {
	@Autowired
	private EmpleadosService empleadoService;
	
	@GetMapping ("/empleados")
	public Iterable<Empleado> findAll(){
		return getEmpleadoService().findAll();
		
	}
	
	@GetMapping ("/empleados/{id}")
	public Optional<Empleado> findById(@PathVariable int id){
		return getEmpleadoService().findById(id);
		
	}
	
	@PostMapping(value="/empleados")
	public Empleado save (@RequestBody Empleado empleado) {
		return 	getEmpleadoService().save(empleado);
	}

	@DeleteMapping("/empleados/{id}")
	public void delete(@PathVariable int id) {
		getEmpleadoService().deleteById(id);
	}
	
	
	
	public EmpleadosService getEmpleadoService() {
		return empleadoService;
	}

	public void setEmpleadoService(EmpleadosService empleadoService) {
		this.empleadoService = empleadoService;
	}



	

}
