package day017_Methods;

/*import java.util.Random;
import java.util.Scanner;

public class C02_Tahmin_oyunu {
    public static void main(String[] args) {
        // bilgisayarin tutdugu 0 dahil 0 50 arasi sayiyi 5 hamlede bulunuz
        //tutdugu sayidan dusuk bir tyahmin ise yukari
        // tuttugu syiudan yuksek bir tahmin yaparsak asagi


        Random random=new Random();
        int sayi= random.nextInt(50);
        System.out.println(sayi);

        int numara;
        int tahmin;

        Scanner scan =new Scanner(System.in);
        System.out.println("Numariyi giriniz: ");
        numara= scan.nextInt();
int i=1;
        while (i<=5){
            System.out.println("Tahmin: ");
            tahmin= scan.nextInt();
            if (tahmin==numara){

                System.out.println("Dogru Bildiniz!");

            } else if (tahmin<numara) {
                System.out.println("YUKARI");

            } else if (tahmin>numara) {
                System.out.println("ASAGI");public static void main(String[] args) {

                    // Bilgisayarın tuttuğu 0 dahil-50 arası
                    // sayısıyı 5 hamlede bulma
                    // tuttuğu sayıdan düşük bir tahmin yaparsak yukarı
                    //tuttuğu sayıdan yüksek bir tahmin yaparsak aşağı

                    Random random=new Random();
                    int sayi= random.nextInt(50);

                    //5 yukarı
                    // 30 aşağı
                    // tebrikler
                    //malesefe bilemedin tuttuğum sayı 28
                    Scanner scan=new Scanner(System.in);
                    int i=1;
                    while(i<=5){
                        System.out.print(i+".Tahmin: ");
                        int tahmin= scan.nextInt();
                        if(tahmin>sayi && i!=5){
                            System.out.println("Aşağı");
                        }else if(tahmin<sayi && i!=5){
                            System.out.println("Yukarı");
                        }else if(tahmin==sayi) {
                            System.out.println("Tebrikler");
                            break;
                        }
                        i++;
                        if(i==6){
                            System.out.println("malesef bilemedin tuttuğum sayı: "+sayi);


            }
        }
    }
}*/
