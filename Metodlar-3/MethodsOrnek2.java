package gun21;

public class MethodsOrnek2 {
    public static void main(String[] args) {
        /*
        Faktöryel Hesaplayan Bir METHOD yaazın
         */
        faktöryel(12);
        faktöryel(9);
        faktöryel(4);

    }
    public static void faktöryel (int num){
        double faktöryel=1;
        for (int i = 1; i <=num ; i++) {
            faktöryel*=i;
        }
        System.out.println("Faktöryel = "+ faktöryel);
    }
}
