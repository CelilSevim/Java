package gun13;

import java.util.Scanner;

public class WhileDongusuDevam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

     /*
        Kullanıcıdan 5 tane pozitif tam sayi alin
        bu sayılardan en küçüğünü ekrana yazdırın


        System.out.println("Sayı Giriniz");
        int enk =scanner.nextInt();
        int count =0;

        while (count<4) {
            System.out.println("Sayı Giriniz:");
            int num = scanner.nextInt();
            if (num < enk) {
                enk = num;
            }
            count++;

        }
                System.out.println("ENK = "+ enk);



      */
    // Kullanıcıdan Beş tane Cümle Girmesini isteyiniz
    //Bu cümleler içinde a olan kaç tane kelime oldugunu yazdırın
        /*
        int i =0;
        int sayac =0;
        while (i<=4){
            System.out.println("Bir Cümle Giriniz: ");
            String str =scanner.nextLine();
            if (str.contains("a")){
                sayac++;
            }

            i++;
        }
        System.out.println("İçinde a harfi gecen toplam kelime "+sayac);


         */

        /*
        Random bir sayi olusturun.Kullanıcıya 5 hak verin
        eger dogru tahmin ederse  Tebrikler yazın

         */

        /*
        int randomSayi = (int)(Math.random() * 3);
        int sayac =0;
        while (sayac<5){
            System.out.println("Sayı Girin: ");
            int num = scanner.nextInt();
            if (num==randomSayi){
                System.out.println("Random Sayı: "+randomSayi);
                System.out.println("Sizin Sayınız: ");
                System.out.println("Tebrikler");
                break;
            }else if (sayac==4){
                System.out.println("Kaybettiniz");
            }
            sayac++;
        }


         */
        /*
        Kullanıcıdan x  girene kadar kelime girmesini isteyin
         */
        //
            String kelime = "";
            do {
                System.out.println("Kelime Giriniz:");
                kelime=scanner.nextLine();
                }

            while (!kelime.contains("x"));










            }

















    }

