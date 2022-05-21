import java.util.Scanner;

public class repet2 {
    public static void main(String[] args) {
        Scanner oi = new Scanner(System.in);
        int maior = 0, menor = 0;
        int parada = -1;
        boolean primeiro = true;
        while (true) {

            System.out.print("Informe um numero (0 para sair): ");
            parada = oi.nextInt();
            if (parada == 0) {
                break;
            }
            if (primeiro) {
                menor = parada;
                maior = parada;
                primeiro = false;
            } else {
                if (parada > maior) {
                    maior = parada;
                }
                if (parada < menor) {
                    menor = parada;
                }

            }
        }
            System.out.println("Menor valor informado:  " + menor);
            System.out.println("Maior valor informado:  " + maior);

    }

}