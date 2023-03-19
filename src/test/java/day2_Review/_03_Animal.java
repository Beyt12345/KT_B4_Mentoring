package day2_Review;

import java.util.Scanner;

public class _03_Animal {

    public static void main(String[] args) {
        /*
        bu sınıf hafta sonu
        mentörlükte tekrar amaçlı
        oluşturulmuştur.
        */

        System.out.println("\"Hello\r World\"");
        /*
        Integer
            byte
            short
            int
            long
        Float
        Double
        char

*/
        float f=5.6f;
        long l=1234664444455l;

        int  num=5;
        byte b=127;
        short sh=-4568;

        char c='?';

        Scanner scan=new Scanner(System.in);
        System.out.println("fizik notu:");
        int fizik= scan.nextInt();
        System.out.println("kimya notu:");
        int kimya= scan.nextInt();
        System.out.println("matematik notu:");
        int matematik= scan.nextInt();
        double toplam=(fizik+kimya+matematik)/3;
        System.out.println(toplam);




    }


}
