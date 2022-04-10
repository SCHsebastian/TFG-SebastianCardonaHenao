package sch.sumicomputer.mercaelche.domain;

import javax.persistence.*;

@Entity
@Table(name = "tiendas")
public class Tienda {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idtienda", nullable = false)
    private Integer id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "usuarios_idusuario")
    private Usuario usuariosIdusuario;

    @Column(name = "nombre_tienda", nullable = false)
    private String nombreTienda;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "productos_idproductos", nullable = false)
    private Producto productosIdproductos;

    public Producto getProductosIdproductos() {
        return productosIdproductos;
    }

    public void setProductosIdproductos(Producto productosIdproductos) {
        this.productosIdproductos = productosIdproductos;
    }

    public String getNombreTienda() {
        return nombreTienda;
    }

    public void setNombreTienda(String nombreTienda) {
        this.nombreTienda = nombreTienda;
    }

    public Usuario getUsuariosIdusuario() {
        return usuariosIdusuario;
    }

    public void setUsuariosIdusuario(Usuario usuariosIdusuario) {
        this.usuariosIdusuario = usuariosIdusuario;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

}