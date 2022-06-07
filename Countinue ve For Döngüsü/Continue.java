package gun14;

import java.util.Scanner;

public class Continue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
        Kullanıcıdan bir cümle girmesini isteyin. Cümledeki her harfi alt alta yazdirin
        boluk gelirse boşluğu yazdırın
         */
        /*System.out.println("Bir cümle giriniz:");
        String str = scanner.nextLine();
        for (int i = 0; i <str.length() ; i++) {
            if (str.charAt(i)==' '){
                continue;
            }
            System.out.println(str.charAt(i));
        }


         */

        /*
        Kullanıcıdan 5 pozitif tam sayi girmesini isteyin
        Bu sayılardan 5 ile 10 arasındakiler haric digerlerinin toplamını bulun
        Bu soruda continue kullanın

         */
        int toplam=0;
        int a =0;
        while (a<5){

            System.out.println("Sayı Giriniz:");
            int sayi = scanner.nextInt();
            a++;
            if (5<sayi&&sayi<10){
                continue;

            }else {
                toplam=toplam+sayi;
            }

        }
        System.out.println("Toplam = "+toplam);










    }
}
