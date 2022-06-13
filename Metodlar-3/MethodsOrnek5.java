package gun21;

import java.util.Scanner;

public class MethodsOrnek5 {
    public static void main(String[] args) {
        /*
        Aşağıdaki gibi bir menü çıkartarak kullanicidan sürekli değişkenleri alınız ve
         her bir menü elemanını değer alan bir fonksiyon yazınız.
            1-toplama
            2-çıkarma
            3-çarpma
            4-bolme
            5-Faktöryel
            6-Çıkış
         Bir işlem seçiniz
         */
        int secim;
        Scanner scr = new Scanner(System.in);
        do {
            menüYaz();
            System.out.println("işlem Seçiniz");
            secim= scr.nextInt();
            islemYap(secim);
        }while(secim<6);



    }
    public static void menüYaz(){
        System.out.println("***Menü***");
        System.out.println("1- Toplama");
        System.out.println("2- Cıkarma");
        System.out.println("3- Carpma");
        System.out.println("4- Bolme");
        System.out.println("5- Faktöryel");
        System.out.println("6 Cıkış Yap");
    }
    public static void islemYap(int islem){
        Scanner scr= new Scanner(System.in);
        int num1,num2;
        switch (islem){
            case 1:
                System.out.println("Sayı Girin");
                num1 =scr.nextInt();
                System.out.println("Sayı Girin");
                num2 = scr.nextInt();
                toplam(num1,num2);
                break;
            case 2:
                System.out.println("Sayı Girin");
                num1 =scr.nextInt();
                System.out.println("Sayı Girin");
                num2= scr.nextInt();
                cıkarma(num1,num2);
                break;
            case 3:
                System.out.println("Sayı Girin");
                num1 =scr.nextInt();
                System.out.println("Sayı Girin");
                num2= scr.nextInt();
                carpma(num1,num2);
                break;
            case 4:
                System.out.println("Sayı Girin");
                num1 =scr.nextInt();
                System.out.println("Sayı Girin");
                num2= scr.nextInt();
                bolme(num1,num2);
                break;

            case 5:
                System.out.println("Sayı Girin");
                num1 =scr.nextInt();
                faktöryel(num1);
                break;
            case 6:


        }
    }
    public static void toplam (int num1,int num2){
        System.out.println("Sayıların Toplamı = "+(num1+num2));

    }
    public static void cıkarma (int num1 , int num2){
        System.out.println("Çıkarma = "+(num1-num2));

    }
    public static void carpma (int num1 , int num2){
        System.out.println("Sayıların Carpımı = "+(num1*num2));

    }
    public static void bolme (int num1 , int num2) {
        System.out.println("Sayıların Bölümü = " + (num1 / num2));
    }
    public static void faktöryel(int num1){
        int faktöryel=1;
        for (int i = 1; i < num1; i++) {
            faktöryel=faktöryel*num1;
        }

        System.out.println("Faktöryel "+num1+" = "+faktöryel);
    }
}
