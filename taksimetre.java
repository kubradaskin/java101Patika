
import java.util.Scanner;

public class taksimetre {
    public static void main(String[] args) {
        int km;
        double perKm=2.20, total, startPrice= 10;
        Scanner s = new Scanner(System.in);
        System.out.print("Mesafeyi Giriniz= ");
        km=s.nextInt();
        total = (km+perKm);
        total +=startPrice;
        total= (total<20) ? 20:total;
        System.out.println("Toplam Tutar=" +total);
       
        
                  }
}
