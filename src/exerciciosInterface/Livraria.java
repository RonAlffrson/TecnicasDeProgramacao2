package exerciciosInterface;


public class Livraria {
    public int qntEstoque;

    public void alterarQntEstoque(int qntEstoque){
        this.qntEstoque = qntEstoque;
    }
    public void compra(int qntItens){
        qntEstoque += qntItens;
    }
    public void venda(int qntItens){
        qntEstoque -= qntItens;
    }

}
