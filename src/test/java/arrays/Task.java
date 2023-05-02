package arrays;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        // günler arrayı
        // consaoldan index numarası alıp
        // indexi aldığınız günü yazdırın

        String [] gunler=new String[7];
        gunler[0]="Pazartesi";
        gunler[1]="Salı";
        gunler[2]="Çarşamba";
        gunler[3]="Perşembe";
        gunler[4]="Cuma";
        gunler[5]="Cumartesi";
        gunler[6]="Pazar";

        Scanner sc=new Scanner(System.in);
        System.out.println("Gün indexini giriniz");
        int indexNo=sc.nextInt();
        System.out.println(gunler[indexNo]);

    }
}
