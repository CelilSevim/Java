package gun20;

public class MethodBelirsizSay─▒daParametre {
    public static void main(String[] args) {
        // toplama methodu yazin ama kac say─▒ olacag─▒ bilinmiyor
        toplama(45,45,55,100,25,66,47,55);
    }
    public static void toplama(int...sayilar){
        int toplam =0;
        for (int i = 0; i < sayilar.length ; i++) {
            toplam+=sayilar[i];

        }
        System.out.println("Toplam = "+toplam);
    }
}
