package RASTGELEKISIURET;
/**
*
* @author Şule Akçay sule.akcay3@ogr.sakarya.edu.tr
* @since 19/04/2020
* 
* Telefon algoritmasına vgöre 11 haneli numara ürettim
* 
*/

//Türkiyede kullanılan telefon numaralarına uygun üretilmiştir
public class Telefon extends Rastgele{
    
    String Telno="";
    
    public String Telefon(){
        Telno="";
        int telnu[]=new int [11];
        telnu[0]=0; telnu[1]=5;
        for(int i=3;i<11;i++){
            telnu[i]=RastRandom(0,9);  //0 ile 9 arasında rastgele deger atadım
            
        }
        telnu[2]=RastRandom(0,5)+2;
        if(telnu[2]>5||telnu[2]<3){
            telnu[2]=RastRandom(0,5)+2;
        }
       
        for(int i=0;i<11;i++){ 
            Telno=Telno+ telnu[i];
        }
        return Telno;
    }
  
}
