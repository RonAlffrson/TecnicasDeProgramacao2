package tratamento_de_excecoes.operacao_matematica;

import tratamento_de_excecoes.operacao_matematica.op_binarias.*;
import tratamento_de_excecoes.operacao_matematica.op_unarias.*;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int escolha;
        boolean erro1, erro2;
        double op1, op2;
        do {
            try{
                erro2 = false;
                do{
                    System.out.println("Digite a operação escolhida: ");
                    System.out.print("1 - SOMA\n2 - SUBTRAÇÃO\n3 - MULTIPLICAÇÃO\n4 - DIVISÃO\n5 - RAIZ QUADRADA\n6 - SAIR\n");
                    System.out.print("Escolha: ");
                    escolha = scan.nextInt();
                    scan.nextLine();
                    System.out.println(" ");

                    switch (escolha){
                        case 1 -> {
                            System.out.println("Digite os dois operandos da soma: ");
                            do{
                                try{
                                    erro1 = false;
                                    System.out.print("Operando 1: ");
                                    op1 = scan.nextInt();
                                    System.out.print("Operando 2: ");
                                    op2 = scan.nextInt();
                                    scan.nextLine();
                                    Soma soma = new Soma(op1, op2);
                                    System.out.println(op1 + " + " +  op2 + " = " + soma.calcular());

                                }
                                catch (InputMismatchException e){
                                    System.out.println("Operandos devem ser números: " + e.getMessage());
                                    erro1 = true;
                                    scan.nextLine();
                                }
                                catch (RuntimeException e){
                                    System.out.println("Erro em tempo de compilção: " + e.getMessage());
                                    erro1 = true;
                                    scan.nextLine();
                                }
                                catch (Exception e){
                                    System.out.println("Erro: " + e.getMessage());
                                    erro1 = true;
                                    scan.nextLine();
                                }
                            }while(erro1);
                        }
                        case 2 -> {
                            System.out.println("Digite os dois operandos da subtração: ");
                            do{
                                try{
                                    erro1 = false;
                                    System.out.print("Operando 1: ");
                                    op1 = scan.nextInt();
                                    System.out.print("Operando 2: ");
                                    op2 = scan.nextInt();
                                    scan.nextLine();
                                    Subtracao subtracao = new Subtracao(op1, op2);
                                    System.out.println(op1 + " - " +  op2 + " = " + subtracao.calcular());

                                }
                                catch (InputMismatchException e){
                                    System.out.println("Operandos devem ser números: " + e.getMessage());
                                    erro1 = true;
                                    scan.nextLine();
                                }
                                catch (RuntimeException e){
                                    System.out.println("Erro em tempo de compilção: " + e.getMessage());
                                    erro1 = true;
                                    scan.nextLine();
                                }
                                catch (Exception e){
                                    System.out.println("Erro: " + e.getMessage());
                                    erro1 = true;
                                    scan.nextLine();
                                }
                            }while(erro1);
                        }
                        case 3 -> {
                            System.out.println("Digite os dois operandos da multiplicação: ");
                            do{
                                try{
                                    erro1 = false;
                                    System.out.print("Operando 1: ");
                                    op1 = scan.nextInt();
                                    System.out.print("Operando 2: ");
                                    op2 = scan.nextInt();
                                    scan.nextLine();
                                    Multiplicacao multiplicacao = new Multiplicacao(op1, op2);
                                    System.out.println(op1 + " * " +  op2 + " = " + multiplicacao.calcular());

                                }
                                catch (InputMismatchException e){
                                    System.out.println("Operandos devem ser números: " + e.getMessage());
                                    erro1 = true;
                                    scan.nextLine();
                                }
                                catch (RuntimeException e){
                                    System.out.println("Erro em tempo de compilção: " + e.getMessage());
                                    erro1 = true;
                                    scan.nextLine();
                                }
                                catch (Exception e){
                                    System.out.println("Erro: " + e.getMessage());
                                    erro1 = true;
                                    scan.nextLine();
                                }
                            }while(erro1);
                        }
                        case 4 -> {
                            System.out.println("Digite os dois operandos da divisão: ");
                            do{
                                try{
                                    erro1 = false;
                                    System.out.print("Operando 1: ");
                                    op1 = scan.nextInt();
                                    System.out.print("Operando 2: ");
                                    op2 = scan.nextInt();
                                    scan.nextLine();
                                    Divisao divisao = new Divisao(op1, op2);
                                    System.out.println(op1 + " / " +  op2 + " = " + divisao.calcular());

                                }
                                catch (InputMismatchException e){
                                    System.out.println("Operandos devem ser números: " + e.getMessage());
                                    erro1 = true;
                                    scan.nextLine();
                                }
                                catch (RuntimeException e){
                                    System.out.println("Erro em tempo de compilção: " + e.getMessage());
                                    erro1 = true;
                                    scan.nextLine();
                                }
                                catch (Exception e){
                                    System.out.println("Erro: " + e.getMessage());
                                    erro1 = true;
                                    scan.nextLine();
                                }
                            }while(erro1);
                        }
                        case 5 -> {
                            System.out.println("Digite o operando da radiciação: ");
                            do{
                                try{
                                    erro1 = false;
                                    System.out.print("Operando 1: ");
                                    op1 = scan.nextInt();
                                    scan.nextLine();
                                    RaizQuadrada raiz = new RaizQuadrada(op1);
                                    System.out.println("Raiz quadrada de " + op1 + " = " + raiz.calcular());

                                }
                                catch (InputMismatchException e){
                                    System.out.println("Operando deve ser número: " + e.getMessage());
                                    erro1 = true;
                                    scan.nextLine();
                                }
                                catch (RuntimeException e){
                                    System.out.println("Erro em tempo de compilção: " + e.getMessage());
                                    erro1 = true;
                                    scan.nextLine();
                                }
                                catch (Exception e){
                                    System.out.println("Erro: " + e.getMessage());
                                    erro1 = true;
                                    scan.nextLine();
                                }
                            }while(erro1);
                        }
                    }
                }while(escolha != 6);
            }

            catch (InputMismatchException e){
                System.out.println("Operando deve ser número: " + e.getMessage());
                erro2 = true;
                scan.nextLine();
            }
            catch (RuntimeException e){
                System.out.println("Erro em tempo de compilção: " + e.getMessage());
                erro2 = true;
                scan.nextLine();
            }
            catch (Exception e){
                System.out.println("Erro: " + e.getMessage());
                erro2 = true;
                scan.nextLine();
            }
        }while (erro2);
    }

}
