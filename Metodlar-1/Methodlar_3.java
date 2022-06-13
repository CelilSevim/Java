package gun19;

import java.util.Scanner;

public class Methodlar_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sayi = scanner.nextInt();
        tekMiCiftMi(sayi);

        /*
    Kuallanıcıdan gireceği sayının tek mi cift mi oldugunu bulan bir metod yazın
     */

    }
    public static void tekMiCiftMi(int num){
        if (num%2==1){
            System.out.println("Sayı Tektir");

        }else {
            System.out.println("Sayı Çifttir:");
        }
    }

}
