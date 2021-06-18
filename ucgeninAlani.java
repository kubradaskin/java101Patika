
import java.util.Scanner;

public class ucgeninAlani {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
		
		int a,b,c;
		int u;
		int alan;
		
		System.out.print("1. Kenarı giriniz: ");
		a = s.nextInt();
		System.out.print("2. Kenarı giriniz: ");
		b = s.nextInt();
		System.out.print("3. Kenarı giriniz: ");
		c = s.nextInt();
		
		u = (a + b + c) / 2;
		alan = (int) Math.sqrt(u * (u - a) * (u - b) * (u - c));
		System.out.println("Üçgenin alanı = " + alan);
        
             }
}
