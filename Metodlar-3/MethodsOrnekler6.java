package gun21;

public class MethodsOrnekler6 {
    public static void main(String[] args) {
        /*
        aaabbbfffgggtttddd bu sekilde yazılmış bir kelimeye düzenyeleyecek bir method yazin
        çıktı ==> 3a3b3f3g3t3d
         */
        String metin ="aaabbbfffgggtttddd";
        System.out.println(cell(metin));
    }
    public static String cell (String metin){
        String yenniHal ="";
        // ifadeyi düzenledikten sonra atacağımız bos string
        int sayac =0; // cümle icerisinde 1 harfin  kac tane oldugunu bulmak icin degisken
        for (int i = 0; i <metin.length() ; i++) {
            // dıs döngü sirayla harfi alır
            String harf =String.valueOf(metin.charAt(i));// ilk döngünün aldıgı harfi asagıdıa kontrol etmeek icin stringe ceviriri
            sayac=0;// her harf icin sayac sıfırlansın diye sayac sıfırlanır
            for (int j = 0; j <metin.length() ; j++) {
                //y yukarıdan gelen harfi cümle icerisinde bakabilmek icin olan dongü
                if (metin.charAt(i)==metin.charAt(j)){
                    // yukarıdan gelen harfi cümle icinde sirayla olup olmadıgını kontrol eder
                    sayac++;
                }

            }
            if (!yenniHal.contains(harf)){
                // o an ki harfin düzenlenen string icerisinde olup olamdıgını
                //kontrol ediyor eger yoksa düzenlenen styringe ekliyor
                yenniHal+=sayac+harf;
            }

        }
    return yenniHal;
    }
}
