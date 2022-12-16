package br.edu.ifpb.jeffersonmarcelo.jerseyback.servico;

import br.edu.ifpb.jeffersonmarcelo.jerseyback.repositorio.ProductRepositorio;
import br.edu.ifpb.jeffersonmarcelo.jerseyback.modelo.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

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
        productInserido.setNome(productInserido.getNome() + " - alterado");
        return productInserido;
    }

    public void apagar(Long id) {
        this.productRepositorio.deleteById(id);
    }


}

 /* Optional<Product> product = this.productRepositorio.findById(productAInserir.getId());
        if(product.isPresent()){
            productAInserir.getValor();
            if (productAInserir.getValor() < 18) {
            throw new RuntimeException("Menor de 18 reais");
        }
        }        */