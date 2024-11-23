package br.com.spring.controle_de_gastos.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;

public record CadastroCompraDto(
        @NotBlank
        String nomeProduto,
        @NotBlank
        String nomeLoja,
        @NotNull
        Double preco,
        @NotNull
        Integer parcelas,
        @NotNull
        LocalDate dataCompra
    ) {
}
