package gun2;

public class DataTypes2 {
    public static void main(String[] args) {
        int a;
        a = 10;

        int b = 2;

        int c, d; // coklu tanimlama
        c = 20;
        d = 30;

        int e = 100, f = 200;
        System.out.println("a nin degeri"); // ikisini alt alta yazar
        System.out.println(a);
        System.out.println("--------------------");

        // yan yana yazmak icin

        System.out.print("a nin degeri : "); // ln yazmadıgımız zaman yanyana yazar
        System.out.println(a);
        System.out.println("--------------------");
        // su sekildede yazilabilir

        System.out.println("a nin degeri: " + a);

    }
}
