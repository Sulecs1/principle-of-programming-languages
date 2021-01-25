#include "stdlib.h"
#include "stdio.h"

/*

//Tc kimlik numarasının algortmasına göre satgele 11 haneli deger oluşturuyor
Struct  KimlikNo {
    //randomu rastgeleye çevirdim
  
     char *tc_numarasi[11];
    char  *TcNumarasi(){
   tc_numarasi="";
   int kimlikNu[]=new int[11];
   for(int sabit=0;sabit<11;sabit++){
       if(sabit==0){
           kimlikNu[0]=RastRandom(0,9)+1; //Tcnin ilk degerinin 0 olmaması gerekir onun i.in bir ekledim
           
       }
       else if(sabit<10){  //Tcnin ilk degerden 10. degere kadar algoritma kurallarına göre rastgele sayi atariz
           kimlikNu[sabit]=RastRandom(0, 9);
           
       }
   }
   //algortma kuralına göre 1,3,5,7 ve 9 hane toplamının 7 katından 2,4,6,8 hanenin toplamının farkını modunu alınca 10.terime eşit olur
   kimlikNu[9]=(((kimlikNu[0]+kimlikNu[2]+kimlikNu[4]+kimlikNu[6]+kimlikNu[8])*7)-(kimlikNu[1]+kimlikNu[3]+kimlikNu[5]+kimlikNu[7]))%10;
   kimlikNu[10]=(kimlikNu[0]+kimlikNu[1]+kimlikNu[2]+kimlikNu[3]+kimlikNu[4]+kimlikNu[5]+kimlikNu[6]+kimlikNu[7]+kimlikNu[8]+kimlikNu[9])%10;
   for(int i=0;i<11;i++){
       tc_numarasi+=kimlikNu[i];
   }
   return tc_numarasi;
 }

   
    free(*tc_numarasi);
   
};*/
