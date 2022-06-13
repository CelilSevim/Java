package gun21;

public class MethodsOrnek3 {
    public static void main(String[] args) {
        /*
        Bir ogrencinin  isminin girildiği ve notların ortlamasını bulan bir metot yazin
         */
        ortalamaBul("mehmet",66,78,50,75);
        ortalamaBul("celil",50,41,58,100);
    }
    public static void ortalamaBul(String name ,int ...notlar){
        int notToplam = 0;
        for (int i = 0; i < notlar.length; i++) {
            notToplam= notToplam+notlar[i];
        }
        int ortalama =notToplam/notlar.length;
        System.out.println("Öğrenci "+name+" sınavlarından ortalama "+ortalama+" sonucu almıştır" );
    }
}
