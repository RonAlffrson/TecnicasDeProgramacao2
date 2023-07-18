package tratamento_de_arquivo.analise_de_estoque;

import java.util.Objects;
import java.util.Scanner;

public class Produto implements Comparable<Object>{
    private String codigo, nome;
    public String preco, quantidade;

    public Produto(String codigo, String nome, String preco, String quantidade) {
        setCodigo(codigo);
        setNome(nome);
        this.preco = preco;
        this.quantidade = quantidade;
        //setPreco(preco);
        //setQuantidade(quantidade);

    }

    @Override
    public int compareTo(Object obj){
        if (!(obj instanceof Produto)) throw new UnsupportedOperationException("Produto só pode ser comparado com produto");
        Produto p = (Produto) obj;

        if (!Objects.equals(quantidade, p.quantidade))
            return this.quantidade.compareTo(p.quantidade);
        else
            return this.quantidade.compareTo(p.quantidade);
        //caso a quantidde seja a mesma, será compardo os preços
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        if (!codigo.isEmpty())
            this.codigo = codigo;
        else
            throw new IllegalArgumentException("código não pode ser vazio");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (!nome.isEmpty())
            this.nome = nome;
        else
            throw new IllegalArgumentException("nome não pode ser vazio");
    }
/*
    public Integer getPreco() {
        return preco;
    }

    public void setPreco(Integer preco) {
        if (preco > 0)
            this.preco = preco;
        else
            throw new IllegalArgumentException("preço deve ser maior que zero");
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        if (quantidade > 0)
            this.quantidade = quantidade;
        else
            throw new IllegalArgumentException("quantidade deve ser maior que zero");
    }*/
}
