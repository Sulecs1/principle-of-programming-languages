package RASTGELEKISIURET;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
*
* @author Şule Akçay sule.akcay3@ogr.sakarya.edu.tr
* @since 19/04/2020
* 
* Burada dosya yazma ve okuma işlemlerini yaptım
* 
*/
public class RastgeleKisi extends Rastgele {
  //Random_isimler text dosyasından isim ve soyismi çektim bunu diziye atadım  rastgele kütüphanesini kullanarak rastgele isim çektim
   int line=0;
   private static final Kisi kisi=new Kisi();
   public String RastgeleKisi() throws FileNotFoundException{
   
       try {
           BufferedReader file=new BufferedReader(new FileReader("random_isimler.txt"));
           String satir=file.readLine();
           while(satir!=null){
               if(satir.length()>0){
                   line++;
               }
               satir=file.readLine();
           }   } catch (IOException ex) {
           Logger.getLogger(RastgeleKisi.class.getName()).log(Level.SEVERE, null, ex);
       }
       int artan=0;
       String Dizi[]=new String[line+1];
       try{
           try (BufferedReader file = new BufferedReader(new InputStreamReader(new FileInputStream("random_isimler.txt")))) {
               Dizi[0]=file.readLine();
               while(Dizi[artan]!=null){
                   if(Dizi[artan].length()>0){
                       artan++;
                   }
                   Dizi[artan]=file.readLine();
               }
           }
       }catch(FileNotFoundException ex){ }
       catch(IOException ex){}
       return Dizi[RastRandom(0, line)];       
   }
   
   //Dışarıdan girilen sayiya göre kişi üretip bunu kisiler.txt dosyasına yazdırdım.
   public static void RastgeleKisiUret(int n) throws FileNotFoundException, IOException{
        File file=new File("Kisiler.txt");
        if(!file.exists()){
            file.createNewFile();
        }
        else{
            file.delete();
            file.createNewFile();
            for(int x=0;x<n;x++){
                String kayit=kisi.YeniKisi();
                FileWriter fileWriter=new FileWriter(file,true);
                try (BufferedWriter Writer = new BufferedWriter(fileWriter)) {
                Writer.write(kayit);
                Writer.newLine();
                Writer.close(); 
            }      
        } 
    }
        
    
    System.out.println("Kayıt eklendi");
    
}
//Tc Kimlik Numarasanın kontrol için metot oluşturdum ancak tc üretme algoritmam dogru oldugu için sürekli dogru üretiyor degisiklik yapmadan onun dışında sürekli 
public static void Kontrol() throws FileNotFoundException, IOException{
     FileReader file=new FileReader("Kisiler.txt");
     BufferedReader read=new BufferedReader(file);
     
     String satir;
     System.out.println("TC Kimlik Kontrol");
     while((satir=read.readLine())!=null){
         String[] detay=satir.split(" ");
          if(kisi.TcNumarasiKontrol(detay[0])){
              String son3 = detay[0].substring(8, 11);
              System.out.println(son3 + " Geçerli");
          }
          else {
              String son3 = detay[0].substring(8, 11);
              System.out.println(son3 + " Geçersiz");
          }
          
     }
         
   }

//Imei numarasınin kontrolünü yaptıktan sonra bunu geçerli geçersizliğini yazdırdım.

public static void ImeiKontrol() throws FileNotFoundException, IOException{
     FileReader file=new FileReader("Kisiler.txt");
     BufferedReader read=new BufferedReader(file);
     
     String satir;
     
     System.out.println("IMEI Kontrol");
     while((satir=read.readLine())!=null){
         String[] detay=satir.split(" ");
          if(kisi.Imei_numarasiKontrol(detay[5].substring(1,detay[5].length()-1))){
              String son3 = detay[5].substring(12, 15);
              System.out.println(son3 + " Geçerli");
          }
          else {
              String son3 = detay[5].substring(12, 15);
              System.out.println(son3 + " Geçersiz");
          }
      }
         

   }
   
   
}
