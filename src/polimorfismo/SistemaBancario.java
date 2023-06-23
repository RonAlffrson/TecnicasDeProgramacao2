package polimorfismo;

import polimorfismo.ex35.ContaComum;

public class SistemaBancario {
}
abstract class Pagamento{
    protected double valor;
    protected String data;

    public Pagamento(double valor, String data){
        setValor(valor);
        setData(data);
    }
    public double getValor(){return valor;}
    public void setValor(double valor){if (valor > 0) this.valor = valor;}
    public String getData(String data){return data;}
    public void setData(String data){
        if (data.length() < 8 || ((data.charAt(2) != '/') && (data.charAt(5) != '/'))){
            throw new IllegalArgumentException("Formato de data incorreta. Formato aceito: '00/00/0000'");
        }
    }
    public boolean processarPagamento(ContaComum conta){
        conta.saldo -= valor;
        return true;
    }
}
class PagamentoOnline extends Pagamento{
    private int qntParcelas;
    private String numCartao, bandeira;

    public String getNumCartao() {return numCartao;}

    public void setNumCartao(String numCartao) {
        if (numCartao.length() == 16) this.numCartao = numCartao;
    }

    public int getQntParcelas() {
        return qntParcelas;
    }

    public void setQntParcelas(int qntParcelas) {
        if (qntParcelas > 0) this.qntParcelas = qntParcelas;
    }

    public String getBandeira() {
        return bandeira;
    }

    public void setBandeira(String bandeira) {
        if (!bandeira.isEmpty())
            this.bandeira = bandeira;
    }

    public PagamentoOnline(double valor, String data, int qntParcelas, String numCartao, String bandeira) {
        super(valor, data);
        setQntParcelas(qntParcelas);
        setNumCartao(numCartao);
        setBandeira(bandeira);
    }

    public void exibirDetalhes(){
        System.out.println("valor: " + valor + " data: " + data + " qnt de parcelas: " + qntParcelas + " num do cartao: " + numCartao +
                " bandeira: " + bandeira);
    }

    public boolean processarPagamento(ContaComum conta, int parcelas, double juros){
        if (qntParcelas > parcelas)
            conta.saldo -= valor + (valor * juros);
        return true;
    }

}


class PagamentoBoleto extends Pagamento{
    private int numBoleto;
    private String dataVencimento;
    public boolean jaVenceu;

    public PagamentoBoleto(double valor, String data, int numBoleto, String dataVencimento, boolean jaVenceu){
        super(valor, data);
        setNumBoleto(numBoleto);
        setDataVencimento(dataVencimento);
        this.jaVenceu = jaVenceu;
    }

    public int getNumBoleto() {return numBoleto;}
    public void setNumBoleto(int numBoleto) {if (numBoleto > 0) this.numBoleto = numBoleto;}
    public String getDataVencimento(String data){return data;}
    public void setDataVencimento(String data){
        if (data.length() < 8 || ((data.charAt(2) != '/') && (data.charAt(5) != '/'))){
            throw new IllegalArgumentException("Formato de data incorreta. Formato aceito: '00/00/0000'");
        }
    }

    public void exibirDetalhes(){
        System.out.println("valor: " + valor + " data: " + data + " data de vencimento: " + dataVencimento + " num do boleto: " + numBoleto +
                " já venceu: " + jaVenceu);
    }

@Override
    public boolean processarPagamento(ContaComum conta){
        conta.saldo -= valor;
        return true;
    }

    public boolean processarPagamento(ContaComum conta, double multa) {
        conta.saldo -= valor + multa;
        return true;
    }
}

