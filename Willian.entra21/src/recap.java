import javax.swing.*;
import java.util.Scanner;

public class recap {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean ishealer = true;
        while (ishealer) {
            System.out.println("Informe a abreviação da classe");
            String clazz = in.next();
            if (clazz.length() !=3 ) {
                System.out.println("Abreviações somente com 3 letras"); }
            else {



            switch (clazz) {
                case "pld" , "war" , "dkn" , "gnb" :
                System.out.println("Essa classe é tank"); break ;
                case "whm" , "sch" , "ast" , "sag" :
                    System.out.println("Essa classe é healer"); break ;
                case "mnk" , "drg" , "nja" , "smr" , "rpr" :
                    System.out.println("Essa classe é DPS"); break;
                default:
                    System.out.println("Essa classe não existe"); }
                    ishealer = false;
                    break; }







        }
    }
}
