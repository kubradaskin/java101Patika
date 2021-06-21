
import java.util.Scanner;

public class deseneGoreMetot {
    public static void metotDeseni(int sayi, int a, boolean status) {

        if (sayi <= a) {
            System.out.println(sayi);
            if (sayi > 0 && !status) {
                metotDeseni(sayi-5,a,false);
            }else{
                metotDeseni(sayi+5,a,true);
            }
        }
    }

   
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz: ");
        int sayi = s.nextInt();
        int a = sayi;
        metotDeseni(sayi,a,false);
    }
}
