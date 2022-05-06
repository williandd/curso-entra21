public class maisexe {
    public static void main(String[] args) {
        String var1 = "Did you know about the aclameid MMO FFXIV?";
        int qtde = 0;
        for (int oi = 0; oi < var1.length(); oi++) {
            if (var1.charAt(oi) == 'a' ) {
    qtde++;
            }
        }
        System.out.println(qtde);
    }
}
