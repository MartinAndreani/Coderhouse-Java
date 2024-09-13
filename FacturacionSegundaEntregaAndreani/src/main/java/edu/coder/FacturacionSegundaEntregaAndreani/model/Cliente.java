package edu.coder.FacturacionSegundaEntregaAndreani.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;

import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "CLIENTE")

public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Schema(description= "ID único del cliente", example = "1", accessMode = Schema.AccessMode.READ_ONLY )

    private Long id;

    @Schema(description = "Nombre del cliente", example = "Martin Andreani", requiredMode = Schema.RequiredMode.REQUIRED)
    private String nombre;
    @Schema(description = "Mail de cliente", example ="martin@gmail.com", requiredMode = Schema.RequiredMode.REQUIRED)
    private String mail;
    @Schema(description = "Telefono de cliente", example ="3517409423", requiredMode = Schema.RequiredMode.REQUIRED)
    private Integer tel;


    @OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL)
    @Schema(description = "Lista de ventas asociadas al cliente", accessMode = Schema.AccessMode.READ_ONLY)
    @JsonIgnore
    private List<Compra> compras;




    public Long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public int getTel() {
        return tel;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }

    public List<Compra> getCompras() {
        return compras;
    }

    public void setCompras(List<Compra> compras) {
        this.compras = compras;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return tel == cliente.tel && Objects.equals(id, cliente.id) && Objects.equals(nombre, cliente.nombre) && Objects.equals(mail, cliente.mail) && Objects.equals(compras, cliente.compras);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombre, mail, tel, compras);
    }
}
