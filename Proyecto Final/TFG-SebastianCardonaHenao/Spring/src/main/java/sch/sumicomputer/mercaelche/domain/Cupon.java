package sch.sumicomputer.mercaelche.domain;

import javax.persistence.*;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "cupones")
public class Cupon {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idcupones", nullable = false)
    private Integer id;

    @Column(name = "descuento", nullable = false)
    private Integer descuento;

    @Column(name = "usos")
    private Integer usos;

    @ManyToMany(mappedBy = "cupones")
    private Set<Usuario> usuarios = new LinkedHashSet<>();

    @ManyToMany(mappedBy = "cupones")
    private Set<Producto> productos = new LinkedHashSet<>();

    public Set<Producto> getProductos() {
        return productos;
    }

    public void setProductos(Set<Producto> productos) {
        this.productos = productos;
    }

    public Set<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(Set<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public Integer getUsos() {
        return usos;
    }

    public void setUsos(Integer usos) {
        this.usos = usos;
    }

    public Integer getDescuento() {
        return descuento;
    }

    public void setDescuento(Integer descuento) {
        this.descuento = descuento;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

}