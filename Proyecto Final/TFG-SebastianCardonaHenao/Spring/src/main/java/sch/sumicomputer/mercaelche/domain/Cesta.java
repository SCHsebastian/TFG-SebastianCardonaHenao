package sch.sumicomputer.mercaelche.domain;

import javax.persistence.*;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "cesta")
public class Cesta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idcesta", nullable = false)
    private Integer id;

    @ManyToMany(mappedBy = "cestas")
    private Set<Producto> productos = new LinkedHashSet<>();

    @OneToMany(mappedBy = "cestaIdcesta")
    private Set<Usuario> usuarios = new LinkedHashSet<>();

    public Set<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(Set<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public Set<Producto> getProductos() {
        return productos;
    }

    public void setProductos(Set<Producto> productos) {
        this.productos = productos;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

}