package br.com.fiap.pipelineapi.repository;

import br.com.fiap.pipelineapi.entity.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
}