package cl.jrios.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import cl.jrios.service.impl.CaracteristicaServiceImpl;
import cl.jrios.service.impl.PerfilServiceImpl;
import cl.jrios.service.impl.RazaServiceImpl;

@Controller
@RequestMapping("/")
public class HomeController {
	
	@Autowired
	private CaracteristicaServiceImpl servicioCaract;
	
	@Autowired
	private PerfilServiceImpl servicioPerfil;
	
	@Autowired
	private RazaServiceImpl servicioRaza;
	
	@GetMapping
	public String home(ModelMap mapa) {
		return "home";
	}
}
