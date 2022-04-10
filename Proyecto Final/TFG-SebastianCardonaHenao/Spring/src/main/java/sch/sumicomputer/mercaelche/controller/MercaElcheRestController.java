package sch.sumicomputer.mercaelche.controller;

import org.springframework.web.bind.annotation.RestController;
import sch.sumicomputer.mercaelche.repository.*;

@RestController
public class MercaElcheRestController {

    private final CestaRepository cestaRepository;
    private final UsuarioRepository usuarioRepository;
    private final TiendaRepository tiendaRepository;
    private final ProductoRepository productoRepository;
    private final FamiliaRepository familiaRepository;
    private final CuponRepository cuponRepository;

    public MercaElcheRestController(CestaRepository cestaRepository, UsuarioRepository usuarioRepository, TiendaRepository tiendaRepository, ProductoRepository productoRepository, FamiliaRepository familiaRepository, CuponRepository cuponRepository) {
        this.cestaRepository = cestaRepository;
        this.usuarioRepository = usuarioRepository;
        this.tiendaRepository = tiendaRepository;
        this.productoRepository = productoRepository;
        this.familiaRepository = familiaRepository;
        this.cuponRepository = cuponRepository;
    }

}
