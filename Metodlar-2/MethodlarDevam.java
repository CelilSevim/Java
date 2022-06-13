package gun20;

import java.util.Scanner;

public class MethodlarDevam {
    public static void main(String[] args) {


      /*
      İki sayının toplamını ekrana yazdırın
       */
        toplama();
    }
    public static void toplama(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Bir Sayı Giriniz:");
        int sayi1 = scanner.nextInt();
        System.out.println("Bir Sayı Giriniz:");
        int sayi2 = scanner.nextInt();
        int toplam= sayi1+sayi2;
        System.out.println("Toplam = "+toplam);
        //eger parametre verecek olursak
        //toplama (int sayi1,int sayi2 )seklinde tanımlayıp yukarda toplamanın içine istediğimiz iki değeri verebiliriz

    }
}
