package gun16;

import java.util.Scanner;

public class Array_Diziler3 {
    public static void main(String[] args) {
        /*
        Kullanıcıdan sayı alarak bu sayı uzunlugunda int bir dizi olusutun
        Dizizin elemanlarını kullanıcının gireceği sayılarla doldurun
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dizi Uzunluğunu Giriniz:");
        int uzunluk = scanner.nextInt();

        int[] nums= new int[uzunluk];
        for (int i = 0; i < uzunluk; i++) {          //Diziyi doldurmak için yazılmıştır
            System.out.println("Sayı Giriniz:");
            nums[i]= scanner.nextInt();

        }
        for (int i = 0; i <uzunluk ; i++) {           // diziyi yazdırmak için yazılmıl döngüdür
            System.out.print(nums[i]+"-");

        }



    }
}
