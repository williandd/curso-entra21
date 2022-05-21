import java.util.Scanner;

public class stringexes {
    public static void main(String[] args) {
        Scanner oi = new Scanner(System.in);
        System.out.println("Digite seu nome completo");
        String nome = oi.nextLine();
        System.out.println(nome);
        String[] nomes = nome.split(" ");
        System.out.println(nomes[0].charAt(0)+" . " +nomes[1].charAt(0)+".");







    }
}
