
import java.util.Scanner;

public class artikYil {
    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       System.out.print("Yıl Giriniz: "); 
       int yil = s.nextInt();
      if (((yil % 4 == 0) && (yil % 100!= 0)) || (yil%400 == 0))
         System.out.println(yil+" artik bir yildir");
      else
         System.out.println(yil+" artik bir yil değildir."); 
        
        
    }
}
