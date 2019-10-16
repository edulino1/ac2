package br.com.drummond.resources;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Ac2 {
	@RequestMapping(value = "/multiplo/{valor1}", method = RequestMethod.GET)
	public Integer multiplo(@PathVariable Integer valor1) {
		Integer resultado=0;
		
		if (valor1 %5 == 0) {
			resultado = valor1 + 5;
		}else {
			resultado = -1;
		}
		
		return resultado;
	}

}
