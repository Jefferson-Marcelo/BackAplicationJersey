package br.edu.ifpb.jeffersonmarcelo.jerseyback.controlador;

import br.edu.ifpb.jeffersonmarcelo.jerseyback.modelo.Product;
import br.edu.ifpb.jeffersonmarcelo.jerseyback.servico.ProductServico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("")
public class ProductControlador {

    //private static String caminhoImagens = "/Users/jeffe/OneDrive/Imagens/Camisas/";

    @Autowired
    private ProductServico productServico;

    @GetMapping("listarproduto")
    public List<Product> listarProducts() {
        return this.productServico.listarProducts();
    }

    @GetMapping("listarproduto/{id}")
    public Product getProductPorId(@PathVariable("id") Long idProduct) {
        return this.productServico.getProductPorId(idProduct);
    }

    @PostMapping("cadastrarproduto")
    public Product inserir(@RequestBody Product productAInserir) {
        return this.productServico.inserirOuAtualizar(productAInserir);
    }

    @PutMapping("cadastrarproduto/{id}")
    public Product atualizar(@RequestBody Product productAAtualizar) {
        return this.productServico.inserirOuAtualizar(productAAtualizar);
    }

    @DeleteMapping("/{id}")
    public void apagar(@PathVariable("id") Long id) {
        this.productServico.apagar(id);
    }

    //@GetMapping("/idosos")
   // public List<Product> getIdosos() {
      //  return this.productServico.getIdosos();
    //}
}