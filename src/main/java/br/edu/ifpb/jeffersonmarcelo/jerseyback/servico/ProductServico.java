package br.edu.ifpb.jeffersonmarcelo.jerseyback.servico;

import br.edu.ifpb.jeffersonmarcelo.jerseyback.repositorio.ProductRepositorio;
import br.edu.ifpb.jeffersonmarcelo.jerseyback.modelo.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
public class ProductServico {

    @Autowired
    private ProductRepositorio productRepositorio;

    public List<Product> listarProducts() {
        return this.productRepositorio.findAll();
    }

    public Product getProductPorId(Long idUsuario) {
        return this.productRepositorio.findById(idUsuario).orElse(null);
    }

    @Transactional
    public Product inserirOuAtualizar(Product productAInserir) {
        Product productInserido = this.productRepositorio.save(productAInserir);
        productInserido.setNome(productInserido.getNome());
        return productInserido;
    }

    public void apagar(Long id) {
        this.productRepositorio.deleteById(id);
    }


}

