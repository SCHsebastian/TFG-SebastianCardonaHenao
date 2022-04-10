package sch.sumicomputer.mercaelche.repository;

import org.springframework.data.repository.CrudRepository;
import sch.sumicomputer.mercaelche.domain.Producto;

public interface ProductoRepository extends CrudRepository<Producto, Integer> {
}
