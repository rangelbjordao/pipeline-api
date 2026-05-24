package br.com.fiap.pipelineapi.controller;

import br.com.fiap.pipelineapi.entity.Categoria;
import br.com.fiap.pipelineapi.repository.CategoriaRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categorias")

public class CategoriaController {

    private final CategoriaRepository repository;

    public CategoriaController(CategoriaRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Categoria> listar() {
        return repository.findAll();
    }

    @PostMapping
    public Categoria salvar(@RequestBody Categoria categoria) {
        return repository.save(categoria);
    }

    @PutMapping("/{id}")
    public Categoria atualizar(@PathVariable Long id,
                               @RequestBody Categoria categoria) {

        categoria.setId(id);

        return repository.save(categoria);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        repository.deleteById(id);
    }
}