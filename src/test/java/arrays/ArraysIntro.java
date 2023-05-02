package arrays;

public class ArraysIntro {
    public static void main(String[] args) {
        int sayi1=4;
        int sayi2=5;
        int sayi3=6;
        int sayi4=7;


        String car1="Honda";
        String car2="Toyota";
        String car3="BMW";
        String car4="Mercedes";


//       // index        0 1 2 3
//
//        System.out.println(sayı[0]); // 4 verecek
//        System.out.println(sayı[3]); // 7 verecek
//     //   System.out.println(sayı[4]); //ArrayIndexOutOfBoundsException
//
//
//        int num[]=new int [4];
//        System.out.println(num[0]);
        String []car={"Honda","Toyota","BMW","Mercedes"};
        int sayı [] = {4,5,6,7};

      //  System.out.println(sayı);

        System.out.println(sayı[0]);
        System.out.println(sayı[1]);
        System.out.println(sayı[2]);
        System.out.println(sayı[3]);

        for (int i = 0; i < sayı.length; i++) {
            System.out.println(sayı[i]);
        }

    }
}
