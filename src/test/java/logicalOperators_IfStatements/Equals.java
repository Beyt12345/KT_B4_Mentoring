package logicalOperators_IfStatements;

import java.util.Scanner;

public class Equals {
    public static void main(String[] args) {
      /*  String name="ahmet";
        String ad="ahmet";
        int a=7;
        int b=7;

        if(a==b && name==ad){
            System.out.println("başarılı");
        }
        else
            System.out.println("başarısız");
       */

     // name== ad -- şeklinde karşılaştırmıyoruz
     // name.equals

        Scanner input=new Scanner(System.in);
        System.out.println("1. Vize notunu giriniz: ");
        double vizeNotu1=input.nextDouble();
        System.out.println("2. Vize notunu giriniz: ");
        double vizeNotu2=input.nextDouble();
        System.out.println("Final notunu giriniz: ");
        double finalNotu=input.nextDouble();
        double ort=vizeNotu1*0.2 +vizeNotu2*0.2 + finalNotu*0.6; // eğer sonucu double istiyorsak double eşitlemeliyiz
        //eğer int istiyorsak int e eşitlemeliyiz

//        int ortInt =(int) (vizeNotu1*0.2) +(int) (vizeNotu2*0.2)+ (int) (finalNotu*0.6);
//        System.out.println("ort = " + ort);
/*
        if (ort >= 90)
            System.out.println("A");
        else if (ort >= 80)
            System.out.println("B");
        else if (ort >= 70)
            System.out.println("C");
        else if (ort >= 60)
            System.out.println("D");
        else if (ort >= 40)
            System.out.println("E");
        else
            System.out.println("F");*/

    String not= (ort >= 90)? "A": (ort>=80)?"B": (ort>=70)?"C":
            (ort>=60)?"D":(ort>=40)?"E":(ort<40)?"F":"Invalid Number";
        System.out.println(not);

    }


    }

