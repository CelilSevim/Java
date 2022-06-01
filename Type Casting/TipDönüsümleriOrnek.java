package gun8;

import java.util.Scanner;

public class TipDönüsümleriOrnek {
    public static void main(String[] args) {



        //Soru--1 Ekrandan dogum tarihinizi yil olarak ve duan ki yılı girin
                // Yasınızı hesaplayin (Not: Ekrandan girisde harf yazamaya izin vermeyin.

        /*
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dogum gününü giriniz: ");
        int a = scanner.nextInt();
        System.out.println("Şuanki yılı giriniz: ");
        int b= scanner.nextInt();
        int yas = b-a ;
        System.out.println("Yas:"+yas);


         */
        // Soru--2 Ekrandan isim ve soyisim tek satırda girin
                // Ismınızi tüm harflerini kucuktun
                // Soyisminizi  sadece ilk harfini küçültüp diğer harfleri büyütün
        Scanner scanner = new Scanner(System.in);
        System.out.println("İsminizi ve Soyisminizi Giriniz: ");
        String a = scanner.nextLine();
        int index1=a.indexOf(" ");
        String isim=a.substring(0,index1);

        String soyİsim =a.substring(index1+1);

        String isim2= isim.toLowerCase();
        System.out.println(isim2);
        String soyİsim2=soyİsim.toUpperCase();
        System.out.println(soyİsim2);
        String soyİsim3= soyİsim.replace("S","s");
        System.out.println(isim2);
        System.out.println(soyİsim3);





    }
}
