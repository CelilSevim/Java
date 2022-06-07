package gun14;

import java.util.Scanner;

public class ForDöngüsü {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            //  FOR DÖNGÜSÜ  BAŞLANGIÇ VE BİTİŞ DEGERİ OLAN ŞEYLER İÇİN KULLANILIR

       /* int intDeger =0;

        while (intDeger<10){
            System.out.println("i = "+intDeger);
            intDeger++;
        }
        for (int i = 0; i < 10; i++){
            System.out.println("i = "+i);
        }

        for (int i = 10; i > 0; i--) {
            System.out.println("i = "+i);
        }


        */
        /*
        Baslangıc ve bitis degeri kullanıcıdan alınarak bu aralıktaki sayıların toplamını ekrana yazdırın
         */
        /*System.out.println("Baslangıc degerini giriniz:");
        int baslangıcDegeri = scanner.nextInt();
        System.out.println("Bitiş Degerini giriniz:");
        int bitisDegeri = scanner.nextInt();
        int toplam =0;
        // İF TANIMLAMAMIZIN SEBEBİ OLURDA KULLANICI İLK DEGERİ BÜYÜK İKİNCİ DEGERİ KÜÇÜK GİRERSE İF ELSE KONTROL ETTİK
        if (baslangıcDegeri<bitisDegeri) {
            for (int i = baslangıcDegeri; i < bitisDegeri; i++) {
                toplam = toplam + i;
            }

        }else {
            for (int i = baslangıcDegeri; i >= bitisDegeri; i--) {
                toplam = toplam + i;
            }

        }
        System.out.println("Toplam = " + toplam);



         */
        /*
        kULLANICIDAN BİR SAYI GİRMESİNİ İSTEYİN VE BU SAYININ FAKTÖEYELİNİ HESAPLAYIN.
         FAKTÖRYEL 5 İÇİN 5*4*3*2*1
         */
        /*System.out.println("Bir sayı giriniz:");
        double deger1 =scanner.nextInt();
        double faktöryel =1;
        for (int i = 1; i <= deger1; i++) {
            faktöryel*=i;                         // faktöryel = faktöryel*i
        }
        System.out.println(faktöryel);


         */
        /*
        Carpım tablosundaki 2 ler sütunun ekrana yazdırınız:
         */
        for (int i = 1; i <= 10; i++) {
            System.out.println("2x"+i+" = "+i*2);



        }
        /*
        kullanıcıdan icinde a ile c harfi olacak şekilde  kelime girmesini isteyin
        kelime içerisindeki a harflerinin sayısını bulun
         */
        /*System.out.println("içinde  a ve c olan kelime giriniz");
        String str =scanner.nextLine();
        int sayac = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)=='a'){
                sayac++;
            }else if (str.charAt(i)=='c'){
                break;
            }

        }
        System.out.println(sayac+"tane a harfi vardır");


         */




    }
}
