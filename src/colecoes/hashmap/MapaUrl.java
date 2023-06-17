package colecoes.hashmap;

import java.util.HashMap;
import java.util.Iterator;

public class MapaUrl {
    public static void main(String[] args) {

        HashMap<String,String> mapa = new HashMap<>();
        mapa.put("localhost", "127.0.0.1");
        mapa.put("www.uva.br", "187.12.201.162");
        mapa.put("www.google.com", "74.125.228.81");
        mapa.put("www.globo.com", "186.192.90.5");

        Iterator<String> itk = mapa.keySet().iterator();
        Iterator<String> itv = mapa.values().iterator();
        System.out.println(mapa.get("localhost"));

        while(itk.hasNext() && itv.hasNext()){
            String chave = itk.next();
            String valor = itv.next();
            System.out.println(chave + ": " + valor);
    }
    }
}
