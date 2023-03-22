package Day015_If_else_Switch_Loops_Summary;

public class C03_Nested_If {
    public static void main(String[] args) {
        // if ali has 100$ , he should go to out , if he doesnt he must not go

        int AliParasi=40;
        boolean zaman=true;

        if (AliParasi>=100){
            if (zaman){

            System.out.println("Gidebilir");

        }else{
                System.out.println("zamani yok gidemeez");
            }
            }else {
            System.out.println("parasi gidemez");

        }
        System.out.println("");
    }
}
