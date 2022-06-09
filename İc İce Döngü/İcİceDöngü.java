package gun15;

import java.util.Scanner;

public class İcİceDöngü {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*
        1 ile 5 arasındaki sayıların toplam tablosunu ekrana yazdirin
        1+1=2 gibi
         */

        /*for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <=5 ; j++) {
              int  toplam =i+j;
                System.out.println( i+" + "+j+" = "+toplam);

            }
            System.out.println();// alt sıraya indiğimizde boşluk bırakmmızı sağlar yani birler ile ikiler arasındaki boşluk

        }


         */

        /*
        *****
        *****
        *****
        *****
        *****
        Ekrana bu sekilde cıktı verecek programı yazın
         */
        /*for (int i = 1; i <=5 ; i++) {
            for (int j = 1; j<=5; j++) {
                System.out.print("*");         // burada yanayana olmması için println degil print kulandık

            }
            System.out.println();
        }


         */

        for (int i = 1; i <= 5; i++) {                           // burada merdiven şeklinde yazdırır
            for (int j = 1; j <=i ; j++) {                       //burada j yi i ye eşitledik ki i kadar yazsın
                System.out.print("*");

            }
            System.out.println();
        }

        for (int i = 1; i <= 5; i++) {
            for (int j = i; j <=5 ; j++) {
                System.out.print("*");

            }
            System.out.println();
        }
        // ona kadar çarpım toblossunu ekrana yazdirin
        for (int i = 1; i <=10 ; i++) {
            for (int j = 1; j <= 10; j++) {
                int carpim =i*j;
                System.out.println(i+" x "+j+" = "+carpim);
            }
            System.out.println();
        }



















    }
}
