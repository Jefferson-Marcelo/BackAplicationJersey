package br.edu.ifpb.jeffersonmarcelo.jerseyback.modelo;

import jakarta.persistence.*;

@Entity
@Table(name="tb_product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;


    private String imagem;
    private String nome;

    private double valor;
    private Integer parcelado;

    public Long getId() {
        return id;
    }


    public String getImagem() { return imagem; }

    public void setImagem(String imagem) { this.imagem = imagem;}

    public void setValor(double valor) { this.valor = valor; }

    public void setParcelado(Integer parcelado) { this.parcelado = parcelado; }

    public double getValor() { return valor; }

    public Integer getParcelado() { return parcelado; }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


}