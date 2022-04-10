package sch.sumicomputer.mercaelche.repository;

import org.springframework.data.repository.CrudRepository;
import sch.sumicomputer.mercaelche.domain.Usuario;

public interface UsuarioRepository extends CrudRepository<Usuario, Integer> {
}
