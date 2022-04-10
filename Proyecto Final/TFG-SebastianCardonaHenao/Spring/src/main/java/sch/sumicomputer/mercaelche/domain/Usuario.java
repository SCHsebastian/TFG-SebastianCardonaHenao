package sch.sumicomputer.mercaelche.domain;

import javax.persistence.*;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "usuarios", indexes = {
        @Index(name = "fk_usuarios_cesta1_idx", columnList = "cesta_idcesta")
})
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idusuario", nullable = false)
    private Integer id;

    @Column(name = "nombre_usuario", nullable = false)
    private String nombreUsuario;

    @Column(name = "contrasenya_usuario", nullable = false)
    private String contrasenyaUsuario;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "cesta_idcesta", nullable = false)
    private Cesta cestaIdcesta;

    @ManyToMany
    @JoinTable(name = "usuarios_has_cupones",
            joinColumns = @JoinColumn(name = "usuarios_idusuario"),
            inverseJoinColumns = @JoinColumn(name = "cupones_idcupones"))
    private Set<Cupon> cupones = new LinkedHashSet<>();

    @OneToMany(mappedBy = "usuariosIdusuario")
    private Set<Tienda> tiendas = new LinkedHashSet<>();

    public Set<Tienda> getTiendas() {
        return tiendas;
    }

    public void setTiendas(Set<Tienda> tiendas) {
        this.tiendas = tiendas;
    }

    public Set<Cupon> getCupones() {
        return cupones;
    }

    public void setCupones(Set<Cupon> cupones) {
        this.cupones = cupones;
    }

    public Cesta getCestaIdcesta() {
        return cestaIdcesta;
    }

    public void setCestaIdcesta(Cesta cestaIdcesta) {
        this.cestaIdcesta = cestaIdcesta;
    }

    public String getContrasenyaUsuario() {
        return contrasenyaUsuario;
    }

    public void setContrasenyaUsuario(String contrasenyaUsuario) {
        this.contrasenyaUsuario = contrasenyaUsuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}