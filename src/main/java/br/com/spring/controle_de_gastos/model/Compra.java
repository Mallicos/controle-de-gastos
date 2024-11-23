package br.com.spring.controle_de_gastos.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity(name = "Compra")
@Table(name = "compra")
@Getter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Compra {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nomeProduto;
    private String nomeLoja;
    private Double preco;
    private Integer parcelas;
    private LocalDate dataCompra;

    public Compra(CadastroCompraDto dados) {
        this.nomeProduto = dados.nomeProduto();
        this.nomeLoja = dados.nomeLoja();
        this.preco = dados.preco();
        this.parcelas = dados.parcelas();
        this.dataCompra = dados.dataCompra();
    }
}