package sch.sumicomputer.mercaelche.domain;

import javax.persistence.*;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "productos")
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idproductos", nullable = false)
    private Integer id;

    @Column(name = "nombre", nullable = false)
    private String nombre;

    @Column(name = "precio")
    private Double precio;

    @Column(name = "descripcion")
    private String descripcion;

    @ManyToMany
    @JoinTable(name = "cesta_has_productos",
            joinColumns = @JoinColumn(name = "productos_idproductos"),
            inverseJoinColumns = @JoinColumn(name = "cesta_idcesta"))
    private Set<Cesta> cestas = new LinkedHashSet<>();

    @ManyToMany
    @JoinTable(name = "familias_has_productos",
            joinColumns = @JoinColumn(name = "productos_idproductos"),
            inverseJoinColumns = @JoinColumn(name = "familias_idfamilias"))
    private Set<Familia> familias = new LinkedHashSet<>();

    @OneToMany(mappedBy = "productosIdproductos")
    private Set<Tienda> tiendas = new LinkedHashSet<>();

    @ManyToMany
    @JoinTable(name = "productos_has_cupones",
            joinColumns = @JoinColumn(name = "productos_idproductos"),
            inverseJoinColumns = @JoinColumn(name = "cupones_idcupones"))
    private Set<Cupon> cupones = new LinkedHashSet<>();

    public Set<Cupon> getCupones() {
        return cupones;
    }

    public void setCupones(Set<Cupon> cupones) {
        this.cupones = cupones;
    }

    public Set<Tienda> getTiendas() {
        return tiendas;
    }

    public void setTiendas(Set<Tienda> tiendas) {
        this.tiendas = tiendas;
    }

    public Set<Familia> getFamilias() {
        return familias;
    }

    public void setFamilias(Set<Familia> familias) {
        this.familias = familias;
    }

    public Set<Cesta> getCestas() {
        return cestas;
    }

    public void setCestas(Set<Cesta> cestas) {
        this.cestas = cestas;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

}