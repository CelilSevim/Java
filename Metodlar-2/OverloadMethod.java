package gun20;

import java.util.Scanner;

public class OverloadMethod {
    public static void main(String[] args) {
        /*
        öyle bir method yazın ki kullanıcı 2,3 ve dört sayının toplamnı bu bu methodla yapabilsin
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sayı Girin");
        toplama(23,34);
        toplama(23,34,45);
        toplama(23,34,45,88);
        //aynı isimde aynı isi yapan ama parametre sayisi farklı olan metotlara overload metot denir
    }
    public static void  toplama(int sayi1,int sayi2){
        int toplam =sayi1+sayi2;
        System.out.println("Toplam = "+ toplam);
    }
    public static void  toplama(int sayi1,int sayi2,int sayi3) {
        int toplam = sayi1 + sayi2 + sayi3;
        System.out.println("Toplam = " + toplam);
    }
    public static void  toplama(int sayi1,int sayi2,int sayi3,int sayi4) {
        int toplam = sayi1 + sayi2 + sayi3+sayi4;
        System.out.println("Toplam = " + toplam);
    }
}


