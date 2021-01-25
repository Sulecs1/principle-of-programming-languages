package RASTGELEKISIURET;
/**
*
* @author Şule Akçay sule.akcay3@ogr.sakarya.edu.tr
* @since 19/04/2020
* 
* Rastgele.java rastgele atama yapılması için kütüphane oluşturdum
* 
*/

//Burada Rastgele kütüphanesinin clasını oluşturdum.Nanosaniye cinsinden sayi ürettim  123 e göre modunu aldım bunu integer degere  çevirip rastgeleye atadım.

public class Rastgele {
    public int rastgele;

    private long mtemp() {
        long temp;
        temp = System.nanoTime();
        return temp;
    }

    public int RastRandom(int rakam3, int rakam4) {
        while (true) {
            rastgele = (int) ((mtemp()) % 123);
            if (rastgele >= rakam3 && rastgele < rakam4) {
                break;
            }
        }
        return rastgele;

    }
  
}
