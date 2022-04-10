package sch.sumicomputer.mercaelche.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import sch.sumicomputer.mercaelche.repository.*;

@Controller
public class MercaElcheController {

    private final CestaRepository cestaRepository;
    private final UsuarioRepository usuarioRepository;
    private final TiendaRepository tiendaRepository;
    private final ProductoRepository productoRepository;
    private final FamiliaRepository familiaRepository;
    private final CuponRepository cuponRepository;

    public MercaElcheController(CestaRepository cestaRepository, UsuarioRepository usuarioRepository, TiendaRepository tiendaRepository, ProductoRepository productoRepository, FamiliaRepository familiaRepository, CuponRepository cuponRepository) {
        this.cestaRepository = cestaRepository;
        this.usuarioRepository = usuarioRepository;
        this.tiendaRepository = tiendaRepository;
        this.productoRepository = productoRepository;
        this.familiaRepository = familiaRepository;
        this.cuponRepository = cuponRepository;
    }

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @RequestMapping
    public String home() {
        return "index";
    }

}
