package vetores_tipoEnumerado;

import java.util.Random;

public enum BlackJack {
    AS(14, "Ás"),
    DOIS(2, "Dois"),
    TRES(3, "Três"),
    QUAT(4, "Quatro"),
    CINC(5, "Cinco"),
    SEIS(6, "Seis"),
    SETE(7, "Sete"),
    OITO(8, "Oito"),
    NOVE(9, "Nove"),
    DEZ(10, "Dez"),
    VAL(11, "Valete"),
    DAMA(12, "Dama"),
    REI(13, "Rei");

    private final String nomecarta;
    private final int valorCarta;

    private BlackJack(int valorCarta, String nomecarta){
        this.valorCarta = valorCarta;
        this.nomecarta = nomecarta;
    }

    public int getValorCarta() {
        return valorCarta;
    }

    @Override
    public String toString() {
        return nomecarta;
    }

    public static void main(String[] args) {
        BlackJack cartaDealer = BlackJack.AS;
        BlackJack cartaJogador = BlackJack.AS;
        Random random = new Random();
        int valorCartaDealer = random.nextInt(14) + 2;
        int valorCartaJogador = random.nextInt(14) + 1;
        for (BlackJack carta : BlackJack.values()){
            if (valorCartaDealer == carta.getValorCarta()){
                cartaDealer = carta;
            }
            if (valorCartaJogador == carta.getValorCarta()){
                cartaJogador = carta;
            }
        }
        if (valorCartaDealer > valorCartaJogador){
            System.out.println("Dealer venceu com um " + cartaDealer + " e jogador com um " + cartaJogador);
        }
        else if (valorCartaJogador > valorCartaDealer) {
            System.out.println("Jogador venceu com um " + cartaJogador + " e dealer com um " + cartaDealer);
        }
        else{
            System.out.println("Empate");
        }
    }
}
