package edu.coder.FacturacionSegundaEntregaAndreani.service;

import ch.qos.logback.core.net.server.Client;
import edu.coder.FacturacionSegundaEntregaAndreani.model.Cliente;
import edu.coder.FacturacionSegundaEntregaAndreani.model.Compra;
import edu.coder.FacturacionSegundaEntregaAndreani.model.CompraProducto;
import edu.coder.FacturacionSegundaEntregaAndreani.model.Producto;
import edu.coder.FacturacionSegundaEntregaAndreani.repository.ClienteRepository;
import edu.coder.FacturacionSegundaEntregaAndreani.repository.CompraProductoRepository;
import edu.coder.FacturacionSegundaEntregaAndreani.repository.CompraRepository;
import edu.coder.FacturacionSegundaEntregaAndreani.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CompraService {
    @Autowired
    private CompraRepository compraRepository;

    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private ProductoRepository productoRepository;

    @Autowired
    private CompraProductoRepository compraProductoRepository;


    public Compra realizarCompra(Long clienteId, Long productoId, int cantidad) {

        Cliente cliente = clienteRepository.findById(clienteId)
                .orElseThrow(() -> new RuntimeException("Cliente no encontrado"));

        Producto producto = productoRepository.findById(productoId)
                .orElseThrow(() -> new RuntimeException("Producto no encontrado"));

        Compra compra = new Compra();
        compra.setFechaCompra(LocalDate.now());
        compra.setCliente(cliente);
        compra = compraRepository.save(compra);


        CompraProducto compraProducto = new CompraProducto();
        compraProducto.setCompra(compra);
        compraProducto.setProducto(producto);
        compraProducto.setCantidad((cantidad));
        compraProductoRepository.save(compraProducto);

        List<CompraProducto> compraProductos = new ArrayList<>();
        compraProductos.add(compraProducto);
        compra.setCompraProductos((compraProductos));

        return compraRepository.save(compra);
    }


}
