package day017_Methods;

public class Methods_01 {
    public static void main(String[] args) {
       /* int x = 6;
        if (x == 5) {
            hello();
        } else if (x == 6) {
            Menu();

        }*/
        int n = 6;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i)-1; k++){
                System.out.print("*");


        }
        System.out.println();
    }
}}


    /*public static void hello(){
        System.out.println("Welcome to the Bank Of America");
    }
    public static void Menu(){
        System.out.println("1-Para cekme  2- Para Yatirma  3- Bakiye Goruntule  4- Cikis");
    }*/


