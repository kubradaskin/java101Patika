
import java.util.Scanner;

public class ciftVe4KatiToplami {
    public static void main(String[] args) {
         Scanner s = new Scanner(System.in);
        int toplam=0;
        int sayi;
        do {
            System.out.print("Sayı gir= "); 
            sayi = s.nextInt();
            if(sayi%2 == 0 && sayi%4 == 0){
                toplam += sayi;
            }
        } while (sayi%2==0);
        System.out.println("Toplam = "+toplam);
         
         
    }
}
