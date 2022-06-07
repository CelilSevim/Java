package gun12;

import java.util.Scanner;

public class SwitchCase_2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Bugün haftanın hangi günü");
        String day =scanner.nextLine();

        switch (day){
            case  "pazartesi":
                System.out.println("Bugün 1. gün");
                break;
            case  "Salı":
                System.out.println("Bugün 2. gün");
                break;
            case  "Çarşamba":
                System.out.println("Bugün 3. gün");
                break;
            case  "Perşembe":
                System.out.println("Bugün 4. gün");
                break;
            case  "Cuma":
                System.out.println("Bugün 5. gün");
                break;
            case  "Cumartesi":
                System.out.println("Bugün 6. gün");
                break;
            case  "Pazar":
                System.out.println("Bugün 7. gün");
                break;
            default:
                System.out.println("Yanlış giriş yaptınız");

        }

        /*
        Kullanıcıdan iki tam sayı alın
        Yine kullanıcıdan yapmak istediği islemi alıp islemleri yaptırın
        toplama içic (t), cıkarma için (c), çarpma için (p) bölme için (b)

         */
        System.out.println("Lütefn bir sayı giriniz:");
        int sayi1 = scanner.nextInt();
        System.out.println("Lütfen bir sayı girin:");
        int sayi2 = scanner.nextInt();
        System.out.println("lutfen yapacağınız işlemi secin");
        String ıslem = scanner.next();

        switch (ıslem) {
            case "t":
                System.out.println(sayi1 + sayi2);
                break;
            case "c":
                System.out.println(sayi1 - sayi2);
                break;
            case "p":
                System.out.println(sayi1 * sayi2);
                break;
            case "b":

                System.out.println(sayi1 / sayi2);
                break;

            default:
                System.out.println("Yanlış giriş yaptınız");


        }    }
}
