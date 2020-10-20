package curso.gfi.boot.controladores;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



import curso.gfi.boot.entidades.Estado;

import curso.gfi.boot.servicios.EstadosService;

@RestController
@RequestMapping("/api")
public class EstadosController {
	
	@Autowired
	private EstadosService service;
	
	public EstadosService getService() {
		return service;
	}

	public void setService(EstadosService service) {
		this.service = service;
	}	

	  
	  @GetMapping("/estados")
	   public Iterable<Estado> findAll(){
		  return getService().findAll(); 
		} 
	
	
	 @GetMapping("/estados/{id}")
	 public java.util.Optional<Estado> findById(@PathVariable("id") Integer id){
			
		 return getService().findById(id);		
	 }	 
	 
	 @PostMapping("/estados")
	 public Estado Save(@RequestBody Estado estado){
		return getService().save(estado);
	 }
	 
	 @DeleteMapping("/estados/{id}")	 
	 public void DeleteById(@PathVariable("id") Integer id){
		 getService().deleteById(id);
	 }	
	 

}
