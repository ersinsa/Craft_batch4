package day014NestedWhileDoWhile;

public class C09_DoWhileLoop {
    public static void main(String[] args) {
        boolean a= true;
        for (int i=0;a;){
            System.out.println("Hello World!--For Loop");
        }
        System.out.println("-----------------------------");

        while (a){
            System.out.println("Hello World-- While Loop");
        }
        System.out.println("---------------------------------------");

        do {
            System.out.println("Hello World --- Do While Loop");
        }while(a);
    }
}
