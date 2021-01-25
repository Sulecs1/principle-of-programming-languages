package pdp2.test;
import RASTGELEKISIURET.*;
import java.io.IOException;
import java.util.Scanner;
/**
*
* @author Şule Akçay sule.akcay3@ogr.sakarya.edu.tr
* @since 19/04/2020
* 
* Yaptığım programı kontrol amacı ile test uygulması oluşturdum
* 
*/
public class PDP2Test {
   //seçimler için switch-case kullandım 
     private static final RastgeleKisi kisi_rastgele=new RastgeleKisi();
     private static final Scanner Giris = new Scanner(System.in);
     private static int sec = 0;
     private static int UretilecekKisiSayisi;
    public static void main(String[] args) throws IOException {
            while (sec != 3) {
            Tercih();
            switch (sec) {

                case 1:
                   kisi_rastgele.RastgeleKisiUret(UretilecekKisiSayisi);
                    break;

                case 2:
                    kisi_rastgele.Kontrol();
                    kisi_rastgele.ImeiKontrol();
                    break;
                default:
                    System.out.println("Çıkış Yapıldı...");
                    break;
            }

        }
        
        
    }
    //Tercih listesi çıkar
    public static void Tercih() {

        System.out.println("1)Rastgele Kişi Üret");
        System.out.println("2)Üretilmiş Dosyayı Kontrol Et");
        System.out.println("3)Çıkış");
        System.out.print("Seçiminiz : ");
        sec = Giris.nextInt();
        if (sec == 1) {
            System.out.print("Üretilecek Kişi Sayısını Giriniz :");
            UretilecekKisiSayisi = Giris.nextInt();
        }
        
        while (sec < 1 || sec > 3) {
            System.out.println("Lütfen Geçerli Değerler Giriniz!");
            System.out.println("1)Rastgele Kişi Üret");
            System.out.println("2)Üretilmiş Dosyayı Kontrol Et");
            System.out.println("3)Çıkış");
            System.out.print("Seçiminiz :");
            sec = Giris.nextInt();
        }
       

    }
     
}