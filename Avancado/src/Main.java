import java.util.ArrayList;
import java.util.Scanner;

public class Main {


    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        ex3();


    }

    public static void ex1() {
        // pedir pro usuário informar x numeros inteiros até ele digitar 0
        // quando ele digitar 0, mostrar a lista dos números digitados por ele
        ArrayList inteiros = new ArrayList();
        while (true) {
            System.out.print("Digite um número inteiro: ");
            int escolha = in.nextInt();
            inteiros.add(escolha);
            if (escolha == 0) {
                break;
            }

        }
        System.out.println("Valores informados: ");
        System.out.println(inteiros);
    }


    public static void ex2() {
        ArrayList inteiros = new ArrayList<>();
        int somaPar = 0, somaImpar = 0;
        double somaTotal = 0.0;

        while (true) {
            System.out.print("Digite um número inteiro:  ");
            int escolha = in.nextInt();
            if (escolha % 2 == 0) {
                somaPar += escolha;
            } else {
                somaImpar += escolha;
            }
            somaTotal += escolha;
            inteiros.add(escolha);
            if (escolha == 0) {
                break;
            }

        }
        System.out.println("Valores informados: " + inteiros);
        System.out.println("Soma dos valores pares: " + somaPar);
        System.out.println("Soma dos valores impares: " + somaImpar);
        System.out.println("Média dos valores informados: " + (somaTotal / inteiros.size()));


    }

    public static void ex3() {
        ArrayList<String> palavras = new ArrayList<>();
        while (true) {
            System.out.println("Digite uma palavra: ");
            String palavra = in.nextLine();

            if (palavra.equalsIgnoreCase("sair")) {
                break;
            }
            palavras.add(palavra);
        }

            System.out.println("Digite um número inteiro: ");
            int num = in.nextInt();
            if (num <= 0) {
                System.out.println("Digite um número maior que 0: ");
            }
            for (int i = 0; i < palavras.size(); i++){
                if (palavras.get(i).length() < num){
                    palavras.remove(i);
                    i--;
                }
        }
        System.out.println(palavras);


    }

}





