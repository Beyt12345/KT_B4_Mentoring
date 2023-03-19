package day2_Review;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        /*
        60 soruluk bir sınavda 5 yanlış 1 doğruyu götürmektedir.
Tüm sorulara cevap veren bir öğrencinin 51,25 neti
olduğuna göre ,öğrenci kaç soruya yanlış yanıt vermiştir?
         */

       double soruSayısı=60;
       double net=51.25;
       double yanlıs1=soruSayısı-net;
       double yanlıs2=1+4;
       double yanlısKatsayı=yanlıs2/4;
       double yanlısSoruSayısı=yanlıs1/yanlısKatsayı;


        System.out.println("yanlısSoruSayısı = " + yanlısSoruSayısı);


//       double yanlısSoru=(soruSayısı-net)/1.25;
//       System.out.println("yanlısSoru = " + yanlısSoru);

        // Kullanıcıdan alacağınız 2 tam saının toplamını ekrana yazdırınız
        Scanner input = new Scanner(System.in);

        System.out.println("1. sayı giriniz: "); int sayi1 = input.nextInt();

        System.out.println("2. sayı giriniz"); int sayi2 = input.nextInt();

        // 1. Yöntem
        int toplam=sayi1+sayi2;
        System.out.println("Girilen iki sayının toplamı= " + toplam);

        //2. yöntem
        System.out.println("Toplam= " + (sayi1+sayi2));

        // çalışmayan yöntem
        System.out.println("toplam " + sayi1 + sayi2); // rakamları yan yana string olarak toplar
        // burada string ile sayı toplandığından
        // println hepsini stringe çevirip yanyana ekler, sayı toplaması yapmaz
    }
}
