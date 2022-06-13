package gun21;

import java.util.Scanner;

public class MethodsOrnekler {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        /*
         Okulda calisan bir ögretmen icin,
        ögrencilerin vize ve final notlarini girebilecegi
        ve kac ögrenci girmek istedigini alan
        bir metot ve sonuclari yazdiran ayri bir metot daha yazin.
         */
        System.out.println("Kaç Öğrenci Girişi Olacak:");
        int ogrSayisi = scr.nextInt();
        int [][] notlar= norGirisi(ogrSayisi);

        notYazdir(notlar);



    }
    public static int [][] norGirisi (int kacOgrenci) {
        Scanner scanner = new Scanner(System.in);
        int[][] notlar = new int[kacOgrenci][2];
        for (int satir = 0; satir < notlar.length; satir++) {
            for (int sütun = 0; sütun < notlar[satir].length; sütun++) {
                if (sütun == 0) {
                    System.out.println("Vize sonucu Girin");
                    notlar[satir][sütun] = scanner.nextInt();
                } else {
                    System.out.println("Final Sonucunu Girin:");
                    notlar[satir][sütun] = scanner.nextInt();
                }
            }

        }
        return notlar;
    }
    public static void notYazdir (int [][]notlar){
        for (int i = 0; i < notlar.length ; i++) {
            for (int j = 0; j < notlar[i].length ; j++) {
                if (j==0){
                    System.out.print("Vize = "+notlar[i][j]);
                }else {
                    System.out.println("Final = " +notlar[i][j]);
                }


            }

        }
    }

}
