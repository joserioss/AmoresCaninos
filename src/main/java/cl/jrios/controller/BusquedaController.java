package cl.jrios.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import cl.jrios.model.Perfil;
import cl.jrios.service.impl.PerfilServiceImpl;

@Controller
@RequestMapping("/busqueda")
public class BusquedaController {

	@Autowired
	private PerfilServiceImpl servicioPerfil;

	@GetMapping
	public String busqueda(ModelMap mapa) {
		mapa.put("perfiles", servicioPerfil.listar());
		return "pages/busqueda";
	}
	
	@GetMapping("/raza")
	public String busquedaRaza(ModelMap mapa, @RequestParam(name = "razas_id") Integer raza_id) {
		mapa.put("perfiles", servicioPerfil.listarPorRaza(raza_id));
		return "pages/busqueda";
	}
	
	@GetMapping("/edad")
	public String busquedaEdad(ModelMap mapa, @RequestParam(name = "edad") Integer edad) {
		List<Perfil> listaPerfil = servicioPerfil.listarPorEdad(edad);
		System.out.println(listaPerfil);
		mapa.put("perfiles", listaPerfil);
		return "pages/busqueda";
	}
	
	@GetMapping("/genero")
	public String busquedaGenero(ModelMap mapa, @RequestParam(name = "genero_id") Integer genero) {
		List<Perfil> listaPerfil = servicioPerfil.listarPorGenero(genero);
		System.out.println(listaPerfil);
		mapa.put("perfiles", listaPerfil);
		return "pages/busqueda";
	}
}
