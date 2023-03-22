package day014NestedWhileDoWhile;

public class C04_NestedForLoop {
    public static void main(String[] args) {
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= 6; j++) {
                System.out.print("*");
            }
            System.out.println();

        }


        for (int i = 6; 0<=i; i--) {
            for (int j = 1; j<=i ; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}

