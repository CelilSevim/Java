package gun17;

import java.util.Scanner;

public class OdevCozumleri {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       // soru1:
        /*Bir okulda ögretmensiniz. Sinifa 5 yeni ögrenci kaydi yapacaksiniz.
        Ögrencilerin isim ve soyisimlerini kaydedecek bir program yazmaniz istendi.
                Bu ögrencilere seviye belirleme sinavi yaptiniz.
                Aldiklari sonuclar su sekildedir: 80,85,90,96,100
        Bu bilgilere gore ogrencilerin isim soyisim ve notlarini ekrana yazdirin.
        örnek cikti su sekilde olacak:

        ögrenci abdullah sinavdan 80 almistir.
                ögrenci cihat sinavdan 85 almistir.
                ögrenci fatma sinavdan 90 almistir.
                ögrenci harun sinavdan 96 almistir.
                ögrenci yasin sinavdan 100 almistir.
    */

       /* String [] isimSoyisim =new String[5];
        int [] notlar =new int[5];
        for (int i = 0; i < isimSoyisim.length; i++) {
            System.out.println("İsim ve Soyisim Giriniz:");
            isimSoyisim[i]= scanner.nextLine();

            System.out.println("Öğrencinin Notu:");
            notlar[i] = scanner.nextInt();
        }
        for (int i = 0; i < isimSoyisim.length; i++) {
            System.out.println("Öğrenci: "+isimSoyisim[i]+ " sınavdan "+notlar[i]+ " almiştir");

        }

        */
        /*
        Bir gazetede calisiyorunuz. Köse yazilarinin birinde 3. cümlenin sonunda "java"
        kelimesi eksik yazilmis. Bu hatayi düzeltecek bir program yazin.

        örnek köse yazisi su sekildedir:

        Lorem ipsum dolor sit amet, consectetur adipiscing elit. Etiam in massa ac est finibus dictum.
                Pellentesque aliquam cursus risus, vitae elementum mi faucibus blandit. Nulla facilisi.
        Aenean molestie lacinia convallis. Morbi laoreet tellus purus, vel egestas turpis pretium in.


         */
        String koseYazisi ="Lorem ipsum dolor sit amet, consectetur adipiscing elit. Etiam in massa ac est finibus dictum.\n" +
                "Pellentesque aliquam cursus risus, vitae elementum mi faucibus blandit. Nulla facilisi.\n" +
                "Aenean molestie lacinia convallis. Morbi laoreet tellus purus, vel egestas turpis pretium in.";
        String[] cumleler = koseYazisi.split("\\.") ;
        String duzenlenmis ="";
        cumleler[2]+=" java";
        for (int i = 0; i < cumleler.length; i++) {
            duzenlenmis+=cumleler[i]+".";
        }
        System.out.println(duzenlenmis);





    }

}
