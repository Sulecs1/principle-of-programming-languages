#include "stdlib.h"
#include "stdio.h"
#include "RASTGELEKISI.h"
#include "time.h"
//Test.c ile oluşturulan sınıfları kontrol etmek amacıyla kullanılır.

   
int main()
{
    
    
    int numberofperson = 0;

    
    while (1)
    {

        printf("\n");
        printf("1-Rastgele Kisi uret \n");
        printf("2-uretilmis dosya kontrol et\n");
        printf("3-cikis\n");
        printf("Lutfen secimizi giriniz...\n");
        int secim;
        scanf("%d", &secim);
        if (secim == 3)
        {
            printf("cikiliyor....\n");
            break;
        }
        else if (secim == 1)
        {
            printf("kac kisi olusturulsun\n");
            int n;
            scanf("%d", &n);
            numberofperson = n;
            
            int j;
            for (j = 0; j < numberofperson; j++)
            {
                
            }
        }
        else if (secim == 2)
        {
            int n = 0;
            for (n = 0; n < numberofperson; n++)
            {
                printf("TC Kimlik Numarasi\n");
                
                printf("\n");
                printf("IMEI Numaralari\n");
                
                printf("\n");
                
            }
        }
        else
        {
            printf("yanlis secim girdiniz lutfen tekrar deneyin.\n");
        }
    }

    int i;
    for (i = 0; i < numberofperson; i++)
    {
		
    }

    return 0;
}