package gun20;

public class MethodsReturnType {
    public static void main(String[] args) {
        /*
        2 sayının toplamını bulan method bulunuz

         */

       int toplam =toplamBulmaReturn(85,78);
        System.out.println(toplam);


    }

    public static void toplamBulma (){
        int sayi1 =34;
        int sayi2 =45;
        int toplam = sayi1+sayi2;
        System.out.println("TOPLAM = "+ toplam);
    }
    public static void toplamBulma2 (int sayi1,int sayi2){
        int toplam = sayi1+sayi2;
        System.out.println("TOPLAM = "+ toplam);

        //parametreli method
    }
    public static int toplamBulmaReturn(int sayi1,int sayi2){
        // return type
        //Burada void yerine bize int bir deger döner
        //void tanımsız birşey ama burada int deger
        //bu degerler int olduğu için ben bu methodla işlem yapabilirim
        int toplam1 =sayi1+sayi2;
        return toplam1;
    }



}
