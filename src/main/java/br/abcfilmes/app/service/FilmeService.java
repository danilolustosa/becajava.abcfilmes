package br.abcfilmes.app.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.abcfilmes.app.model.Categoria;
import br.abcfilmes.app.model.Filme;
import br.abcfilmes.app.repository.CategoriaRepository;
import br.abcfilmes.app.repository.FilmeRepository;
import br.abcfilmes.app.request.FilmeRequest;
import br.abcfilmes.app.response.BaseResponse;

@Service
public class FilmeService {

	@Autowired
	private FilmeRepository repository;
	
	@Autowired
	private CategoriaRepository categoriaRepository;

	public BaseResponse inserir(FilmeRequest request) {
		if (request.getNome() == "")
			return new BaseResponse(400, "Preencha o nome do filme");
		
		if (request.getCategoria().getId() != null) {
			
			Optional<Categoria> checkCategoria = categoriaRepository.findById(request.getCategoria().getId());
			
			if (checkCategoria.isEmpty())
				categoriaRepository.save(
						new Categoria(
								request.getCategoria().getId(), 
								request.getCategoria().getNome()
								)
						);			
		} else 
			return new BaseResponse(400, "Preencha a categoria do filme");
		

		Filme filme = new Filme(
				request.getNome(), 
				request.getAno(),
				new Categoria(request.getCategoria().getId())
			);

		repository.save(filme);

		return new BaseResponse(201, "Filme criado com sucesso");
	}

}
