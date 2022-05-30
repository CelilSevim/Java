package gun5;

public class StringMetotlar2 {
    public static void main(String[] args) {

        // Bugun hava
        // cok guzel
        // İki cumle yanayana yazdir.

        /*
        String cumle1 = "bugün hava";
        String cumle2 = "cok guzel";
        System.out.println(cumle1+" "+cumle2);


         */

        // ---->concat methodu...<---
        /*

        String cumle = "Bügün hava";
        String tamCumle = cumle.concat(" cok guzel");
        System.out.println(tamCumle);


         */
        // --> indexOf Methodu()
        /*
        String cumle = "Bügün hava";
        String tamCumle = cumle.concat(" cok guzel");
        System.out.println(tamCumle.indexOf("g"));


         */
        // Soru--> Bir 5 kelimelik bir cüöle yazin ve bu ccümle icerisinde ki
        // son kelimeyi yazdirin.
        /*
        String cumlem ="İnşallah Beşiktaş şampiyon olur amin";
        int cumlebaslangic = cumlem.indexOf("amin");
        int cumleSonu = cumlem.length();
        System.out.println(cumlem.substring(cumlebaslangic,cumleSonu));
        System.out.println(cumlem.substring(cumlebaslangic));


         */
        /*
        String cumle = "Lorem ipsum dolar merhaba dünya ben cElil";
        int kelime5 = cumle.indexOf(" dü");
        int kelime5son = cumle.indexOf(" b");
        System.out.println(kelime5);
        System.out.println(kelime5son);
        System.out.println(cumle.substring(kelime5,kelime5son));


         */



    }
}
