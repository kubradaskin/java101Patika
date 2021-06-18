
import java.util.Scanner;

public class maxMin {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Kaç Tane Sayı Gireceksiniz= "); 
        int adim = s.nextInt(); 
        int maks=0,min=0;
        
        for (int i=1; i<=adim; i++)
        {
            System.out.print(i+". sayiyi giriniz: ");
            int sayi = s.nextInt();
            
            if (i==1)
            {
                maks=sayi;
                min=sayi;
            }
            
            if (sayi>maks)
                maks=sayi;
            
            if (sayi<min)
                min=sayi;
        }
        
        System.out.println("Maks: "+maks);
        System.out.print("Min : "+min);
       
         }
}
