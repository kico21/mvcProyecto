package interfaceService;

import java.util.List;
import java.util.Optional;

import modelo.Persona;

public interface IpersonaService {
	public List<Persona> listar();
	public Optional<Persona> listarid(int id);
	public int save(Persona p);
	public void  delete(int id);
}
