package curso.gfi.boot.controladores;


import org.springframework.web.bind.annotation.RestController;



import curso.gfi.boot.entidades.Acceso;

import curso.gfi.boot.servicios.AccesosServiceInterface;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;



@RestController
@RequestMapping("/api")
public class AccesosController {
	
	/**
	 * api/
	 */
	
	
	  @Autowired 
	  private AccesosServiceInterface servicioAccesos;
	  
	  public AccesosServiceInterface getServicioAccesos() { 
		  return servicioAccesos;
	  }
	  
	  public void setServicioAccesos(AccesosServiceInterface servicioAccesos) {
		  this.servicioAccesos = servicioAccesos;
	  }
	  
	  
	  
	  @GetMapping("/Accesos")
	   public Iterable<Acceso> findAll(){
		  return getServicioAccesos().findAll(); 
		} 
	
	
	
	 @GetMapping("/Accesos/{id}")
	 public java.util.Optional<Acceso> findById(@PathVariable("id") Integer id){
			
		 return getServicioAccesos().findById(id);		
	 }
	 
	 
	 @PostMapping("/Accesos")
	 public Acceso Save(@RequestBody Acceso acceso){
		return getServicioAccesos().save(acceso);
	 }
	 
	 @DeleteMapping("/Accesos/{id}")	 
	 public void DeleteById(@PathVariable("id") Integer id){
		 getServicioAccesos().deleteById(id);
	 }	 
	 
	
	

}
