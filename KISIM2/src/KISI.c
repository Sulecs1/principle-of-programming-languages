#include "stdlib.h"
#include "stdio.h"
#include "RASTGELEKISI.h"

/*
Struct Kisi  {
       //nesneleri oluşturdum
     Konrol *telefon=new Kontrol();
    KimlikNo *kimlik=new KimlikNo();
    IMEINo *Imei=new IMEINo();
    RastgeleKisi *kisi=new RastgeleKisi();
    
    int  bilgileri_dondur;
    
    
    //kişilerin bilgilerini metotlar yardımı ile çağırdım
 char YeniKisi() {
     bilgileri_dondur = kimlik->TcNumarasi()+" "+kisi->RastgeleKisi()+" "+Yas()+" "+telefon->Telefon()+" "+"("+Imei->ImeiNumarasi()+")";
      return bilgileri_dondur;
  } 
     int Yas(){
           return RastRandom(0, 100);
  }
  
    
   //Tc kimlik numarası kontrol ediliyor
 boolean TcNumarasiKontrol(char* TcNu[11]){
       boolean isValid = false;
        if (TcNu != null && TcNu.length() == 11 ) {
            long aTcNo, bTcNo, tcNo;
            long n1, n2, n3, n4, n5, n6, n7, n8, n9, control1, control2;
            tcNo = Long.parseLong(TcNu);
            aTcNo = tcNo / 100;
            bTcNo = tcNo / 100;
            n1 = aTcNo % 10;
            aTcNo = aTcNo / 10;
            n2 = aTcNo % 10;
            aTcNo = aTcNo / 10;
            n3 = aTcNo % 10;
            aTcNo = aTcNo / 10;
            n4 = aTcNo % 10;
            aTcNo = aTcNo / 10;
            n5 = aTcNo % 10;
            aTcNo = aTcNo / 10;
            n6 = aTcNo % 10;
            aTcNo = aTcNo / 10;
            n7 = aTcNo % 10;
            aTcNo = aTcNo / 10;
            n8 = aTcNo % 10;
            aTcNo = aTcNo / 10;
            n9 = aTcNo % 10;
            control1 = ((10 - ((((n1 + n3 + n5 + n7 + n9) * 3) + (n2 + n4 + n6 + n8)) % 10)) % 10);
            control2 = ((10 - (((((n2 + n4 + n6 + n8) + control1) * 3) + (n1 + n3 + n5 + n7 + n9)) % 10)) % 10);
            isValid = ((bTcNo * 100) + (control1 * 10) + control2 == tcNo);
        }
        return isValid;  
   }
  
  
  //Imei  numarası kontrol ediliyor
  
 boolean Imei_numarasiKontrol(char *imeNu[15]){
    boolean sonuc = true;
      double cift_sayi=0;
      double tek_sayi=0;
      String Imei_ekle="";
      int ImeiNu[]=new int[imeNu.length()];
      
      if(imeNu.length()!=15){
          return false;
      }
      
     for(int i=0;i<imeNu.length();i++){
         ImeiNu[i]=Integer.parseInt(imeNu.substring(i, i+1));
     }
     for(int i=0;i<=12;i+=2){
         tek_sayi+=ImeiNu[i];
     }
     for(int i=1;i<=13;i+=2){
         if(ImeiNu[i]*2>9){
             cift_sayi+=ImeiNu[i]*2-9;
         }
         else{
             cift_sayi+=ImeiNu[i]*2;
         }
     }
     double sayac2=((Math.ceil((cift_sayi+tek_sayi)%10))*10);
     for(int i=0;i<15;i++){
         Imei_ekle=Imei_ekle+ImeiNu[i];
     }
     if(sayac2-(cift_sayi+tek_sayi)==ImeiNu[14]){
         sonuc = true;
     }else{
         sonuc = false;
     }
     return sonuc;
  }
  free(*ımeNu[15);
  free(*tcNu[11]);
  
};
*/