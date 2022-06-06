package gun9;

import java.util.Scanner;

public class IfBloklarOrnekler {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        //SORU-->1) EKRANDAN İSMİNİZİ GİRİN VE ŞLK HARFİN  A  OLUP OLMADIĞINI KONTROL EDİN
        // EGER A İSE İSİM A İLE BASLIYOR DEGİLSE A İLE BASLAMIYOR YAZDIRIN
                /*
            System.out.println("İsminizi Yaziniz:");
            String name= scanner.nextLine();
            if(name.startsWith("A")){
                System.out.println("İsminiz A ile Basliyor");
            }
            else {
                System.out.println("İsminiz A ile Başlamıyor ");
            }


                 */

        //SORU-->2) EKRANDAN SU AN Kİ YILI VE DOGUM TARİHİNİZİ GİRİN
        // VE YASINIZI HESAPLAYIN. eGER 18 DEN BÜYÜK EHLİYET ALABİLİRSİNİZ
        //DEĞİLSE ALAMAZSINIZ YAZDIRIN


        System.out.println("DOGUM YILINIZI GİRİNİZ ");
        int a = scanner.nextInt();
        System.out.println("ŞUAN Kİ YILI GİRİNİZ ");
        int b = scanner.nextInt();
        int yas =b-a;
        int gel=18-yas;
        if(yas>=18){
            System.out.println("Ehliyet Alabilirsiniz:");
        }
        else{
            System.out.println("Ehliyet Alamazsınız "+gel+ " Yıl Sonra Tekrar Gelin :)");
        }




        //SORU-->3)Ekrandan girilen takim gs ise ekrana yasa cimbom
        //         girilen takim fener ise yasa fener
        //         degilse kapat tv yi yazdirin


        System.out.println("Bir Takım İsmi Giriniz");
        String name= scanner.nextLine();

        if (name.equalsIgnoreCase("galatasaray")){
            System.out.println("Çarşı gs' ye Karşı");
        } else if  (name.equalsIgnoreCase("fenerbahce")){
            System.out.println("Çarşı gs' ye Karşı");
        }
        else {
                System.out.println("Şampiyon Beşiktaş");
            }
        }










    }

