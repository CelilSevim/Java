package gun16;

import java.util.Scanner;

public class ArrayOrnekCözüm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*String [] array = new String[5];
        int miktar =0;
        for (int i = 0; i <array.length ; i++) {
            System.out.println("İsim Giriniz:");
            array[i] = scanner.nextLine();
            if (array[i].length()>6);
            miktar++;

        }
        System.out.println("Miktar = "+miktar);

         */
        /*
         Kullanicidan 5 tane pozitif tam sayi girmesini isteyin.
        Bu sayilari bir diziye atin. Bu sayilardan en büyügünü ekrana yazdirin.
         */
        int enb =0;
        int [] sayilar = new int[5];
        for (int i = 0; i < sayilar.length ; i++) {
            System.out.println("Sayı Giriniz:");
            sayilar[i] =scanner.nextInt();
            if (sayilar[i]>enb){
                enb=sayilar[i];
            }
        }
        System.out.println("En büyük Sayi = "+enb);
    }
}
