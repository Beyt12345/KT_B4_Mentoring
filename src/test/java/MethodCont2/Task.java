package MethodCont2;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir kelime giriniz: ");
        String kelime = scanner.nextLine();
        scanner.close();

        String unluler = "";
        String unsuzler = "";

        for (int i = 0; i < kelime.length(); i++) {
            char harf = kelime.charAt(i);

            if (harf == 'a' || harf == 'e' || harf == 'ı' || harf == 'i' || harf == 'o' || harf == 'ö' || harf == 'u' || harf == 'ü') {
                unluler += harf;
            } else {
                unsuzler += harf;
            }
        }

        System.out.println("Ünlüler: " + unluler);
        System.out.println("Ünsüzler: " + unsuzler);
    }
}
