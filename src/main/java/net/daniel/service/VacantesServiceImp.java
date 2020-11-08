 package net.daniel.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Service;

import net.daniel.empleos.model.Vacante;

@Service
public class VacantesServiceImp  implements IVacanteService{
	
	private List<Vacante> lista = null;
	
	public VacantesServiceImp() {
		 
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		lista = new LinkedList<Vacante>();
		try {
			Vacante vacante1= new Vacante();
			vacante1.setId(1);
			vacante1.setNombre("Ing Civil");
			vacante1.setDescripcion("Solicitamos ing Civil para construiir");
			vacante1.setFecha(sdf.parse("08-02-2019"));
			vacante1.setSalario(30000.0);
			vacante1.setDestacado(1);
			
			Vacante vacante2= new Vacante();
			vacante2.setId(2);
			vacante2.setNombre("Ing Civil");
			vacante2.setDescripcion("Solicitamos ing Civil para construiir");
			vacante2.setFecha(sdf.parse("08-02-2019"));
			vacante2.setSalario(30000.0); 
			vacante2.setDestacado(0);
			

			Vacante vacante3= new Vacante();
			vacante3.setId(3);
			vacante3.setNombre("Ing Electronica");
			vacante3.setDescripcion("Programador");
			vacante3.setFecha(sdf.parse("08-02-2020"));
			vacante3.setSalario(2700000.0); 
			vacante3.setDestacado(1);
			lista.add(vacante1);
			lista.add(vacante2);
			lista.add(vacante3);
		} catch(ParseException e) {
			
			System.out.print("ERROR"); 
		}

	}

	public List<Vacante> buscarTodas() {
		
		return lista;
	}

	@Override
	public Vacante buscarPorId(Integer idVacante) {
		for (Vacante v: lista) {
			if(v.getId()==idVacante) {
				return v;
			}		
		}
		return null;
	}
	
	
	
	


}
