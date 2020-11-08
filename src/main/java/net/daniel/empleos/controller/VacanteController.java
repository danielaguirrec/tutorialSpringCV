package net.daniel.empleos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import net.daniel.empleos.model.Vacante;
import net.daniel.service.IVacanteService;

@Controller
@RequestMapping("/vacantes")
public class VacanteController {

	@Autowired
	private IVacanteService serviceVacantes;
		@GetMapping("/view/{id}")
	    public String verDetalle(@PathVariable("id") int idVacante, Model model) {
			
			Vacante vacante = serviceVacantes.buscarPorId(idVacante);
			System.out.println("Vacante: " + vacante);
			model.addAttribute("vacante",vacante);
			return "detalle";		
	}
}
