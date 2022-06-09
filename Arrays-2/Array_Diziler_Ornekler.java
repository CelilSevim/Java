package gun17;

import java.util.Arrays;
import java.util.Scanner;

public class Array_Diziler_Ornekler {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
        Kullanıcıddan 5 tane sayi alin ve bu sayiların tek olanlarini bir diziye atin
         */
        /*int[] intArray =new int[5];
        int miktar=0;
        for (int i = 0; i < 5; i++) {
            System.out.println("Bir Sayı Giriniz:");
            intArray [i]= scanner.nextInt();

        }
        for (int i = 0; i <5 ; i++) {
            if (intArray[i]%2==1){
                System.out.println(i);
                miktar++;
            }
        }
        System.out.println("Tek Olan Sayi Miktarı = "+miktar);



         */
        /*
        Kullanıcıdan 5 tane email alın. Bu emaillerden @ işareti olmaynların sayısını bulunuz:
         */
       /*String [] emails = new String[5];
        int miktar1 = 0;
        for (int i = 0; i <5 ; i++) {
            System.out.println("Email Giriniz:");
            emails[i]= scanner.nextLine();
        }
        for (int i = 0; i <5 ; i++) {
            if (!emails[i].contains("@"));
                miktar1++;
        }
        System.out.println("@ İşareti olmayan email miktarı = "+ miktar1);




        */
        /*
        Kullanıcıdan 5 tane sayi girmesini isteyin
        BU SAYILARDAN YÜZLER BASAMAĞI ENN BÜYÜK OLANI BULUN
         */
       /* int sayilar1 []=new int[5];
        int enb =0;
        for (int i = 0; i <5 ; i++) {
            System.out.println("Sayı Giriniz:");
            sayilar1[i]= scanner.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            int yüzler =((sayilar1[i]/100)%10);
            if (yüzler>enb){
                enb=yüzler;
            }

        }
        System.out.println("Enb = "+enb);


        */
        /*
        Kullanıcıdan bir cümle girmesini isteyin
        Bu cümlenin kelime sayını bulun;
         */
        /*System.out.println("Bir Cümle Giriniz:");
         String str = scanner.nextLine();
        String[] cumle= new String[str.length()];
        int kelime =1;
        for (int i = 0; i < cumle.length; i++) {
            if (str.charAt(i)==' '){
                kelime++;
            }

        }
        System.out.println("Kelime Sayisi = "+kelime);


         */
        /*
        Kullanıcıdan 5 tane sayı isteyin
        bu sayılardan ortalamayı geçen sayı miktarını bulun
         */
        /*int[] sayilar = new int[5];
        int toplam = 0;
        int ortalama = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("Sayı Giriniz");
            sayilar[i] = scanner.nextInt();
            toplam += sayilar[i];


        }
        ortalama = toplam / sayilar.length;
        int miktar = 0;
        for (int sayi : sayilar){
            if (sayi>ortalama){
                miktar++;
            }
        }
                                       //DİZİLER METHODLARİ


                                            //SPLİT METHODU


         */
        /*Kulllanıcıdan bir cümle girmesini isteyuin ve girdiği cümlenin kelimelerini tersten yazin
        System.out.println("Cümle Giriniz:");
        String cümle = scanner.nextLine();
        String [] kelimeler =cümle.split(" ");          //split methodu icerisinde verilen degere String ifadeyi böler
        for (int i = kelimeler.length-1; i >= 0; i--) {
            System.out.println(kelimeler[i]+" ");

        }


         */
        //5 ELAMANLI BİR İNT DİZİ OLUSTURUN VE EKRANA YAZDİRİN
                                               //toString METHODU
        /*int [] nums = {23,34,45,56,67};

        //1. yöntem
        for (int i = 0; i < nums.length ; i++) {
            System.out.print(nums[i]+ " ");

        }
        System.out.println();
        // 2 . yöntem
        System.out.println(Arrays.toString(nums));


         */
        /*
                                              // sort() Methodu
                                       //dizinin elamanlari küçükten büyüğe siralar


        5 elamanlı biri dizi  olusturun ve elamanlari kücükten büyüğe siralayın
         */


        /*
        int [] sayilar4={23,34,45,67,88};
        Arrays.sort(sayilar4);
        System.out.println(Arrays.toString(sayilar4));
        // sort() Methodu dizinin elamanlari küçükten büyüğe siralar


         */

        //Kullanıcıdan 5 tane sayı alın ve büyük olanı ekrana yazdırın

        int [] nums6 =new  int[5];
        for (int i = 0; i <5 ; i++) {
            System.out.println("SAYI GİRİNİZ:");
            nums6[i]=scanner.nextInt();
        }
        Arrays.sort(nums6);
        int enb = nums6[nums6.length-1];
        System.out.println(enb);










    }
        }




















