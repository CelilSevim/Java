package gun4;

public class _StringMetotlari {
    public static void main(String[] args) {

        //String metotlarında yazılan yazının icinden birini yazdırmak icin;
        // tek tırnak ile kullanılır.Fazla kullanılmaz.
        /*
        String name = "Celil";
        char ilkHarf = 'C';
        System.out.println(ilkHarf);


         */
          //                                        ----STRİNG METOTLARI----


        //Stringden tek bir harf almak istersek. charAt kullanılır.
        /*
        String name = "Celil";
        char ikinciHarf =name.charAt(1);
        System.out.println(ikinciHarf);


         */


        // Soru--1) İsminizin ikinci harfini yazdiriniz.

        /*
        String name = "Celil";
        char ikinciHarf =name.charAt(1);
        System.out.println(ikinciHarf);


         */




        // Soru--2) iSMİNİZİN İLK HARFİ İLE SON HARFİ AYNİ Mİ:
        /*
        String isim = "Celil";
        char ilkHarf=isim.charAt(0);
        char sonHarf=isim.charAt(4);
        boolean esitMi =ilkHarf==sonHarf;
        System.out.println(esitMi);


         */


        // String ifadenin içinden belli bir ifadeyi almak..
        /*
        String cumle ="Java ogreniyorum";
        String cumleKisim=cumle.substring(0,4); //ilk ve 4. ifadede dahil olarak alır.
        System.out.println(cumleKisim);


         */


          // SORU--) "BUGÜN AHAVA KAPALI SEMSİYE ALMAM LAZIM".  --LAZIM-- KELİMESİNİ EKRANA YAZDIRIN.
        // "BUGÜN HAVA KAPALI SEMSİYE ALMAM LAZIM" cümlesini "semsiye almam lazım hava bugüm kapalı olarak ay6zın
        /*
        String cumle= "BUGÜN HAVA KAPALI SEMSİYE ALMAM LAZIM";
        String cumle1 = cumle.substring(18,37);
        String cumle2 = cumle.substring(0,17);
        System.out.println(cumle1+cumle2);


         */


        // SORU--> "Dortmund Technic " isminin 2. ve 3. harfini yazdırın
        /*
        String schoolName = "Dortmund Technic";
        char ilkHarf = schoolName.charAt(1);
        char ucuncuHarf = schoolName.charAt(2);
        System.out.println(ilkHarf+" "+ucuncuHarf);


         */

        // Cümle icinde kac tane karakter var onu ogrenmek ıcın.
        /*
        String cümle = "Dortmund Technic";
        int cumleUzunluk = cümle.length();
        System.out.println(cumleUzunluk);


         */
        // SchoolName icindeki c yi lenght() methodu kullanarak yazdiriniz.
        /*
        String schoolName = "Dortmund Technic";
        char c = schoolName.charAt(schoolName.length()-1); //cümlenin sonundaki harfi bulmamaızı saglar
        System.out.println(c);

        // Soru--> Ismınızın son harfini yazdirim
        String name = "Celil";
        char sonHarf =name.charAt(name.length()-1);
        System.out.println(sonHarf);


         */



    }

}
