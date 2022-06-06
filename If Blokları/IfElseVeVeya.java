package gun9;

import java.util.Scanner;

public class IfElseVeVeya {
    public static void main(String[] args) {


        Scanner scanner=new Scanner(System.in);
        System.out.println("Notunuzu Giriniz");
        int not=scanner.nextInt();

        if (not<50){
            System.out.println("Büte Kaldınız");
        }else if(not>=50 && not<80){
            System.out.println("İyi");
        }else if (not>=80 && not<100);
        System.out.println("Pekiyi");

        //    &&-----------> Ve demektir   || -----------> veya demektir

        if (not<50){
            System.out.println("Büte Kaldınız");
        }else if(not>=50 || not<80){
            System.out.println("İyi");
        }else if (not>=80 || not<100);
        System.out.println("Pekiyi");


    }
}
