import java.util.Scanner;

public class metmais {
    static Scanner oi = new Scanner(System.in);

    public static void main(String[] args) {
        exe09();
    }

    public static void exe02() {
        System.out.println("Digite alguma coisa");
        String algumaCoisa = oi.nextLine();
        System.out.println("Digite alguma coisa de novo");
        String outracoisa = oi.nextLine();
        if (algumaCoisa.contains(outracoisa)) {
            System.out.println(outracoisa + " faz parte de" + algumaCoisa);
        } else if (outracoisa.contains(algumaCoisa)) {
            System.out.println(algumaCoisa + "faz parte de" + outracoisa);
        } else {
            System.out.println("Menhuma string faz parte da outra");
        }
    }

    public static void exe04() {
        System.out.println("Digite alguma coisa");
        String algumaCoisa = oi.nextLine();
        System.out.println("Digite alguma coisa de novo");
        String outracoisa = oi.nextLine();
        if (algumaCoisa.startsWith(outracoisa)) {
            System.out.println(algumaCoisa + " é prefixo de " + algumaCoisa);

        } else if (outracoisa.startsWith(algumaCoisa)) {
            System.out.println(algumaCoisa + " é prefixo de " + outracoisa);

        } else {
            System.out.println("Nao são prefixo");
        }

    }

    public static void exe05() {
        System.out.println("Digite alguma coisa");
        String algumaCoisa = oi.nextLine();
        System.out.println("Digite alguma coisa de novo");
        String outracoisa = oi.nextLine();
        if (algumaCoisa.endsWith(outracoisa)) {
            System.out.println(algumaCoisa + " é sufixo de " + algumaCoisa);

        } else if (outracoisa.endsWith(algumaCoisa)) {
            System.out.println(algumaCoisa + " é sufixo de " + outracoisa);

        } else {
            System.out.println("Nao são sufixo");
        }

    }

    public static void exe06() {
        System.out.println("Digite alguma coisa");
        String algumaCoisa = oi.nextLine();
        System.out.println("Digite alguma coisa de novo");
        String outracoisa = oi.nextLine();
        int pos = algumaCoisa.indexOf(outracoisa);
        System.out.println("A posição de " + outracoisa + " em " + algumaCoisa + " é " + pos);

    }

    public static void exe07() {
        String cyp = "lala#lwve#-rwgra22lalang!#<3";
        String decifrar = cyp.replace("w", "o");
        decifrar = decifrar.replace("#", " ");
        decifrar = decifrar.replace("2", "m");
        decifrar = decifrar.replace("lala", "i");
        decifrar = decifrar.replace("-", "p");
        System.out.println(decifrar);
    }

    public static void exe08() {
        System.out.println("Informe a quantidade de números");
        int nums = oi.nextInt();
        int [] numeros = new int[nums];
        for (int i = 0; i < nums ; i++) {
            System.out.println("Informe um número");
            numeros [i] = oi.nextInt();
        }
        int somaPar = 0, somaImpar = 0;
        for (int valor : numeros) {
            if(valor % 2 == 0) {
                somaPar += valor;
            }else{
                somaImpar += valor ;
            }
        }
        System.out.println("Soma dos valores pares:  " +somaPar);
        System.out.println("Soma dos valores ímpares:  " + somaImpar);

    }
    public static void exe09() {
        int n[] = {3,7,1,4};
        for (int i=0; i<=3; i++) {
            System.out.println(n[i]);
        }

    }

}