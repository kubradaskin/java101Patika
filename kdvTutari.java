
import java.util.Scanner;

public class kdvTutari {
    public static void main(String[] args) {
        double tutar, kdvOran=0.18,kdvTutar,kdvliTutar;
        Scanner s=new Scanner(System.in);
        System.out.print("Ücret tutarını giriniz= ");
        tutar=s.nextDouble();
        if(tutar>0 && tutar<1000){
            System.out.println("Kdv Oranı= "+kdvOran);
        }
        else if(tutar>1000){
            double kdvOran2=0.08;
            kdvTutar= tutar+ kdvOran2;
            kdvliTutar= tutar+kdvTutar;
            System.out.println("Kdv Tutarı= "+kdvTutar);
        }
        kdvTutar= tutar+ kdvOran;
        kdvliTutar= tutar+kdvTutar;
      /*  System.out.print("Kdv'siz Tutar= "+tutar);
        System.out.print("Kdv Oranı= "+kdvOran);
        System.out.print("Kdv Tutarı= "+kdvTutar);
        System.out.print("Kdv'li Tutar= "+kdvliTutar);
        */
}
}
