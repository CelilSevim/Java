package gun6;

import java.util.Scanner;

public class ScannerOrnekleri {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 2 Kelimelik bir yazi yazin
        /*
        System.out.println("Bir cümle yaziniz:");
        String a=scanner.nextLine();
        System.out.println(a);


         */
        // Soru--> Ekrandan girdiğiniz iki kelimenin yerlerini değiştirip yazdirin
        /*
        System.out.println("Bir cümle yaziniz:");
        String a=scanner.nextLine();
        System.out.println(a);

        int index1=a.indexOf(" ");
        String ilkKelime=a.substring(0,index1);
        String ikinciKelime=a.substring(index1+1);
        System.out.println(ikinciKelime+" "+ilkKelime);


         */
        // Soru--> Dikdörtgenin kisa ve uzun kenarlarini ekrandan alip cevresini bulun

        /*
        System.out.println("Kısa kenarı giriniz");
        int a=scanner.nextInt();
        System.out.println("Uzun kenarı giriniz");
        int b=scanner.nextInt();
        int cevre =(2*a)+(2*b);
        System.out.println("Çevre uzunluğu ="+cevre);


         */
        System.out.println("Şuanki yılı Giriniz:");

        int suan=scanner.nextInt();
        System.out.println("Dogum yılınızı Giriniz:");
        int dogum=scanner.nextInt();
        int yas =suan-dogum;
        System.out.println("Yasiniz="+(yas));










    }
}
