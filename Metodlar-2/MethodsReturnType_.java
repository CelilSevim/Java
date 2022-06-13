package gun20;

import java.util.Scanner;

public class MethodsReturnType_ {
    public static void main(String[] args) {
        int meyve = kacTaneEvar("meyve giriniz:");
        int isim = kacTaneEvar("isim giriniz:");
        int sehir = kacTaneEvar("şehir giriniz:");
        System.out.println("Meyvelerde "+meyve+" tane e var");
        System.out.println("İsimlerde "+isim+" tane e var");
        System.out.println("sehirlerde "+sehir+" tane e var");

    }
    public static int kacTaneEvar(String str){                          //burada String yanına yazdığımız str parametresi
        Scanner scanner= new Scanner(System.in);                        // yukarda meyve vb gibi istediğimiz
        String [] array = new String[5];                                //kadar yazmamızı sağlıyor
        int kacTane =0;                                                 // onun yanına int deger verseydik hangi ismden kaç tane
        for (int i = 0; i < array.length; i++) {                        //istersek girebilimemizi ssağlıyor o zamanda 5 yerine int e tanımladığımız değişekeni yazardık
            System.out.println(str);
            array[i] = scanner.nextLine();
            if (array[i].contains("e")){
                kacTane++;
            }

        }
        return kacTane;
    }


}
