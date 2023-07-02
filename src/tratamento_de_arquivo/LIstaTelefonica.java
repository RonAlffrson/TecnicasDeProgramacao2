package tratamento_de_arquivo;
import java.io.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class LIstaTelefonica {
    public static void main(String[] args) throws IOException {
        HashMap<Integer,String> listaTelefonica = new HashMap<>();
        //criação e escrita do arquivo
        Scanner scan = new Scanner(System.in);
        String nome = null;
        int telefone;
        boolean error;

        try(PrintWriter arquivo = new PrintWriter(new FileWriter("lista_telefonica.txt", true))) {
            do {
                do {
                    error = false;
                    try {
                        System.out.println("Insira o primeiro e último nome (se quiser parar o programa digite 'fechar'): ");
                        nome = scan.nextLine();
                        arquivo.print(nome + " - ");
                        System.out.println("Insira o telefone (se quiser parar digite '0'): ");
                        telefone = scan.nextInt();
                        scan.nextLine();
                        arquivo.print(telefone);
                        arquivo.println();
                        listaTelefonica.put(telefone, nome);
                        arquivo.println(listaTelefonica);
                    } catch (Exception e) {
                        error = true;
                        System.out.println(e.getMessage());
                        scan.nextLine();
                    }
                } while (error);

            } while (!nome.equals("fechar"));
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        //===============================================================================================================
        //leitura e pesquisa do arquivo
        Scanner arquivo = null;
        try {
            FileReader in = new FileReader("lista_telefonica.txt");
            arquivo = new Scanner(in);
            listaTelefonica.remove(0);
            String procura;
            System.out.println("Lista telefônica: " + listaTelefonica);
            System.out.println("insira um nome para ser procurado na lista tefelônica: ");
            procura = scan.nextLine();

            //procura de uma chave por meio de um valor
            if (listaTelefonica.containsValue(procura)){
                Iterator<String> itv = listaTelefonica.values().iterator();
                Iterator<Integer> itk = listaTelefonica.keySet().iterator();

                while (itk.hasNext() && itv.hasNext()){
                    Integer chave = itk.next();
                    String valor = itv.next();
                    if (procura.equals(valor))
                        System.out.println(valor + " - " + chave);
                }
            }

        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        finally {
            assert arquivo != null;
            arquivo.close();
        }
    }
}

