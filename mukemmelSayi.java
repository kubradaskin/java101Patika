
import java.util.Scanner;


public class mukemmelSayi {
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
        int toplam = 0;
        System.out.print("Bir sayi giriniz: ");
        int sayi = s.nextInt();
        
        for(int i = 1; i < sayi; i++)
        {
            if(sayi % i == 0) {
                toplam += i;
            }
        }
        if(sayi == toplam) {
            System.out.println(sayi + " Mükemmel bir sayidir");
        }
        else {
            System.out.println(sayi + " Mükemmel bir sayi değildir.");
        }
}
}
