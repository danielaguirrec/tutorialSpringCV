package net.daniel.empleos.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import net.daniel.empleos.model.Vacante;
import net.daniel.service.IVacanteService;


	
@Controller
public class HomeController {
	 
	@Autowired
	private IVacanteService serviceVacantes;
	
	@GetMapping("/tabla")
	public String mostrarTabla(Model model) {
		
		List<Vacante> lista = serviceVacantes.buscarTodas();
		model.addAttribute("vacantes",lista);
		
		
		return "tabla";
	}
	
	@GetMapping("/detalle")
	public String mostrarDetalle(Model model) {
		
		Vacante vacante = new Vacante();
		vacante.setNombre("Ingeniero de teleco");
		vacante.setDescripcion("Se solicita ingeniero de teleco");
		vacante.setFecha(new Date());
		vacante.setSalario(9700.0);
		model.addAttribute("vacante",vacante);
		return "detalle";
		
	}

	@GetMapping("/listado")
	public String mostrarListado(Model model) {
		
		List<String> lista = new LinkedList<String>();
		lista.add("Ingeniero de Sistemas");
		lista.add("Auxiliar de COntabilidad");
		lista.add("Vendedor");
		lista.add("Arquitecto");
		
		model.addAttribute("empleos", lista);
		return "listado";
	}
	
	@GetMapping("/")
	public String mostrarHome(Model model) {
		
		/*model.addAttribute("mensaje","Bienvenidos a empleos App");
		model.addAttribute("fecha",new Date());*/
		
		String nombre = "Auxiliar contabilidad";
		Date fechaPub = new Date();
		double salario = 9900.0;
		boolean vigente = true;		
		model.addAttribute("nombre",nombre);
		model.addAttribute("fecha",fechaPub);
		model.addAttribute("salario",salario);
		model.addAttribute("vigente","Bienvenidos a empleos App");
	
		return "home";
	}
}
