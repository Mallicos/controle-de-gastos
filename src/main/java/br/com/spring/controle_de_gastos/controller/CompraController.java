package br.com.spring.controle_de_gastos.controller;

import br.com.spring.controle_de_gastos.model.CadastroCompraDto;
import br.com.spring.controle_de_gastos.model.Compra;
import br.com.spring.controle_de_gastos.model.CompraRepository;
import br.com.spring.controle_de_gastos.model.ListagemCompraDto;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/compras")
public class CompraController {

    @Autowired
    private CompraRepository repository;

    @PostMapping
    @Transactional
    public void cadastro(@RequestBody @Valid CadastroCompraDto dados) {
        this.repository.save(new Compra(dados));
    }

    @GetMapping
    public Page<ListagemCompraDto> listar(@PageableDefault(size = 5, page = 0, sort = {"dataCompra"}, direction = Sort.Direction.DESC) Pageable pageable) {
        return this.repository.findAll(pageable).map(ListagemCompraDto::new);
    }
}
