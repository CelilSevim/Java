package gun18;

public class Array2D_5 {
    public static void main(String[] args) {
        /*
        {{"15$","56€","33$"},{"67$","78€"},{"100€"}}
        bu sekild ebir fiyat tablosu var dolar olanlari 3 ile
        euro olan fiyatlari 5 ile carpıp toplsm fiyatı bulun
         */

        String [][] fiyatlar = {{"15$","56€","33$"},{"67$","78€"},{"100€"}};
        int toplam  = 0;
        String fiyat ="";
        for (int i = 0; i < fiyatlar.length ; i++) {
            for (int j = 0; j <fiyatlar[i].length ; j++) {
                if (fiyatlar[i][j].contains("$")){
                    fiyat= fiyatlar[i][j].replaceAll("$","");
                    toplam += Integer.parseInt(fiyat)*3;
                }else {
                    fiyat= fiyatlar[i][j].replaceAll("€","");
                    toplam += Integer.parseInt(fiyat)*5;

                }

            }

        }
        System.out.println("Toplam = "+ toplam);





















    }
}
