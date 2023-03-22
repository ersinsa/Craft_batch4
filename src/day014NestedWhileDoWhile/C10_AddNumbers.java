package day014NestedWhileDoWhile;

import java.util.Scanner;

public class C10_AddNumbers {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Bir Sayi Gir :  ");
        int n=scan.nextInt();
        int sum=n;

        while (n!=0){
            System.out.println("Toplanmasini istediginiz sayiyi Giriniz: " );
            n= scan.nextInt();
            sum+=n;

        }
        System.out.println("Toplam= "+sum);

    }
}
