package gun19;

public class Methods_1 {
    public static void main(String[] args) {
        int sayi1 =3;
        int sayi2 =5;
        findEnb(45,50); //Bu tanımladığımız methoddur dışarda neler yapacağını söylüyoruz
                               // ve buraya çağırıyoruz
        System.out.println(sayiTopla(5,10));



    }
    public static void findEnb(int a, int b){
        /*
        int a ve int b ye parametre denir. Metodun kullanıldığı yerde icine verilen degerlerdir,
        Parametre vermenin bir siniri yoktur. Parametreler ayni tipte olmak zorunda degildir
        Parametre isimleri ile dısarıdan gelen verinin isminini ayni olmak zorunda degildir
         */
        if (a>b){
            System.out.println(a);
        }
        else {
            System.out.println(b);
        }
    }
    public static int sayiTopla(int ilk,int son){
        int toplam=0;
        for (int i = ilk; i <=son ; i++) {
            toplam=toplam+i;
        }
        return toplam;
    }
}
