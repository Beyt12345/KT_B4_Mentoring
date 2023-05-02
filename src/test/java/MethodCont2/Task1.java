package MethodCont2;

import java.util.Scanner;

public class Task1 {

            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Bir kelime giriniz: ");
                String kelime = scanner.nextLine();
                scanner.close();

                char maxHarf = ' ';
                int maxSayi = 0;

                for (int i = 0; i < kelime.length(); i++) {
                    char harf = kelime.charAt(i);
                    int sayac = 0;
                    for (int j = i; j < kelime.length(); j++) {
                        if (kelime.charAt(j) == harf) {
                            sayac++;
                        }
                    }
                    if (sayac > maxSayi) {
                        maxSayi = sayac;
                        maxHarf = harf;
                    }
                }

                System.out.println("En fazla geçen harf: " + maxHarf);
            }
}
