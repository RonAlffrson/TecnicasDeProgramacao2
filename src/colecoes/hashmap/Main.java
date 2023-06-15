package colecoes.hashmap;

import colecoes.turma.Aluno;

import java.util.HashMap;
import java.util.Iterator;

public class Main {
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
        //---------------------------------------------------
        HashMap<Integer, Aluno> mapaAlunos = new HashMap<>();

        Aluno aluno1 = new Aluno("renan", 1);
        Aluno aluno2 = new Aluno("ed", 2);
        mapaAlunos.put(1, aluno1);
        mapaAlunos.put(2, aluno2);

        Iterator<Integer> itk2 = mapaAlunos.keySet().iterator();
        Iterator<Aluno> itv2 = mapaAlunos.values().iterator();
        System.out.println(mapaAlunos.get(1));

        while(itk2.hasNext() && itv2.hasNext()){
            Integer chave = itk2.next();
            Aluno valor = itv2.next();
            System.out.println(chave + ": " + valor.getNome());
        }
    }
}
