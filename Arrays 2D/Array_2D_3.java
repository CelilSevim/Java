package gun18;

public class Array_2D_3 {
    public static void main(String[] args) {
        /*
        5-5 lik bir tabloyu 0-10 arasi sayılarla doldurup yazdırın
         */
        int [][] tablo = new int [5][5];
        // tablotu olusturmak için
        for (int i = 0; i < tablo.length ; i++) {
            for (int j = 0; j <tablo[i].length ; j++) {
                tablo[i][j] = (int) (Math.random()*10);

            }

        }
        // tabloyu console yazdırmak için
        for (int i = 0; i < tablo.length ; i++) {
            for (int j = 0; j <tablo[i].length ; j++) {
                System.out.print(tablo[i][j]+" ");
            }
            System.out.println();

        }
























    }
}
