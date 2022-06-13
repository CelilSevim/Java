package gun19;

import java.util.Arrays;
import java.util.Scanner;

public class MethodlarOrnek2 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        /*
        Kullanıcıdan aralarında boşluk olacak şekilde beş tam sayı girmesini isteyin
        Bu sayıların en büyüğünü ve ene küçüğünü bulan iki farklı method yazın
         */
        System.out.println("Aralarında bosluk olacak şekilde 5 tam sayı Giriniz:");
        String sayilar = scanner.nextLine();
        String[] array = sayilar.split(" ");
        int [] intSayilar = new int[array.length];
        for (int i = 0; i < intSayilar.length ; i++) {
            intSayilar[i]=Integer.parseInt(array[i]);

        }
        enbArray(intSayilar);
        enkArray(intSayilar);
    }
    public static void enkArray(int[] dizi){
        Arrays.sort(dizi);
        System.out.println("En küçük sayı:"+dizi[0]);
    }
    public static void enbArray(int[] nums) {
        Arrays.sort(nums);
        System.out.println("En büyük sayı:" + nums[nums.length-1]);
    }
}
