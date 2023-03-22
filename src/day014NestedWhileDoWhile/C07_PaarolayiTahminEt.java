package day014NestedWhileDoWhile;

import java.util.Scanner;

public class C07_PaarolayiTahminEt {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        String parola="safak";
        String tahmin="";
        int hak=3;
        System.out.println("Parolayi Tahmin Ediniz ve Toplam '3' hakkiniz vardir :  ");

        while(0<=hak){
            tahmin=scan.nextLine();
            if(tahmin.equals(parola)){
                System.out.println("Tebrikler Girisiniz Tamamlandi --- Password entry was succesful. You are all set !!");
                break;
            }else {
                System.out.println("The password entry was failed"+(--hak));
            }
        }
    }
}
