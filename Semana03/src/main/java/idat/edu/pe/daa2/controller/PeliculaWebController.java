package idat.edu.pe.daa2.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import idat.edu.pe.daa2.modelo.Pelicula;
import idat.edu.pe.daa2.servicios.PeliculaServicio;

@Controller
@RequestMapping("/peliculas")
public class PeliculaWebController {

	@Autowired
	private PeliculaServicio servicio;
	
	@RequestMapping("/listarTodo")
	public String listarPeliculas(Model model) {
		
		List<Pelicula> listaPeliculas = servicio.buscarTodo();
		
		model.addAttribute("listaPeliculas", listaPeliculas);
		return "/moduloPeliculas/listarTodo";
	}
	
}
