package br.abcfilmes.app.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.abcfilmes.app.request.FilmeRequest;
import br.abcfilmes.app.response.BaseResponse;
import br.abcfilmes.app.response.FilmeResponse;
import br.abcfilmes.app.service.FilmeService;

@RestController
@RequestMapping("/filme")
public class FilmeController {
	
	@Autowired
	private FilmeService service;
	
	@PostMapping
	public ResponseEntity inserir(@RequestBody FilmeRequest request)	{		
		BaseResponse response = service.inserir(request);
		return ResponseEntity.status(200).body(response);
	}	
	
	@GetMapping(path = "/listar")
	public ResponseEntity listar() {
		
		List<FilmeResponse> lista = new ArrayList<FilmeResponse>();
		
		FilmeResponse filme = new FilmeResponse();		
		filme.setAno(2000);
		filme.setNome("Homens de honra");
		lista.add(filme);
		
		filme = new FilmeResponse();		
		filme.setAno(2009);
		filme.setNome("2012");
		lista.add(filme);
		
		return ResponseEntity.status(200).body(lista);
	}	
	
	@GetMapping(path = "/obter")
	public ResponseEntity obter() {		
		
		FilmeResponse filme = new FilmeResponse();		
		filme.setAno(2000);
		filme.setNome("Homens de honra");
		
		return ResponseEntity.status(200).body(filme);
	}
}
