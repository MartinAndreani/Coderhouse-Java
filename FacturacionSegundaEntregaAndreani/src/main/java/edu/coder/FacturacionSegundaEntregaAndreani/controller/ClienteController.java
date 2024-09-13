package edu.coder.FacturacionSegundaEntregaAndreani.controller;

import edu.coder.FacturacionSegundaEntregaAndreani.model.Cliente;
import edu.coder.FacturacionSegundaEntregaAndreani.service.ClienteService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/cliente")
@Tag(name=" Cliente", description = "Operaciones relacionadas con los clientes")
public class ClienteController {


    @Autowired
    private ClienteService clienteService;

    @GetMapping("/todos")
    public List<Cliente> buscarTodos(){
        return clienteService.buscarTodos();
    }

    @PostMapping("/agregar")
    @Operation(summary="Agregar un nuevo cliente", description = "Agrega un nuevo cliente al sistema")
    public Cliente agregarCliente(@RequestBody Cliente cliente){
        return clienteService.agregarCliente(cliente);
    }


    @GetMapping("/buscar/{id}")
    @Operation(summary="Buscar un cliente por ID", description="Busca un cliente utilizando su numero de ID")

    public Optional<Cliente> buscarCliente(@PathVariable Long id) {
        return clienteService.buscarCliente(id);
    }

}
