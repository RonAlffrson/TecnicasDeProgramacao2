package colecoes.turma;

import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Insira o código e a descrição da turma: ");
        int codigo = scan.nextInt();
        scan.nextLine();
        String descricao = scan.next();
        Turma turma = new Turma(codigo, descricao);
        int matricula;
        String nome, confimacao;

        scan.nextLine();
        System.out.println("Inserir alunos? (S/n)");
        confimacao = scan.nextLine();
        while (confimacao.equalsIgnoreCase("S")){
            System.out.print("Insira o nome e a matricula: ");
            nome = scan.next();
            matricula = scan.nextInt();
            scan.nextLine();
            Aluno aluno = new Aluno(nome, matricula);
            turma.alunos.add(aluno);
            System.out.println("Inserir alunos? (S/n)");
            confimacao = scan.nextLine();
        }

        Collections.sort(turma.alunos);
        for (Aluno aluno : turma.alunos){
            System.out.println(aluno.getMatricula() + " - "  + aluno.getNome());
        }



    }
}
