package gun11;

import java.util.Scanner;

public class JavaRandom {
    public static void main(String[] args) {
        double randomSayi=Math.random();
        // 0-1 arasında rastgele bir sayı üretir:
        System.out.println(randomSayi);

        int randomSayi2 =(int)(Math.random()*10);
        // 0-10 arasında rarastgele sayılar üretir
        // eger 0-100 arasında olsa *100 derdik
        System.out.println(randomSayi2);
        int min =3;
        int max = 7;
        int randomSayi3 = (int)(Math.random()*((max-min)+1))+min;
        // Max ve min değerler verip o aralıkta random sayi olusturmak

        /*
        min -> 0*(....)+min => 3
        max-> (0,99*(5))+min => 7
         */

        // SORU--1Kullanıcıdan aralarında virgül olacak şeklide iki tam sayı alın
        //bu tam sayılardan büyük olanını ekrana yazdırın
        /*Scanner scanner =new Scanner(System.in);
        System.out.println("Aralarında , olacak şekilde iki tam ayı giriniz:");
        String sayı =scanner.nextLine();
        int ayrac=sayı.indexOf(",");
        String ilkSayı= sayı.substring(0,ayrac);
        String ikinciSayı= sayı.substring(ayrac+1);
        int intDeger1=Integer.parseInt(ilkSayı);
        int intDeger2=Integer.parseInt(ikinciSayı);
        System.out.println("Büyük Olan sayı : "+Math.max(intDeger1,intDeger2));


         */
        //KULLANICIDAN 1-9 ARASI BİR SAYI GİRMESİNİ İSTEYİN. 0-10 ARASI RANDOM SAYİ TANIMLAYIN.
        // EGER KULLANICIDAB GİRDİĞİ SAYI İLKE RANDOM SAYI ESİT İSE EKRANA TEBRİKLER YAZDIRIN.
        // EGER CEVAP YANLIS İSE MAALESEF KAYBETTİNİZ YADIRIN

        System.out.println("1-9 arasında bir sayı giriniz");
        Scanner scanner =new Scanner(System.in);
        int sayı =scanner.nextInt();
        int min1 =1;
        int max1 = 10;
        int randomSayimız = (int)(Math.random()*10);
        System.out.println("Sizin Sayınız : "+sayı+", Bilgisayarın sayısı : "+randomSayimız);
        if (sayı==randomSayimız){
            System.out.println("Tebrikler");

        }
        else {
            System.out.println("Maalesef Kaybettiniz Tekrar Deneyin ");
        }










    }
}
