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
	public String busqueda(ModelMap mapa, @RequestParam(name = "razas_id") Integer raza_id) {
		List<Perfil> listaPerfil = servicioPerfil.listarPorRaza(raza_id);
		System.out.println(listaPerfil);
		mapa.put("perfiles", listaPerfil);
		return "pages/busqueda";
	}
}
