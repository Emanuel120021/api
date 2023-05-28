//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package br.com.projeto.controller;


import br.com.projeto.Repository.ProductRepository;
import br.com.projeto.model.ProductModel;

import jakarta.validation.Valid;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
    @Autowired
    private ProductRepository productRepository;

    @GetMapping({"/produto"})
    public List<ProductModel> listar() {
        return this.productRepository.findAll();
    }

    @GetMapping({"/produto/{codigo}"})
    public ProductModel selecionarPorCodigo(@PathVariable Long codigo) {
        return this.productRepository.findByCodigo(codigo);
    }

    @PostMapping({"/produto"})
    public ProductModel cadastrar(@RequestBody @Valid ProductModel obj) {
        return (ProductModel)this.productRepository.save(obj);
    }

    @PutMapping({"/produto"})
    public ProductModel editar(@RequestBody ProductModel obj) {
        return (ProductModel)this.productRepository.save(obj);
    }

    @DeleteMapping({"/produto/{codigo}"})
    public void remover(@PathVariable Long codigo) {
        ProductModel obj = this.selecionarPorCodigo(codigo);
        this.productRepository.delete(obj);
    }
}
