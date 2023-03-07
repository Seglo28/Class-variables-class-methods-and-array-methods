package com.practice.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.practice.mapeos.ejercicioVehiculos.Auto;
import com.practice.mapeos.ejercicioVehiculos.Persona;
import com.practice.mapeos.ejerciciosEmpleado.Empleado;
import com.practice.mapeos.ejerciciosEstudiante.Estudiante;
import com.practice.mapeos.ejerciciosEstudiante.Materia;
import com.practice.mapeos.ejerciciosEstudiante.Profesor;

@RestController
@RequestMapping("/controlador")
public class Controlador {
	
	// LUNES 06/02/23
	Estudiante[] estudianteArray = {
		new Estudiante ("SP19028", new Materia("sociales", 0)),	
		new Estudiante ("AF19048", new Materia("matematicas", 0))
	};
	
	Profesor[] profesorArray = {
		new Profesor("KK8952D", "Carlos", 9, estudianteArray)	
	};
	
	@PostMapping("/jackson")
	public String resultado(@RequestBody Profesor parametro){
		String parseandoAJackson = "";
		ObjectMapper mapper = new ObjectMapper();
		
		List<Profesor> listaHecha = new ArrayList <Profesor>();
		for(Profesor arrayProfesor: this.profesorArray) {
			if(parametro.getId().equals(arrayProfesor.getId())){
				listaHecha.add(arrayProfesor);
				try {
					parseandoAJackson = mapper.writeValueAsString(listaHecha);
				} catch (JsonProcessingException e) {
					e.printStackTrace();
				}
				return parseandoAJackson;
			}
		}
		return parseandoAJackson;
	}
	
	// MARTES 07/02/23
	
	@PostMapping("/salario")
	public Empleado sumaSalarios(@RequestBody Empleado[] parametro) {
		Empleado salida = new Empleado();
		int suma  = 0;
		for(Empleado sueldos: parametro) {
			salida.setTotalPago(suma += sueldos.getSalary());
		}
		return salida;
	}
	
	@PostMapping("/array")
	public List <String> empleados (@RequestBody Empleado[] listaDeEmpleados) {	
		List<String> salida = new ArrayList<String>();
		for(Empleado empleados: listaDeEmpleados) {
			salida.add(empleados.getName()+" $"+empleados.getSalary());
		}
		return salida;
	}
	
	//MIERCOLES 08/02/23
	
	@PostMapping("/auto")
	public List<Persona> vehiculo(@RequestBody Persona[] parametros) {
		
		List<Persona> salida = new ArrayList<Persona>();
		for(Persona lista: parametros) {
			salida.add(lista);
		}
		return salida;
	}
	
	@PostMapping("/carro")
	public List<Persona> carros () {
		List<Persona> salida = new ArrayList<Persona>();
		for(Persona lista: arrayDePersonas) {
				salida.add(lista);
		}			
		return salida;
	}
	
	@PostMapping("/mediadeprecio")
	public double obteniendoDatosNumericos() {
		double salida = 0;
		double media = 0;
		
		for(Persona persona:this.arrayDePersonas) {
			
			Auto auto = persona.getAuto();
			
			salida += auto.getPrecio();
			
		}
		
		media = salida/arrayDePersonas.length;
		return salida;
	}
	
	//JUEVES 09/02/23
	
	@PostMapping("/porinicial")
	public List<String>personasPorIncial(String letra) {
		
		List<String> salida = new ArrayList<String>();
		for(Persona person: this.arrayDePersonas) {
			
			if(person.getName().startsWith(letra.toLowerCase()) | person.getName().startsWith(letra.toUpperCase())){
				salida.add(person.getName());
			}
		}
		return salida;
	}
	
	//VIERNES 10/02/23
	
	Persona[] arrayDePersonas= {
			new Persona("Ado", new Auto("Toyota", 5000)),
			new Persona("Rosa", new Auto("Honda", 11500)),
			new Persona("Gloria", new Auto("Jeep", 25000)),
			new Persona("ana", new Auto("Jeep", 25000)),
			new Persona("Guadalupe", new Auto("Jeep", 25000)),
			new Persona("Samael", new Auto("Toyota", 5000)),
			new Persona("Rubenea", new Auto("Honda", 11500)),
			new Persona("Delmy", new Auto("Jeep", 25000)),
			new Persona("Michelle", new Auto("Jeep", 25000)),
			new Persona("amanda", new Auto("Jeep", 25000)),
			new Persona("Valentina", new Auto("Jeep", 25000)),
			new Persona("Jhonny", new Auto("Jeep", 25000)),
			new Persona("Valenyina", new Auto("Jeep", 25000))
	};	
	
	@PostMapping("/porcoincidencia")
	List<String> personasPorCoincidencia(String parametro){
		String parametroUpper = parametro.toUpperCase();
		String parametroLower = parametro.toLowerCase();
		List<String> salida = new ArrayList<String>();
		for(Persona persona: this.arrayDePersonas) {
			if(persona.getName().toUpperCase().contains(parametroUpper) | persona.getName().toLowerCase().contains(parametroLower)) {
				salida.add(persona.getName());
				Collections.sort(salida, String.CASE_INSENSITIVE_ORDER);
				}
			}
		return salida;
	}	
	
	//Lunes 14/02/23
	@PostMapping("/pino")
	
	public String pino (@RequestParam String parametro) {
		int fila = parametro.length();
		int columna = parametro.length();
		
		StringBuilder sb = new StringBuilder();
		
		String matriz [][] = new String [fila][columna];
		
		int mitad = matriz[0].length/2;
		
		
		
		
		for(int i=0;i<matriz.length;i++) {
			for(int j = 0; j<matriz[0].length;j++) {
				if((i+j)>=mitad && (j-i) <= mitad) {
					matriz[i][j] = "*";
				}else {
					matriz[i][j] = " ";
				}
			}
		}
		return sb.toString();
		
	}
	/*String var1 = parametro.substring(0,1);
	String var2 = parametro.substring(0,3);
	String var3 = parametro.substring(0,6);
	Salida = "   "+var1+"\n"+"  "+var2+"\n"+var3;*/
		
	@PostMapping ("/pino")
	public String arbolito(String parametro) {
		String salida ="vacio";
		int repeticiones = parametro.length()-1;
		int end = 0;
		String espacio = " ";
		//int mitad = parametro.length()/2;

		for(int i = 0; i< repeticiones ; i++) {
			//if(repeticiones>=mitad && repeticiones<=mitad) {
			salida +=  parametro.substring(0,end);
			end += i;
			
		//}
			
		}
		return salida;
		}
	
	//17/02/23
		@GetMapping("/cuadro")
		public String cuadro (@RequestParam String parametro) {
			String salida = "";
			
			
			
			for(int filas = 0; filas < 5; filas++) {
				
				for(int cols= 0; cols < 5; cols++) {
					
					if(cols == 0 || cols == 4) {
						salida += "x";
					} else if(cols == 0 && (filas >= 0 && filas < 5)){
						salida += "x";
					}
					else {
						salida += parametro;	
					}
				}
				salida += "\n";	
			}
			return salida;
		}
		
		@GetMapping("/velocidad")
		public String velocidad (double desplazamiento, double tiempo) {
			String velocidad;
			if(desplazamiento>0 && tiempo>0) {
				velocidad = "La velocidad es: "+ Double.toString(desplazamiento/tiempo)+" m/s.";
			}else {
				velocidad = "Los datos deben ser mayores a 0";
			}
			return velocidad;
		}
		
}


	







































