
import java.util.Scanner;

public class vki {
    public static void main(String[] args) {
        int kilo;
        double vki,boy;
        Scanner s = new Scanner(System.in);
        System.out.print("Boyunuzu Giriniz= ");
        boy=s.nextDouble();
        System.out.print("Kilonuzu Giriniz= ");
        kilo=s.nextInt();
        vki= kilo/ (boy*boy);
        System.out.print("Vücut Kitle İndeksi= " +vki);
        
                            }
}
