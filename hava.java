
import java.util.Scanner;

public class hava {
    public static void main(String[] args) {
       int heat;
       Scanner s = new Scanner(System.in);
       System.out.print("Sıcaklık giriniz= ");
       heat=s.nextInt();
       if(heat<5){
           System.out.println("Kayak Yapabilirsiniz");
       }else if(heat>=5 && heat<=25){
           if(heat<=15){
               System.out.println("Sinemaya Gidebilirsiniz");
           }
           if(heat>=10){
               System.out.println("Pikniğe Gidebilirsiniz");
           }
       }
           else{
               System.out.println("Yüzmeye Gidebilirsiniz");
           }
       
                       }
}
