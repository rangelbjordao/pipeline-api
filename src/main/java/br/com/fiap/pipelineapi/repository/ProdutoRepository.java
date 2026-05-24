package br.com.fiap.pipelineapi.repository;

import br.com.fiap.pipelineapi.entity.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}