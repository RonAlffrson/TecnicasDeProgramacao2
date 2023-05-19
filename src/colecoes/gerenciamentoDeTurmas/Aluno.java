package colecoes.gerenciamentoDeTurmas;

public class Aluno {
    String nome;
    int idade;

    public Aluno(String nome, int idade){
        this.nome = nome.trim();
        this.idade = idade;
    }

    public void exibir_informacoes(){
        System.out.println("Nome: " + nome + " -- Idade: " + idade);
    }


}
