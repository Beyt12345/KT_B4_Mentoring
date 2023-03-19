package loops;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
       /* TASK 1

        // Girilen 1vize(%20), 2vize(%20)ve final(%60) notunu okuyarak ortalamayı bulunuz
        ortalama;
        // >= 90 için A
        // >= 80 için B
        // >= 70 için C
        // >= 60 için D
        // >= 40 için E
        // < 40 için F yazdırınız.*/


        Scanner input=new Scanner(System.in);
        System.out.println("1. vize notunu giriniz : ");
        double vizeNotu1=input.nextDouble();
        System.out.println("2. vize notunu giriniz : ");
        double vizeNotu2=input.nextDouble();
        System.out.println("Final notunu giriniz : ");
        double finalNotu=input.nextDouble();

        double ort=vizeNotu1*0.2+vizeNotu2*0.2+finalNotu*0.6;
        System.out.println("ort = " + ort);
/*
    if(ort>=90) {
        System.out.println("A");
    }
    else if(ort>=80){
        System.out.println("B");
    }
    else if(ort>=70){
        System.out.println("C");
    }
    else if(ort>=60){
        System.out.println("D");
    }
    else if(ort>=40){
        System.out.println("E");
    }
    else {
        System.out.println("F");
    }

    */

     //   (condition) ? return if true : return if false
String not=(ort>=90) ? "A" : (ort>=80)?"B": (ort>=70)?"C":
    (ort>=60)?"D": (ort>=40)?"E": (ort<40 && ort>0)?"F":"Invalid Number";
        System.out.println("not = " + not);

    }
}
