package gun10;

import java.util.Scanner;

public class OrneklerGun10 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        /*
        //SORU--1 ) kUULLANICIDAN YAN YANA BİR BOŞLUK OLACAK SEKİLDE 2 TAM SAYI ALINIZ.
        // BU SAYILARIN TEK Mİ ÇİFT Mİ OLDUĞUNU YAZDIRINIZ.

        System.out.println("Lütfen aralarında boşluk olacak şekilde 2 sayı giriniz:");
        String sayi=scanner.nextLine();
        int ayrac=sayi.indexOf(" ");
        String ilkSayi=sayi.substring(0,ayrac);
        String ikinciSayi=sayi.substring(ayrac+1);

        System.out.println(ilkSayi);
        System.out.println(ikinciSayi);

        int intDeger= Integer.parseInt(ilkSayi);
        int intDeger2= Integer.parseInt(ikinciSayi);

        if (intDeger % 2==0){
            System.out.println("Sayi 1: Çifttir");

        }
        else {
            System.out.println("Sayi 1: Tektir");
        }
        if (intDeger2 % 2==0){
            System.out.println("Sayi 2: Çifttir");

        }
        else {
            System.out.println("Sayi 2 :Tektir");
        }


         */

        /*
        SORU--2) KULLANICIDAN BİR SİFRE GİRMESİNİİSTEYİN
                SİFRE BELLİ SARTLARI SAĞLAMASI GEREKİYOR
                1- EN AZ 6 KARAKTER OLMALI
                2-İÇİNDE PASS YADA SIFRE GEÇMEMELİ
                3- EN FAZLA 12 KARAKTER OLMALI
                BUNLARA UYUYORSA EKRANA SIFRE BASARILI
                DEĞİLSE BASARISIZ YAZMALI
         */
        /*
        System.out.println("Lütfen Şifre Giriniz");
        String sifre=scanner.nextLine();
        int sıfreuzunluk=sifre.length();

        if (sıfreuzunluk<6 || sıfreuzunluk>12){
            System.out.println("Şifre Basarısız");
        }else if(sifre.contains("sıfre")||sifre.contains("pass")) {
            System.out.println("sıfre basarısız");
        }
        else {
            System.out.println("sifre basarılı");
        }
        // İKİNCİ ÇÖZÜM KISA,

        System.out.println("Lütfen Şifre Giriniz");
        String sifre1=scanner.nextLine();

        boolean ilkDeger =sifre1.contains("pass");
        boolean ikinciDeger =sifre1.contains("sıfre");

        if (sifre1.length()>6 &&
                !(ilkDeger||ikinciDeger)
                && sifre1.length()<=12){
            System.out.println("ŞİFRENİZ BAŞARILI");

        }else{
            System.out.println("SİFRENİZ BAŞARISIZ");
        }



         */

        /*
        kULLANICIDAN DERS VE ALDIĞI NOTU ALIN. MAT: 90 ŞEKLİNDE

        >= 90 İCİN A
        >= 80 İCİN B
        >= 70 İCİN C
        >= 60 İCİN D
        >= 50 İCİN E
        <50 İCİN F EKRANA YAZDIRIN

         */
        System.out.println("Ders ismini ve notunu girin");
        String notlar=scanner.nextLine();
        int ayrac=notlar.indexOf(" ");
        String dersNotu=notlar.substring(ayrac+1);
        int not=Integer.parseInt(dersNotu);


        if (not>=90){
            System.out.println("A");
        }else if (not>=80){
            System.out.println("B");
        }else if (not>=70){
            System.out.println("C");
        }else if (not>=60){
            System.out.println("D");
        }else if (not>=50){
            System.out.println("E");
        }
        else {
            System.out.println("F");
        }






    }
}
