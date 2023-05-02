package methodCont;

public class Task {
    public static void main(String[] args) {

      //  printPrimeBetween(1,50);
     //   System.out.println(".....");
      //  System.out.println(addPrimeBetween(1, 10));

     //   System.out.println(yenilenenler("javvaa"));
       // System.out.println(rakamBul("jkdkjlsfds152dfssdjhdsj555"));

        System.out.println(ikiKelimeAynıMi("Nefes", "Enfes"));

        int n=8;
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i)+" ");
        }

    }
    //write a program that print the prime number between two numbers
    //prime number between 1 and 50
    //1 2 3 5 7  11 13 19 23 29 31 37 41 43 47

    public static boolean isPrime(int n){
        for (int i=2; i<=n/2;i++)
            if(n%i==0)
                return false;
        return true;
    }

    public static void printPrimeBetween(int start,int end){
        for (int i = start; i <= end ; i++) {
            if(isPrime(i))
                System.out.print(i+" ");
        }
    }

    public static int addPrimeBetween(int start, int end){
        int result=0;
        for (int i = start; i <= end ; i++) {
            if(isPrime(i))
                result+=i;
        }
        return result;
    }





    public static String yenilenenler(String str) {
        String str1=str.replace(" ","");
        String result="";
        while (!str1.isEmpty()){
            if(str1.substring(1).contains(str1.substring(0,1))){
                result+=str1.substring(0,1);
            }
            str1=str1.replace(str1.substring(0,1),"");
        }
        return result;

    }


    public static boolean ikiKelimeAynıMi(String str1, String str2){
        String str1new=str1.toLowerCase();
        String str2new=str2.toLowerCase();

        if (str1new.length() != str2new.length()) {
            // Eğer kelimelerin uzunlukları farklıysa, kesinlikle aynı harflerden oluşamazlar.
            return false;
        }

            for (int i = 0; i < str1new.length(); i++) {
                int index= str2new.indexOf(str1new.charAt(i));
                if (index == -1) {
                    // Eğer bir karakter kelime 2'de bulunamazsa, kesinlikle aynı harflerden oluşamazlar.
                    return false;
                }

                // Bulunan karakteri kelime 2'den kaldır, tekrar tekrar sayılmasını önlemek için.
                str2new = str2new.substring(0, index) + str2new.substring(index + 1);
            }

    return true;
     }

/*

     import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Birinci kelimeyi girin: ");
            String kelime1 = input.nextLine();
            System.out.print("İkinci kelimeyi girin: ");
            String kelime2 = input.nextLine();

            boolean sonuc = ayniHarflerdenMi(kelime1, kelime2);
            System.out.println(sonuc);
        }

        public static boolean ayniHarflerdenMi(String kelime1, String kelime2) {
            if (kelime1.length() != kelime2.length()) {
                // Eğer kelimelerin uzunlukları farklıysa, kesinlikle aynı harflerden oluşamazlar.
                return false;
            }

            // İki kelimeyi dağınık karakter dizilerine dönüştür.
            char[] kelime1Dizi = kelime1.toCharArray();
            char[] kelime2Dizi = kelime2.toCharArray();

            // Kelime 1'deki her bir karakterin kelime 2'de bulunup bulunmadığını kontrol et.
            for (char c : kelime1Dizi) {
                int index = kelime2.indexOf(c);
                if (index == -1) {
                    // Eğer bir karakter kelime 2'de bulunamazsa, kesinlikle aynı harflerden oluşamazlar.
                    return false;
                }

                // Bulunan karakteri kelime 2'den kaldır, tekrar tekrar sayılmasını önlemek için.
                kelime2 = kelime2.substring(0, index) + kelime2.substring(index + 1);
            }

            // Tüm karakterler aynıysa, kelimeler aynı harflerden oluşur.
            return true;
        }
    }

*/


    public static long fibonacci(int n){
        if(n<=1){
            return n;
        }
        return (fibonacci(n-1)+fibonacci(n-2));
    }

    // 0 1 1 2 3 5 8 13 21 34 55
/*
    f(5)=f(4)+f(3)
    f(4)=f(3)+f(2)
    f(3)=f(2)+f(1)
    */

}
