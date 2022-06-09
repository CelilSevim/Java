package gun16;

import java.util.Scanner;

public class Array_Diziler {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        int intDeger = 35;

        String str = "Hello World";

        int[] intArray =new int[5];   // 5 tane sayi int deger tutabilir.sayıyı değiştirip tutabileceği
                                      // sayıyı artırıp azaltabilirim. Nefatif yazılmaz
        intArray[0] = 3;              // integer lerin default degeri olduğu için
        intArray[2] = 5;              // yazmadığımız elemanlar yerine 0 yazar
        intArray[4] = -25;
        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);


        }
    }
}
