
import java.util.Scanner;

public class ortalama {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        int k,sayi,toplam=0;
        double sonuc;
        System.out.println("Kaç adet sayının ortalamasını alacaksınız:");
        k=s.nextInt();
        for(int i=1;i<=k;i++) {
        System.out.println(i+". Sayı:");
        sayi=s.nextInt();
        toplam=toplam+sayi;
        }
        sonuc=toplam/k;
        System.out.println("Sonuç:"+sonuc);
    }
}
