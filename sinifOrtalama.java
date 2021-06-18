
import java.util.Scanner;

public class sinifOrtalama {
    public static void main(String[] args) {
        int mat,fizik,turkce,kimya,muzik;
        Scanner s = new Scanner(System.in);
        System.out.print("Matematik Notunuz= ");
        mat=s.nextInt();
        System.out.print("Fizik Notunuz= ");
        fizik=s.nextInt();
        System.out.print("Türkçe Notunuz= ");
        turkce=s.nextInt();
        System.out.print("Kimya Notunuz= ");
        kimya=s.nextInt();
        System.out.print("Müzik Notunuz= ");
        muzik=s.nextInt(); 
        double avarage=(mat+fizik+turkce+kimya+muzik)/5;
        System.out.println("Ortalamanız= "+avarage);
        if(mat==0){  
           System.out.print("Ortalamanız= " +avarage);
        }else if(fizik==0 ){
           System.out.print("Ortalamanız= " +avarage);
        }else if(turkce==0 ){
           System.out.print("Ortalamanız= " +avarage);
        }else if(kimya==0 ){
           System.out.print("Ortalamanız= " +avarage);
        }else if(muzik==0 ){
           System.out.print("Ortalamanız= " +avarage);
        }
        
                   }
}
