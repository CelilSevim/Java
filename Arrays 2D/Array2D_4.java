package gun18;

import java.util.Scanner;

public class Array2D_4 {
    public static void main(String[] args) {
        /*
        öğrencilerin vize ve final notlarını girebileceği bir program yazin
        kac öğrenci olacağınıda alın
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kac Öğrenci Gireceksiniz:");
        int ögrenciSayisi = scanner.nextInt();
        int [][] notlarTablosu = new int [ögrenciSayisi][2];
        //vize final notu gireleceği için sütun sayısı 2
        // ama kac ögr old bilmediğimiz için ogrSayisi dedik satir icin
        for (int satir = 0; satir < notlarTablosu.length; satir++) {
            //kac öğrenci olursa olsun toplamda 2 sütun olacak
            //0. sütun vize notlari 1. sütun final notlari

            for (int sütun = 0; sütun < notlarTablosu[satir].length ; sütun++) {
                if (sütun==0){
                    System.out.println((satir+1)+". Ögrencinin Vize Notunuzu Giriniz:");
                    notlarTablosu[satir][sütun] = scanner.nextInt();
                }else {
                    System.out.println((satir+1)+". Öğrencinin Final Notunu Giriniz:");
                    notlarTablosu[satir][sütun] = scanner.nextInt();
                }



            }

        }
        for (int satir = 0; satir < notlarTablosu.length ; satir++) {
            for (int sütun = 0; sütun <notlarTablosu[sütun].length ; sütun++) {
                if (sütun==0){
                    System.out.println((satir+1)+". Ögrencinin Vize Notu"+notlarTablosu[satir]);

                }else{
                    System.out.println((satir+1)+". Ögrencinin Vize Notu"+notlarTablosu[sütun]);
                }

            }

        }

    }
}
