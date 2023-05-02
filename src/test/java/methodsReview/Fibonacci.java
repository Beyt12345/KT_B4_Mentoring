package methodsReview;

import java.util.Scanner;

public class Fibonacci {

    // fibonacci  değişken int olacak
    // dönüş tipi long olacak
    // değşkene karşılık gelen fibonacci number i verecek

    //   1 2 3 4 5 6 7  8  9  10
    // 0 1 1 2 3 5 8 13 21 34 55

    public static void main(String[] args) {
      //  int n=50;
       // for (int i = 0; i <= n; i++) {
        //    System.out.print(fibonacci(n));
      //  }


        isimALOrtlamabul();


    }




    public static long fibonacci(int n){
        if(n<=1){
            return n;
        }
      return fibonacci(n-1)+fibonacci(n-2);
    }


    public static void isimALOrtlamabul(){

        Scanner oku = new Scanner(System.in);
        System.out.print("Öğrencinin Adı Soyadı: ");
        String isim = oku.nextLine();

        System.out.print("Fizik notu=");
        int fizik = oku.nextInt();

        System.out.print("kimya notu=");
        int kimya = oku.nextInt();

        System.out.print("mat notu=");
        int matematik = oku.nextInt();

        System.out.println(isim+"'in not ortalaması = "+ortalamaBul(fizik, kimya, matematik));
    }

    public static int ortalamaBul(int fiz, int kim, int mat){
        return (fiz+kim+mat)/3;

    }


}
