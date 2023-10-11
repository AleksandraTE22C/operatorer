import java.util.Scanner;
public class uppgift1_operatorer {
    public static void main(String args[]){
        Scanner tb = new Scanner (System.in);

        System.out.println("Uppgift A");

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
        
        System.out.println(" ");
        System.out.println("Uppgift B");
        int[] fält = new int[3];  
        System.out.println("Skriv tre nummer: ");  
        for(int i=0; i<3; i++)  
        {   
        fält[i]=tb.nextInt();  
        }

        System.out.println("Fältet innehåller talen: "+fält[0]+ "," +fält[1]+ "," +fält[2]);

        if (fält[0] > fält[1]){
            System.out.println(fält[0]+ " är större än " +fält[1]);
        }
            else if (fält[0] > fält[2]){
                System.out.println(fält[0]+ " är större än " +fält[2]);
            }
            else {
                System.out.println(fält[0]+ " är inte större än " +fält[1]+ " eller " +fält[2]);
            }
        
        if (fält[0] < fält[1]){
            System.out.println(fält[0]+ " är mindre än " +fält[1]);
        }
            else if (fält[0] < fält[2]){
                System.out.println(fält[0]+ " är mindre än " +fält[2]);
            }
            else{
                System.out.println(fält[0]+ " är inte mindre än " +fält[1]+ " eller " +fält[2]);
            }

        if (fält[0] == fält[1]){
            System.out.println(fält[0]+ " är lika med " +fält[1]);
        }
            else if (fält[0] == fält[2]){
                System.out.println(fält[0]+ " är lika med " +fält[2]);
            }
            else{
                System.out.println(fält[0]+ " är inte lika med " +fält[1]+ " eller " +fält[2]);
            }
    }
}