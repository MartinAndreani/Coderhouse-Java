package edu.coder.FacturacionSegundaEntregaAndreani.service;

import edu.coder.FacturacionSegundaEntregaAndreani.model.Cliente;
import edu.coder.FacturacionSegundaEntregaAndreani.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public List<Cliente>buscarTodos(){
        return clienteRepository.findAll();
    }

    public Cliente agregarCliente(Cliente cliente){
        return clienteRepository.save(cliente);
    }

    public Optional<Cliente> buscarCliente(Long id) {
        return clienteRepository.findById(id);
    }

}
