import java.util.Scanner;

public class metjava {
    public static void main(String[] args) {
        Scanner oi = new Scanner(System.in);
        System.out.println("Digite alguma coisa");
        String algumaCoisa = oi.nextLine();
        System.out.println("Digite alguma coisa de novo");
        String outracoisa = oi.nextLine();

        if (algumaCoisa.equals(outracoisa)) {
            System.out.println("São iguais");
        }else if (algumaCoisa.equalsIgnoreCase(outracoisa)) {
            System.out.println("São iguais independente de case");
        }else {
            System.out.println("São diferentes");
        }

    }
}
