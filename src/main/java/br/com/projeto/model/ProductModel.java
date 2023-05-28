package br.com.projeto.model;


import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;




@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "TB_PRODUTO")
public class ProductModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "COD_PROD")
    private Long codigo;

    @Column(name = "DESC_PROD")
    private String descricao;


}
