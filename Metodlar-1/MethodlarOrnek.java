package gun19;

import java.util.Scanner;

public class MethodlarOrnek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
        6 elemanlı bir sayı dizisi olusturun ve bu dizideki tek ve cift eleman sayısını bulan method
         */
        int[] sayilar = {1,2,3,4,5,6};

        istenen (sayilar);
    }

    public static void istenen(int []array) {
        int tekMiktar=0;
        int ciftMiktar=0;
        for (int i = 0; i < array.length; i++) {


            if (array[i]%2==0){
                ciftMiktar++;
            }
            else
            {

                tekMiktar++;
            }
        }
        System.out.println("tek sayılar= " +tekMiktar + "adet");
        System.out.println("çift sayılar= " +ciftMiktar + "adet");
    }

    }

