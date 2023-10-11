import java.util.Scanner;
public class uppgift1_operatorer {
    public static void main(String args[]){
        Scanner tb = new Scanner (System.in);
        System.out.println("tal 1: ");
        int tal1 = tb.nextInt();
        System.out.println("tal 2: ");
        int tal2 = tb.nextInt();

        if (tal1 == tal2) {
            System.out.println("Tal 1 är lika med tal 2");
        }
        else {
            System.out.println("Tal 1 är inte lika med tal 2");
        }
    }
}