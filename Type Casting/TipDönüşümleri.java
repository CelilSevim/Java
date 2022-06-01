package gun8;

public class TipDönüşümleri {
    public static void main(String[] args) {
    //-------------------------------------------------TİP DEÖNÜŞÜMLERİ-----------------------------------------------


                                                //<-----------STRİNGE-i İNT-e DÖNÜŞTÜRÜR------------------->
        String str="1234";
        int intDeger= Integer.parseInt(str);
        System.out.println(intDeger);

                                                //<------------DOUBLEY-i STRİNG-e DÖNÜŞTÜRÜR---------------->


        double doubleDeger= Double.parseDouble(str);
        System.out.println(doubleDeger);

                                                //---------------BÜYÜK DEĞİŞKENİ küçükDEĞİŞKENE ATAMA---------->
        double doubleDegisken =12;
        int intDegisken = (int) doubleDegisken; //Eşitliğin sag tarafına kucuk degiskenin tipini parantez icinde yazmakm lazım
        float f =(float) doubleDegisken;


                                               //----------------İNT-i STRİNGE ÇEVİRME-------------------------->

        int i=12345;
        String strInt = String.valueOf(i);


                                                 //----------------DOUBLE-i STRİNGE ÇEVİRME-------------------------->
        double d=1234.5;
        String strDouble=String.valueOf(d);








    }
}
