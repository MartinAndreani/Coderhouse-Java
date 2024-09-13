package edu.coder.FacturacionSegundaEntregaAndreani.repository;


import edu.coder.FacturacionSegundaEntregaAndreani.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository  extends JpaRepository<Producto, Long> {
}
