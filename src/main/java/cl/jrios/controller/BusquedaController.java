package cl.jrios.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import cl.jrios.service.impl.PerfilServiceImpl;

@Controller
@RequestMapping("/busqueda")
public class BusquedaController {

	@Autowired
	private PerfilServiceImpl servicioPerfil;

	@GetMapping
	public String busqueda(ModelMap mapa) {
		return "pages/busqueda";
	}
	
	@PostMapping("/raza")
	public String busquedaRaza(ModelMap mapa, @RequestParam(name = "razas_id") Integer raza_id) {
		mapa.put("perfiles", servicioPerfil.listarPorRaza(raza_id));
		return "pages/busqueda";
	}
	
	@PostMapping("/edad")
	public String busquedaEdad(ModelMap mapa, @RequestParam(name = "edad") Integer edad) {
		mapa.put("perfiles", servicioPerfil.listarPorEdad(edad));
		return "pages/busqueda";
	}
	
	@PostMapping("/genero")
	public String busquedaGenero(ModelMap mapa, @RequestParam(name = "genero_id") Integer genero) {
		mapa.put("perfiles", servicioPerfil.listarPorGenero(genero));
		return "pages/busqueda";
	}
}
