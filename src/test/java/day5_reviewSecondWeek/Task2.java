package day5_reviewSecondWeek;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        //        Task 2
        //        Kullanıcıdan bir sayı alın
        //        sayı cift sayı mı olduğunu bir boolean değişkeni ile kontrol edin

        Scanner sc=new Scanner(System.in);
        System.out.println("lütfen bir sayı giriniz : ");
        int i=sc.nextInt();
       // boolean çiftmi1=(i%2==0);
       // boolean çiftmi2=!(i%2==1);
//         System.out.println("çiftmi = " + çiftmi1);
//         System.out.println("çiftmi = " + çiftmi2);


       // boolean tekmi1=(i%2==1);
        //boolean tekmi2=!(i%2==0);
        boolean tekmi3=(i%2!=0);  //(1!=0)  -- true
                                    // (0!=0) -- false


//        System.out.println("tekmi1 = " + tekmi1);
    //    System.out.println("tekmi2 = " + tekmi2);
        System.out.println("tekmi3 = " + tekmi3);

    }
}
