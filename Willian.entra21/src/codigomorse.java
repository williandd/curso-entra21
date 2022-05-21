import java.util.Scanner;

public class codigomorse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite 1 para codificar e 2 para decodificar");
        int codoudecod = in.nextInt();
        in.nextLine();
        char[] alfabeto =
                {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't',
                        'u', 'v', 'w', 'x', 'y', 'z', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', ',', '.', ':', ';', '!', '?'};
        String[] codigo = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-",
                ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..",
                ".----", "..---", "...--", "....-", ".....", "----.", "---..", "--...", "-....", "-----", "--..--",
                ".-.-.-", "---...", "-.-.-.", "-.-.--", "..--.."};

        if (codoudecod == 2) {
            System.out.println("Digite uma palavra");
            String resposta = in.nextLine();
            String[] palavras = resposta.split(" ");
            for (int f = 0; f < palavras.length; f++) {
                String[] caracteres = palavras[f].split("");
                for (int i = 0; i < caracteres.length; i++) {
                    for (int j = 0; j < alfabeto.length; j++) {

                        if (caracteres[i].charAt(0) == alfabeto[j]) {
                            System.out.print(codigo[j] + "|");
                            break;
                        }
                    }
                }
                if (palavras.length > 0) {
                    System.out.print("*|");
                }
            }


        } else {
            System.out.println("Digite um codigo");
            String segredo = in.nextLine();
            String[] morse = segredo.split("\\|");
            for (int i = 0; i < morse.length; i++) {
                for (int j = 0; j < alfabeto.length; j++) {
                    if (morse[i].equals("*")) {
                        System.out.print(" "); break;
                    }
                    /*checar se morse[i] = *, printar um " "*/
                    else if (morse[i].equals(codigo[j])) {
                        System.out.print(alfabeto[j]);
                        break;


                    }}
            }
        }
        }
    }



