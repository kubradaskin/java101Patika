
import java.util.Scanner;

public class palindromikKelime {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int sayac = 0;
        System.out.print("Kelime giriniz: ");
        String a = s.nextLine();
        String b = "";
        
        for(int i = (a.length()-1); i >= 0; i--)
        {
            b += a.charAt(i);
        }
        if(b.equals(a)) {
            System.out.println("Palindromdur");
        }
        else {
            System.out.println("Palindrom değildir");
        }
        
    }
}
