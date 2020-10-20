package curso.gfi.boot.servicios;

import curso.gfi.boot.entidades.Estado;

public interface EstadosServiceInterface {
	
	public Iterable<Estado> getEstadosByTipo(int tipo);

}
