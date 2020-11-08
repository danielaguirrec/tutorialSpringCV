package net.daniel.service;
import java.util.List;

import net.daniel.empleos.model.Vacante;

public interface IVacanteService {
	
	List<Vacante> buscarTodas();
	Vacante buscarPorId(Integer idVacante);
}
