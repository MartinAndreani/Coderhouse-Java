package edu.coder.FacturacionSegundaEntregaAndreani.controller;


import edu.coder.FacturacionSegundaEntregaAndreani.model.Compra;
import edu.coder.FacturacionSegundaEntregaAndreani.model.CompraProducto;
import edu.coder.FacturacionSegundaEntregaAndreani.service.CompraProductoService;
import edu.coder.FacturacionSegundaEntregaAndreani.service.CompraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/compra")

public class CompraController {

    @Autowired
    private CompraService compraService;

    @PostMapping("/crear/{clienteId}")
    public Compra RealizarCompra(
            @PathVariable Long clienteId,
            @RequestBody CompraProducto compraProducto
            ){
        return compraService.realizarCompra(clienteId,compraProducto.getProducto().getId(), compraProducto.getCantidad());
    }


}
