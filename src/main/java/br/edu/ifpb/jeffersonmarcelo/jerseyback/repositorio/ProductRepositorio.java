package br.edu.ifpb.jeffersonmarcelo.jerseyback.repositorio;

import br.edu.ifpb.jeffersonmarcelo.jerseyback.modelo.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepositorio extends JpaRepository<Product, Long> {


}
