package polimorfismo;

public class SistemaBancario {
}
abstract class Pagamento{
    protected double valor;
    protected String data = "20/20/2000";

    public Pagamento(double valor, String data){
        setValor(valor);
        setData(data);
    }
    public double getValor(){return valor;}
    public void setValor(double valor){
        if (valor > 0) this.valor = valor;
    }
    public void setData(String data){
        if (data.length() < 8 || !data.contains("/"))
            throw new IllegalArgumentException("Formato de data incorreta. Formato aceito: '00/00/0000'");
    }
}
class PagamentoOnline extends Pagamento{
    private int numCartao, qntParcelas;
    private String bandeira;

    public int getNumCartao() {
        return numCartao;
    }

    public void setNumCartao(int numCartao) {
        if (numCartao > 0 && 9999999999999999) this.numCartao = numCartao;
    }

    public int getQntParcelas() {
        return qntParcelas;
    }

    public void setQntParcelas(int qntParcelas) {
        this.qntParcelas = qntParcelas;
    }

    public String getBandeira() {
        return bandeira;
    }

    public void setBandeira(String bandeira) {
        this.bandeira = bandeira;
    }

    public PagamentoOnline(double valor, String data) {
        super(valor, data);
    }
}
class PagamentoBoleto{

}

