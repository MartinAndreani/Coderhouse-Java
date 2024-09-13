package edu.coder.FacturacionSegundaEntregaAndreani.controller;


import edu.coder.FacturacionSegundaEntregaAndreani.model.CompraProducto;
import edu.coder.FacturacionSegundaEntregaAndreani.service.CompraProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/compraproducto")
public class CompraProductoController {

    @Autowired
    private CompraProductoService compraProductoService;

    @GetMapping("/todos")
    public List<CompraProducto>buscarTodos(){
        return compraProductoService.buscarTodos();
    }

    @GetMapping("buscar/{id}")
    public Optional<CompraProducto>buscarCompraProducto(@PathVariable Long id){
        return compraProductoService.buscarCompraProducto(id);
    }

    @PostMapping("/hacer")
    public CompraProducto realizarCompraProducto(@RequestBody CompraProducto compraProducto){
        return compraProductoService.hacerCompraProducto(compraProducto);
    }


}
