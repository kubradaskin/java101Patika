
import java.util.Scanner;

public class usluSayi {
    public static void main(String[] args) {
        int n,k;
        Scanner s=new Scanner(System.in);
        System.out.print("Üssü Alınacak Sayı= ");
        n=s.nextInt();
        System.out.print("Üs Olacak Sayı= ");
        k=s.nextInt();
        int total=1;
        for(int i=1;i<=k;i++){
            total*=n;
        }
        System.out.println("Cevap=" +total);
        
          }
}
