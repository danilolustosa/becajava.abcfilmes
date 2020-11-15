package br.abcfilmes.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.abcfilmes.app.model.Filme;

@Repository
public interface FilmeRepository extends JpaRepository<Filme,Long> {

}
