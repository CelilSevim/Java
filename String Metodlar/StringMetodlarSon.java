package gun8;

import java.util.Locale;

public class StringMetodlarSon {
    public static void main(String[] args) {


        //<--------------------------------------------------- TRİM METHODU---------------------------------------------------------------------->


        String str =" Java Dersleri ";
        String strTrim=str.trim();               // STRİNGİN BAŞINDAKİ VE SONUNDAKİ BOŞLUKLARI SİLER
        System.out.println(str.length());
        System.out.println(strTrim.length());


        //<---------------------------------------------------------TOLOWERCASE METHODU--------------------------->


        String strTolwer= str.toLowerCase();      // STRİNG İÇERİSİNDEKİ BÜTÜN HARFLERİ KÜÇÜK YAPAR
        System.out.println(strTolwer);



        //-----------------------------------------------------TOUPPERCASE METHODU---------------------------------------------------------
        String strToupper=str.toUpperCase();
        System.out.println(strToupper);             // STRİNG İÇERİSİNDEKİ BÜTÜN HARFLERİ BÜYÜK YAPAR



        //--------------------------------------------------EQUALS METHODU-----------------------------------------------------

        String strEquals="Java";
        System.out.println(str.equals(strEquals));            //GİRİLEN İKİ STRİNG İFADENİN EŞİT OLUPĞ OLMADIĞINA BAKAR (BÜYÜK KÜÇÜK HARF ÖNEMLİ)

        System.out.println(str.equalsIgnoreCase(strEquals));  //GİRİLEN İKİ STRİNG İFADENİN EŞİT OLUPĞ OLMADIĞINA BAKAR (BÜYÜK KÜÇÜK HARF ÖNEMLİ DEĞİL)


        //---------------------------------------------------CONTAİNS METHODU--------------------------------------------------------

        System.out.println(str.contains("Java"));             //STRİNG İÇERİSİNDE BULMAK İSTEDİĞİMİZ İFADENİN OLUP OLMADIĞINA BAKAR BÜYÜK KÜÇÜK BOŞLUK HERŞEY ÖNEMLİDİR.



    }
}
