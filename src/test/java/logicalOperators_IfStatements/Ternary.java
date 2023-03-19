package logicalOperators_IfStatements;

import java.util.Scanner;

public class Ternary {
    public static void main(String[] args) {

        int n=5;
    //    String result ="";
    /*    if(n%2==0){
           // System.out.println("10");}
            result=10;

        }
        else {
           // System.out.println("20");
            result=20;
        }
        System.out.println(result);*/

//      Ternary operator:   (condition) ? (return if true) : (return if false);

  //  result= (n%2 == 0) ? "çift" : "tek" ;
  //      System.out.println(result);

/*
        // Soru: Girilen sayı 50den büyük ise 1, değilse 0 değerini ekrana yazdırınız
        // Ternary operator ile yapınız

        Scanner input=new Scanner(System.in);
        System.out.println("Sayi= ");
        int sayi=input.nextInt();

    int result=(sayi>50 ? 1 : 0);
    */



        //bir işci 2 saatin altındaki çalışma için 10
        //2 ile 5 saat arası    20
        //5 saatten fazla çalışırsa 35 dolar alıyor


        Scanner oku=new Scanner(System.in);
        System.out.println("Saati giriniz: ");
        int saat = oku.nextInt();

        if(saat<=2){
            System.out.println("10");
        } else if (saat<5) {
            System.out.println("20");
        }
        else
            System.out.println("35");

    }
}
