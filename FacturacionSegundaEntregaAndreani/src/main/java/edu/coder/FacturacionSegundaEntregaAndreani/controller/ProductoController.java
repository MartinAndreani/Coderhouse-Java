package edu.coder.FacturacionSegundaEntregaAndreani.controller;


import edu.coder.FacturacionSegundaEntregaAndreani.model.Producto;
import edu.coder.FacturacionSegundaEntregaAndreani.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/producto")
public class ProductoController {

    @Autowired
    private ProductoService productoService;

    @GetMapping("/todos")
    public List<Producto> buscarTodos(){
        return productoService.buscarTodos();
    }

    @PostMapping("/agregar")
    public Producto agregarProducto(@RequestBody Producto producto){
        return productoService.agregarProducto(producto);
    }

    @GetMapping("/buscar/{id}")
    public Optional<Producto> buscarProducto(@PathVariable Long id){
        return productoService.buscarProducto(id);
    }
}
