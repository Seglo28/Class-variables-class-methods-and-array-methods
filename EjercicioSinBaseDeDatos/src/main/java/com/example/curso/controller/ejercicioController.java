package com.example.curso.controller;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.example.model.ResultadoEsperado;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;

@RestController
@RequestMapping("/controlador")
public class ejercicioController {

	@PostMapping("/metodoEscribir")
	public String escribir(String nombre, String apellido, String email) {
		String escribir = "hola";
		return escribir;
	}
	//how to use multipartfile under spring boot 
	
	@PostMapping("/upload")
	public String imagen(@RequestParam("image") MultipartFile image) {
		    if (!image.isEmpty()) {
		        try {
		            byte[] bytes = image.getBytes();
		            //You can use the bytes to save the image to a specific location
		            Path path = Paths.get("C:\\upload_java\\imagenpez.jpg");
		            Files.write(path, bytes);
		            return "Image uploaded successfully";
		        } catch (IOException e) {
		            e.printStackTrace();
		            return "TE FALLO LA CARGA DE LA IMAGEN";
		        }
		    } else {
		        return "Image is empty";
		    }
		}
	
	@PostMapping("/prueba")
	public String prueba(@RequestParam String name, @RequestParam String mail, @RequestParam("image") MultipartFile image) {
		
		//https://www.baeldung.com/java-json-moshi
		//https://github.com/square/moshi
		ResultadoEsperado re = new ResultadoEsperado();
		re.setName(name);
		re.setMail(mail);
		
		if (!image.isEmpty()) {
	        re.setPath(image.getOriginalFilename());
	    } else {
	    	re.setPath("c:/upload_java/aca_no_lleva_nombre.jpg");
	    }
		
		return this.generateJSON(re);
	}
	
	
	
	
	public String generateJSON(ResultadoEsperado arg) {
		Moshi moshi = new Moshi.Builder().build();
		
		JsonAdapter<ResultadoEsperado> jsonAdapter = moshi.adapter(ResultadoEsperado.class);
		
		return jsonAdapter.toJson(arg);
		
		
		//-----------------------------------------------------
	
		
	}
	
}
