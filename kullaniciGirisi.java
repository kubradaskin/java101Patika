
import java.util.Scanner;

public class kullaniciGirisi {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String kullaniciAdi = "Kübra";
        int sifre = 4567;
        System.out.print("Kullanıcı adınızı giriniz: ");
        String ad = s.nextLine();
        System.out.print("Şifreyi giriniz: ");
        int sifreGiris = s.nextInt();
        if(ad.equals(kullaniciAdi) && sifreGiris == sifre){
            System.out.println("Hoşgeldiniz");
        }else{
            System.out.println("Giriş Başarısız");
            System.out.print("Şifrenizi sıfırlamak ister misiniz? 1-evet||2-hayır: ");
            int deger = s.nextInt();
            switch(deger){
                case 1:
                    System.out.print("Yeni şifrenizi giriniz: ");
                    int yeniSifre = s.nextInt();
                    if(yeniSifre == sifre || yeniSifre == sifreGiris){
                        System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz");
                    }else{
                        System.out.println("Şifre oluşturuldu");
                        sifre = yeniSifre;
                    }
                    break;
                case 2:
                    System.out.println("Şifre sıfırlama iptal edildi");
                    break;
                default:
                    System.out.println("Belirtilen bir değer seçiniz!!");
            }
        }
    }
}
