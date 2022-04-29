import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
        Scanner oi = new Scanner(System.in);
        System.out.println("Quantidade de eleitores");
        int eleitores = oi.nextInt();
        System.out.println("Numeros de votos nulos");
        int nulos = oi.nextInt();
        System.out.println("Numeros de votos brancos");
        int brancos = oi.nextInt();

        int validos = eleitores - brancos - nulos;

        System.out.printf("Total de votos válidos %d\n" , validos);
        System.out.printf("Porcentagem de votos válidos %.2f%%\n" , 100.0/eleitores * validos);





    }
}
