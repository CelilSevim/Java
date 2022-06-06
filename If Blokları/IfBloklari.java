package gun9;

import java.util.Scanner;

public class IfBloklari {
    public static void main(String[] args) {

        String str ="If ornekler";

        boolean b= str.equals("e");
        boolean c =str.equalsIgnoreCase(" ");
        boolean bb= str.isEmpty();
        boolean a =str.startsWith("e");
        boolean aa= str.endsWith("e");
        boolean cc =str.contains("c");

        int sayi1 =5;
        int sayi2= 4;

        boolean sayiBolen1 =sayi1 == sayi2;
        boolean sayiBolen2 =sayi1 != sayi2;
        boolean sayiBolen3 =sayi1 > sayi2;
        boolean sayiBolen4 =sayi1 < sayi2;
        boolean sayiBolen5 =sayi1 >= sayi2;
        boolean sayiBolen6 =sayi1 <= sayi2;

        if (sayi1 ==sayi2) {
            System.out.println("İki Sayı Eşittir");
        }
        else {
            System.out.println("İki Sayi Eşit Değildir");
        }
            Scanner scanner=new Scanner(System.in);

            int sifre=12345;
            System.out.println("Lütfen Şifre Giriniz");
            int sifre2=scanner.nextInt();

                if (sifre==sifre2){
                System.out.println("Şifreniz Doğru");
                }
                else  {
                    System.out.println("şifreniz doğru değil");
                }












    }
}
