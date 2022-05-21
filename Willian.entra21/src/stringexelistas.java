import java.util.Scanner;

public class stringexelistas {
    public static void main(String[] args) {
        Scanner oi = new Scanner(System.in);
        System.out.println("Digite uma frase");
        String frase = oi.nextLine();
        int espacos = 0;

        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == ' ') {
                espacos ++;
            }
        }
        System.out.println("A quantidade de espaços é:"  +espacos);
        }
    }