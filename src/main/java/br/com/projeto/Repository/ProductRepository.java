package br.com.projeto.Repository;

import br.com.projeto.model.ProductModel;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProductRepository extends CrudRepository<ProductModel, Long> {

    List<ProductModel> findAll();

    ProductModel findByCodigo(Long codigo);
}
