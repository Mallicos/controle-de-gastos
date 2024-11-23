package br.com.spring.controle_de_gastos.model;

import java.time.LocalDate;

public record ListagemCompraDto (Long id, String nomeProduto, String nomeLoja, Double preco, Integer parcelas, LocalDate dataCompra) {

    public ListagemCompraDto (Compra compra) {
        this(compra.getId(), compra.getNomeProduto(), compra.getNomeLoja(), compra.getPreco(), compra.getParcelas(), compra.getDataCompra());
    }
}
