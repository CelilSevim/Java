package gun10;

import java.util.Scanner;

public class ModAlma {
    public static void main(String[] args) {

        int sayi1=11;
        int modHali=sayi1%10;

                                                                   // BİR SAYININ MOD UNU ALMAK İÇİN BOLME İŞLEMİ YAPILIR
                                                                    // VE SONUÇ KALAN SAYİDİR

        int sayi2= 2;
        int modHali2 = sayi2%2;

                                                                 //EĞER MODU ALINACAK SAYI MOD DEGERİNDEN KUCUKSE KENDİSİNİ VERİR

        Scanner scanner=new Scanner(System.in);
        /*
        // SORU-->) KULLANICIDAN 3 HANALİ BİR SAYI GİRMESİNİ İSTEYİN
        //          SAYININ BİRLER BASAMĞINI BULUN
        System.out.println("3 basamaklı Bir Sayı Giriniz:");
        int num = scanner.nextInt();
        int birlerrBasamagi=num%10;
        System.out.println("Sayınızın Birler Basmağı: "+birlerrBasamagi);



        // SORU-->) KULLANICIDAN 3 HANELİ BİR SAYİ GİRMESİNİ İSTEYİN
        //           SAYININ 10 LAR BASAMAĞINI BULUNUZ
        System.out.println("3 basamaklı Bir Sayı Giriniz:");
        int num1 = scanner.nextInt();
        int onlarBasamagi=(num1/10)%10;
        System.out.println("Sayınızın Onlar Basmağı: "+onlarBasamagi);


        // SORU-->) KULLANICIDAN 3 HANELİ BİR SAYİ GİRMESİNİ İSTEYİN
        //           SAYININ 10 LAR BASAMAĞINI BULUNUZ
        System.out.println("3 basamaklı Bir Sayı Giriniz:");
        int num2 = scanner.nextInt();
        int yüzlerBasamagi=(num2/1000)%10;
        System.out.println("Sayınızın Yüzler Basmağı: "+yüzlerBasamagi);



         */

        //SORU-->) KULLANICIDAN BİR SAYI ALINIZ
        //EGER SAYI ÇİFT İSE EKRANA ÇİFT
        // EGER SAYI TEK İSE EKRANA TEK YAZINIZ


        System.out.println("Lütfen Bir Sayı Giriniz:");
        int tekMiCiftMi=scanner.nextInt();
        if(tekMiCiftMi % 2 ==0 ){

            System.out.println("Sayınız Çifttir");
        }
        else {
            System.out.println("Sayınız Tektir");
        }



    }
}
