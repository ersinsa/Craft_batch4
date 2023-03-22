package day016_Branching_Statements;

import java.util.Scanner;

public class C01_Day15_recap {
    public static void main(String[] args) {
    /*    int taban=3;
        int tavan=4;

        int result=1;

    if (taban==0&&tavan==0){
        result=0;

}
        for (int i =0 ; i<tavan; i++){
            result*=taban;
        } System.out.println(result);
        */
        int k =6;
        for (int i=1; i<=k; i++){
            for (int j=1; j<=(2*i);j++){
            System.out.print("*");
        }


            Scanner scan= new Scanner(System.in);
            boolean flag =true;

            while(flag){
                System.out.println("x: ");
                int x= scan.nextInt();
                System.out.println("y:  ");
                int y= scan.nextInt();
                int result=x+y;
                if (x == 0 && y == 0) {
                    break;
                }
                if (result>=25){
                    flag=false;
                    System.out.println("Total 25 equal and greater than the number and exit the code");
                    continue;
                }else {
                    System.out.println("Total:  "+result);


                }
                System.out.println("Program sonlandi");

            }

    }}}


