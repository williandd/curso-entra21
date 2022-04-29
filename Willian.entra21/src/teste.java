import java.util.Scanner;

public class teste {
    public static void main(String[] args) {
        Scanner teste  = new Scanner(System.in);
        System.out.println ("Digite sua idade");
        int anos = teste.nextInt();
        System.out.println ("Digite a idade do seu irmão");
        int idade = teste.nextInt();
        System.out.printf("Ambos viveram %d anos", anos + idade);




    }
}
