package curso.gfi.boot.servicios;

import curso.gfi.boot.entidades.Acceso;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import curso.gfi.boot.repositorios.AccesosCrudRepository;


@Service
public class AccesosService implements AccesosServiceInterface {

	@Autowired
	private AccesosCrudRepository repositoryAcceso;

	public AccesosCrudRepository getRepositoryAcceso() {
		return repositoryAcceso;
	}

	public void setRepositoryAcceso(AccesosCrudRepository repository) {
		this.repositoryAcceso = repository;
	}

	@Override
	public void delete(Acceso acceso) {
		// TODO Auto-generated method stub				
		
	}

	@Override
	public Iterable<Acceso> findAll() {
		// TODO Auto-generated method stub
		return getRepositoryAcceso().findAll();
		
	}

	@Override
	public Optional<Acceso> findById(Integer id) {
		// TODO Auto-generated method stub
		//return getRepository().findAllById(id);
		return getRepositoryAcceso().findById(id);
	}

	@Override
	public Acceso save(Acceso acceso) {
		// TODO Auto-generated method stub
		return getRepositoryAcceso().save(acceso);
	}

	@Override
	public void deleteById(Integer id) {		
		getRepositoryAcceso().deleteById(id);
	}
	
		

		
}
	
	


