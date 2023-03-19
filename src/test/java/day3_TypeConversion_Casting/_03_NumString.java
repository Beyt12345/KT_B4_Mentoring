package day3_TypeConversion_Casting;

public class _03_NumString {

    public static void main(String[] args) {
        String str="65";
        int i=65;

       // int toplam=i+str;

        // kelimenin sayıya çevrilmesi
        int strToNum=Integer.parseInt(str);
        System.out.println("strToNum = " + strToNum);
        System.out.println("str = " + str);

        int toplam=i+strToNum;
        System.out.println("toplam = " + toplam);


        // sayının kelimeye çevrilmesi
        String numToStr=Integer.toString(i);
        System.out.println("numToStr = " + numToStr);
      //  int toplam3=i+numToStr;

        /*


        Samsung s8 128GB aht,2500,655231,
         Samsung s7 64GB aht,3000,655531,
          Samsung s8 128GB aht,2750,654535,
           Samsung s8 256GB aht,3250,6542351,


         */


    }
}
