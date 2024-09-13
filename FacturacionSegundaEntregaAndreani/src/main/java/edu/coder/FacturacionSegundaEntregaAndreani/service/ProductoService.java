package edu.coder.FacturacionSegundaEntregaAndreani.service;

import edu.coder.FacturacionSegundaEntregaAndreani.model.Producto;
import edu.coder.FacturacionSegundaEntregaAndreani.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductoService {

    @Autowired
    private ProductoRepository productoRepository;



    public List<Producto>buscarTodos(){
        return productoRepository.findAll();
    }


    public Producto agregarProducto(Producto producto){
        return productoRepository.save(producto);
    }


    public Optional<Producto> buscarProducto(Long id){
        return productoRepository.findById(id);
    }

}
