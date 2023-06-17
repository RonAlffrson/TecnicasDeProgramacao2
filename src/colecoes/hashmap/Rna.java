package colecoes.hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Rna {
    private String trincas;
    private final String nome;

    public Rna(String trincas){
        setTrincas(trincas);
        StringBuilder subTrinca = new StringBuilder();
        StringBuilder nomeBuilder = new StringBuilder();
        if (trincas.length() % 3 != 0)
            throw new IllegalArgumentException("Trinca incorreta");

        ArrayList<String> arrayTrincas = new ArrayList<>();
        for (int j = 0; j < trincas.length(); j += 3){
            subTrinca = new StringBuilder();

            for (int i = j; i < j+3; i++)
                subTrinca.append(trincas.charAt(i));

            arrayTrincas.add(subTrinca.toString());
        }

        for (String str : arrayTrincas){
            nomeBuilder.append(mapa.get(str));
        }
        nome = nomeBuilder.toString();
    }
    
    Map<String, String> mapaImutavel = Map.of("UUU", "phe",
                                                "UUA", "Loa",
                                                "AAG", "Lisina",
                                                "UCU", "Ser",
                                                "UAU", "Tyr",
                                                "CAA", "Gin");
    HashMap<String, String> mapa = new HashMap<>(mapaImutavel);

    public String getTrincas() {
        return trincas;
    }

    public void setTrincas(String trincas) {
        if (!trincas.isEmpty()) this.trincas = trincas.toUpperCase();
    }

    public static void main(String[] args) {
        Rna rna = new Rna("UUUCAAUAU");
        System.out.println(rna.nome);
    }
}
