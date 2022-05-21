import java.util.Scanner;

public class maisexearray {
    public static void main(String[] args) {
        Scanner oi = new Scanner(System.in);

        System.out.println("Digite uma palavra :");
        String palavra = oi.nextLine();
        String reverse = "";
        for (int i = palavra.length()-1 ; i >= 0; i--) {
            reverse += palavra.charAt(i);
            reverse = new StringBuilder(palavra).reverse().toString();

        }
        if (reverse.equals(palavra)) {
            System.out.println("É palindromo");

        } else {
            System.out.println("Não é palindromo");
        }
    }

}
