package gun21;

import java.util.Scanner;

public class MethodsOrnek4 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        /*
        Girilen yeni bir password un kurallara uygunluğunu kontrol eden bir metot yazin.
                  kurallar :
                  1) en az 8 karakter olmalı
                  2) içinde pass kelimesi olmamalı
                  3) en fazla 12 karakter olmalı.
         */
        System.out.println("Password Giriniz:");
        String pass = scr.nextLine();
        password(pass);
        System.out.println(isCorrect("celilpass"));

    }

    public static void password(String pass) {
        if (pass.length() < 8) {
            System.out.println("Şifre Kriterlere Uymuyor");
        } else if (pass.length() > 12) {
            System.out.println("Şifre Kriterlere Uymuyor");
        } else if (pass.contains("pass")) {
            System.out.println("Şifre Kriterlere Uymuyor");
        } else {
            System.out.println("Şifre Başarılı");
        }
    }
    public static boolean isCorrect (String password){
        return password.length()>8 && password.length()>12 && (password.contains("pass"));
    }
}

