
import java.util.Scanner;

public class daireninAlani {
    public static void main(String[] args) {
        int r;
        double pi=3.14,a;
        Scanner s = new Scanner(System.in);
        System.out.print("Yarıçap=");
        r=s.nextInt();
        System.out.println("Merkez açı=");
        a=s.nextDouble();
        double alan=(pi*(r*r)*a)/360;
        System.out.println("Alan=" +alan);
      }
    
} 

