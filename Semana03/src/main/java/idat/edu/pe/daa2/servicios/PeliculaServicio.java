package idat.edu.pe.daa2.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import idat.edu.pe.daa2.modelo.Pelicula;
import idat.edu.pe.daa2.repositorios.PeliculaRepositorio;
import jakarta.transaction.Transactional;

@Service
@Transactional
public class PeliculaServicio {

	@Autowired // Inyeccion de dependecia
	private PeliculaRepositorio repositorio;
	
	public PeliculaServicio() {
		
	}
	
	public List<Pelicula> buscarTodo(){
		return (List<Pelicula>) repositorio.findAll();
		
	}
	
	
	public Pelicula crear(Pelicula pelicula) {
		return repositorio.save(pelicula);
	}
	
	
}
