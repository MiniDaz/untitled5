import java.util.Scanner;

public class index {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("vedite ves");
        double ves= in.nextInt();
        System.out.println("vedite rost");
        double rost= in.nextInt();
        double rostM=rost*rost/10000;
        double itog=ves/rostM;

       if(itog<15.99){
           System.out.println("Выраженный дефицит массы тела");
       }
       if (itog>=16.0&& itog<=18.49) {
            System.out.println("Недостаточная (дефицит) масса тела");
        }
        if (itog>=18.5&& itog<=24.99) {
            System.out.println("Норма");}
        if (itog>=25&& itog<=29.99) {
            System.out.println("Избыточная масса тела (предожирение)");
        }
        if(itog>=30&& itog<=34.99){
            System.out.println("Ожирение первой степени");
        }
        if (itog>=35){
            System.out.println("horosh jrat");
        }
    }
}
