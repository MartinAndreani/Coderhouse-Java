package edu.coder.FacturacionSegundaEntregaAndreani.model;

import jakarta.persistence.*;

@Entity
@Table(name = "PRODUCTO")
public class Producto {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column(name = "NOMBRE")
    private String nombre;

    @Column(name = "PRECIO")
    private int precio;


    public Long getId() {
        return id;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
}
