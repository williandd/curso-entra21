import java.util.Scanner;

public class aularecap {
    public static Scanner oi = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Informe um numero");
        String numero = String.valueOf(oi.nextInt());// esse comando converte o valor de numero para string
        String inverso = "";
        for (int i = numero.length()-1; i >= 0; i--) {
            inverso = inverso + String.valueOf(numero.charAt(i));

        }
        System.out.println("O inverso é: " + inverso);


    }


    }


