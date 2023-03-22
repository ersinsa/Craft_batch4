package Day015_If_else_Switch_Loops_Summary;

import java.util.Scanner;

public class C04_Switch_Case {
    public static void main(String[] args) {
        // byte short int char string
       /* int x = 2;
        switch (x) {
            case 1:
                System.out.println("A");
                c break;
            case 2:
                System.out.println("B");
                break;
            case 3:
                System.out.println("C");
                break;
            case 4:
                System.out.println("D");
                break;
            default:
                System.out.println("F");
        }*/
//
        Scanner scan = new Scanner(System.in);
        System.out.println("et menu,sebze menu,cocuk menu,(1-2-3):   ");
        int tercih1= scan.nextInt();
        switch (tercih1){
            case 1 :
                System.out.println("Pirzola mi(1) ? TAVUK Mu(2)?");
                int tercih2 = scan.nextInt();
                switch (tercih2){
                    case 1 :
                        System.out.println("PIRZOLA : 50 ");
                    break;
                    case 2:
                        System.out.println("Tavuk 30 ");
                        break;
                    default:
                        System.out.println("Hatali Giris");
                }



        }

    }
}
