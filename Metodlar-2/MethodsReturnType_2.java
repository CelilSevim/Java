package gun20;

import java.util.Scanner;

public class MethodsReturnType_2 {
    public static void main(String[] args) {
        /*
        Kullanıcıdan 5 tane meyve isim girmsini isteyin
        bu meyvelerden kac tanesinde e harfi oldugunu bir methodda yazin
         */
        Scanner scanner = new Scanner(System.in);
        String [] meyveler =new String[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Meyve İsmi");
            meyveler[i]= scanner.nextLine();

        }
        int kacTane = kacTaneEVar(meyveler);
        System.out.println(kacTane+"tane e var");
    }
    public static int kacTaneEVar(String[]array){
        int miktar = 0;
        for (int i = 0; i <array.length ; i++) {
            if (array[i].contains("e")){
                miktar++;
            }

        }
        return miktar;
    }
}
