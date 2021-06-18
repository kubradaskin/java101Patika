
import java.util.Scanner;

public class gectiKaldi {
    public static void main(String[] args) {
        int mat,fizik,kimya,turkce,tarih,muzik;
        Scanner s=new Scanner(System.in);
        System.out.print("Matematik Notunuz=");
        mat=s.nextInt();
        System.out.print("Fizik Notunuz=");
        fizik=s.nextInt();
        System.out.print("Kimya Notunuz=");
        kimya=s.nextInt();
        System.out.print("Türkçe Notunuz=");
        turkce=s.nextInt();
        System.out.print("Tarih Notunuz=");
        tarih=s.nextInt();
        System.out.print("Müzik Notunuz=");
        muzik=s.nextInt();
        int toplam= (mat+fizik+kimya+turkce+tarih+muzik);
        double sonuc= toplam/6;
        System.out.println("Ortalamanız=" +sonuc);
        boolean kaldı= sonuc<60;
        System.out.println("Sınıfta Kaldı=" +kaldı);
        
        /*boolean gecti=sonuc>=60;
        System.out.println("Sınıfı Geçti=" +gecti); 
        */
    }
}
