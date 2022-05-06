import java.util.Scanner;

public class exercicios {
    public static void main(String[] args) {
        Scanner oi = new Scanner(System.in);
        System.out.println("Qual tabuada voce deseja saber?");
        int valor = oi.nextInt();
        while (valor != 0){
            for (int oie = 0; oie <= 10; oie++) {
                System.out.println(oie*valor);
            }
            System.out.println("Qual tabuada voce deseja saber?");
            valor = oi.nextInt();
        }
    }
}
