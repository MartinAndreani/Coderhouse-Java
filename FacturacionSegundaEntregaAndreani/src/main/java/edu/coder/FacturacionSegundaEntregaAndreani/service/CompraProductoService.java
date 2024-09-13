package edu.coder.FacturacionSegundaEntregaAndreani.service;

import edu.coder.FacturacionSegundaEntregaAndreani.model.Cliente;
import edu.coder.FacturacionSegundaEntregaAndreani.model.Compra;
import edu.coder.FacturacionSegundaEntregaAndreani.model.CompraProducto;
import edu.coder.FacturacionSegundaEntregaAndreani.model.Producto;
import edu.coder.FacturacionSegundaEntregaAndreani.repository.ClienteRepository;
import edu.coder.FacturacionSegundaEntregaAndreani.repository.CompraProductoRepository;
import edu.coder.FacturacionSegundaEntregaAndreani.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CompraProductoService {
    @Autowired
    private CompraProductoRepository compraProductoRepository;
    @Autowired
    private ClienteRepository clienteRepository;
    @Autowired
    private ProductoRepository productoRepository;


    public List<CompraProducto> buscarTodos(){
        return compraProductoRepository.findAll();
    }

    public CompraProducto hacerCompraProducto(CompraProducto compraProducto){
        return compraProductoRepository.save(compraProducto);
    }

    public Optional<CompraProducto> buscarCompraProducto(Long id){
        return compraProductoRepository.findById(id);
    }



}
