package tratamento_de_arquivo.analise_de_estoque;

import java.util.Objects;
import java.util.Scanner;

public class Produto implements Comparable<Object>{
    private String codigo, nome;
    public Double preco, quantidade;

    public Produto(String codigo, String nome, double preco, double quantidade) {
        setCodigo(codigo);
        setNome(nome);
        //this.preco = preco;
        //this.quantidade = quantidade;
        setPreco(preco);
        setQuantidade(quantidade);

    }

    @Override
    public String toString(){
        return nome;
    }

    @Override
    public int compareTo(Object obj){
        if (!(obj instanceof Produto)) throw new UnsupportedOperationException("Produto só pode ser comparado com produto");
        Produto p = (Produto) obj;

        if (!Objects.equals(quantidade, p.quantidade))
            return Double.compare(quantidade, p.quantidade);
        else
            return Double.compare(preco, p.preco);
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

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        if (preco > 0)
            this.preco = preco;
        else
            throw new IllegalArgumentException("preço deve ser maior que zero");
    }

    public Double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Double quantidade) {
        if (quantidade > 0)
            this.quantidade = quantidade;
        else
            throw new IllegalArgumentException("quantidade deve ser maior que zero");
    }
}
