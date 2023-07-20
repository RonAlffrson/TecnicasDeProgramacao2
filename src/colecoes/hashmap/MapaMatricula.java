package colecoes.hashmap;

import colecoes.turma.Aluno;

import java.util.HashMap;
import java.util.Iterator;

public class MapaMatricula {
    public static void main(String[] args) {
        HashMap<Integer, Aluno> mapaAlunos = new HashMap<>();

        Aluno aluno1 = new Aluno("renan", 1);
        Aluno aluno2 = new Aluno("ed",  2);
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
