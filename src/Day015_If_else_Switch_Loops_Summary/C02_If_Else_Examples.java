package Day015_If_else_Switch_Loops_Summary;

public class C02_If_Else_Examples {
    public static void main(String[] args) {
        int not = 100;
        String str = "";
        if (not < 40) {
            str = "F";

        } else if (not < 55) {
            str = "D";

        } else if (not < 70) {
            str = "C";

        } else if (not < 80) {
            str = "B";

        } else if (not< 97) {
            str="A";
        } else {
            str = "Hatali Giris";

        }
        if (!str.equals("")){
            System.out.println(str);
        }
        System.out.println("str = " + str);

    }
}
