package day4_review;

import java.util.Scanner;

public class ScannerClass {
    public static void main(String[] args) {
//
//        int abc=6;
//        System.out.println(abc);
//        System.err.println("yanlış");

        Scanner sc = new Scanner(System.in);



        //STRING
        System.out.println("Adınızı giriniz : ");
        String name=sc.nextLine();
//        System.out.println("Adı "+ name+ " miş.");
//


        // INTEGER
//        System.out.print("Bir sayı giriniz :");
//        int num1=sc.nextInt();

       // System.out.println("num1 = " + num1);

   //     System.out.println(num1+5);

//        num1+=5;
//        System.out.println("num1 = " + num1);



        // FLOAT
//        System.out.println("Boyunuzu giriniz :");
//        float boy=sc.nextFloat();
//        System.out.println("boy = " + boy);


        //Double
        System.out.println("Boyunuzu giriniz :");
        double boy1=sc.nextDouble();
    //    sc.nextLine();

        Scanner sc1 = new Scanner(System.in);


//        System.out.println("boy1 = " + boy1);

        System.out.println("Soy isim giriniz:");
        String soyisim = sc1.nextLine();

        System.out.println("başarlı şekilde veriler girildi");


    }
}
