package br.com.fiap.pipelineapi.controller;

import br.com.fiap.pipelineapi.entity.Produto;
import br.com.fiap.pipelineapi.repository.ProdutoRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produtos")

public class ProdutoController {

    private final ProdutoRepository repository;

    public ProdutoController(ProdutoRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Produto> listar() {
        return repository.findAll();
    }

    @PostMapping
    public Produto salvar(@RequestBody Produto produto) {
        return repository.save(produto);
    }

    @PutMapping("/{id}")
    public Produto atualizar(@PathVariable Long id,
                             @RequestBody Produto produto) {

        produto.setId(id);

        return repository.save(produto);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        repository.deleteById(id);
    }
}