
import java.util.Scanner;

public class manav {
    public static void main(String[] args) {
     double a=2.14, e=3.67, d=1.11, m=0.95, p=5.0;
     double toplam;
     Scanner s = new Scanner(System.in);
     System.out.print("Armut kaç kilo= "); 
     a=s.nextDouble();
     System.out.print("Elma kaç kilo= ");
     e=s.nextDouble();
     System.out.print("Domates kaç kilo= ");
     d=s.nextDouble();
     System.out.print("Muz kaç kilo= ");
     m=s.nextDouble();
     System.out.print("Patlıcan kaç kilo= ");
     p=s.nextDouble();
     toplam=(a*2.14)+(e*3.67)+(d*1.11)+(m*0.95)+(p*5.0);
     System.out.print("Toplam= " +toplam);
  
        }
}
