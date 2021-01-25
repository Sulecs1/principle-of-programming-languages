package RASTGELEKISIURET;
/**
*
* @author Şule Akçay sule.akcay3@ogr.sakarya.edu.tr
* @since 19/04/2020
* 
* Imeıno algoritmasını kullanarak ımeıo oluşturdum
* 
*/
public class IMEINo extends Rastgele {
    
  String imeiNu="";

 //Rastgerle Imei numarasının algoritmasına göre Imei ürettim
  public String ImeiNumarasi(){
       int teksayi=0;
       int ciftsayi=0;
       int sayac=0;
       imeiNu="";
       int ImeiNu[]=new int[15];
      
       for(int j =0;j<15;j++){//rastgele 1 ile 9 arasınd  sayi atadım
          ImeiNu[j]=RastRandom(0,9);
      }
       for(int x=0;x<=12;x+=2){  //ilk degrden başlayıp 2 arttırarak degerleri dizi aracılıgı ile teksayiya atadım
          teksayi+=ImeiNu[x];               
      }
      for(int i=1;i<=13;i+=2){   //2degerden başlayıp 13 degere kadar iki atlayıp degeri 2 ile çarpıp sayaca atadım
          sayac=ImeiNu[i]*2;
      if(sayac>9)     //eger 2 ile çarptıktan sonra deger 9 dan büyük ise 9 çıkarırz  örnk(9*2=18 olamayacagından tek basamaga indirgemek için 9 çıkarırz)
      {
          sayac=sayac-9;
      }
      ciftsayi+=sayac;
      }
      
    sayac=teksayi+ciftsayi;
    double sayac2=((Math.ceil(sayac/10))*10)+10; //degeri 10na bölüp ceil metotu ile büyük sayıya yuvarladım
    if(((int)sayac2-sayac)>9){
    ImeiNu[14]=((int)sayac2-sayac)%10;
   }
    else
   {
       ImeiNu[14]=(int)sayac2-sayac;   //son haneyi bulmak için int degere çevirdim
   }
    for(int j=0;j<15;j++){
        imeiNu+=ImeiNu[j];
    }
    return imeiNu;
  
    }
}