package gun2;

public class DataTypes1 {
    /*
    Primitiv =
    Non-Primitiv =

    Data             Type            Size Description

    byte             1 byte          -128 to 127
    short            2 bytes         -32,768 to 32,767
    int              4 bytes         -2,147,483,648 to 2,147,483,647
    long             8 bytes         -9,223,372,036,854,775,808 to 9,223,372,036,854,775,808
    float            4 bytes          6 to 7 decimal digits
    double           8 bytes          5 decimal digits


    boolean 1 bit true or false
    char 2 bytes single character/letter or ASCII values
    String

    Java--> int, double
     */
    public static void main(String[] args) {
        byte byteVar = 123;
        System.out.println(byteVar);
        // byteVar 129 olsaydi hata verirdi cunku max alcagi deger 127
        short shortVar = 129;
        System.out.println(shortVar);
        int intVar = 123;
        System.out.println(intVar);
        long longVar = 1231122323L; // SONDAKİ BÜYÜK l UNUTMA
        System.out.println(longVar);
        float floatVar = 1.12254878556F; // sondaki F unutmamak gerekiyor
        System.out.println(floatVar);
        double doubleVar = 1.123123145; // iksinin arasındaki fark yazılışlarda float sondaki 7 basamaktan sonrası görünür
        System.out.println(doubleVar);
    }
}
