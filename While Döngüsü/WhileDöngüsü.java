package gun12;

import java.util.Scanner;

public class WhileDöngüsü {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
         int enb = 0;
         int i =0;
          while (i<5){
              System.out.println("Sayı Giriniz");
              int num = scanner.nextInt();

              if (num>enb){
                  enb = num;

              }
              i++;
          }
        System.out.println("En büyük sayı = "+ enb);

// EĞER BAŞLAMA VE BİTİŞ DEGERİ VARSA SAYAC KULLANARAK YAZILIR WHİLE DÖNGÜSÜ
        //AMA BU ŞEKİLDE YAZILANLAR İÇİN FOR DÖNGÜSÜ KULLANILIR










    }
}