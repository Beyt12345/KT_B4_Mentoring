package ArraysCont;

import java.util.Arrays;

public class ArraysMethod {
    public static void main(String[] args) {
        int[]dizi1={1,2,3};
        int[]dizi2={1,2,3};

        int plakalar[]={1,4,34,56,47,6,35};


        String[]names={"Ayşe", "Emine", "Umit","Uğur","Engin","Sener","Serkan"};


        String  str1=new String("Hello");
        String str2=new String("Hello");

        System.out.println((str1 == str2));// false refaransları kontrol eder ve farklıdır
        System.out.println((str1.equals(str2)));// true verir stringlerin aynı olup olmadığını kontrol eder

        for (String s: names){
            System.out.print(s+" ");
        }

        System.out.println("....");
        // toString methodu
        System.out.println("toString ile yazdırma :"+Arrays.toString(names));


        //sort elemanları sıralar
        Arrays.sort(names);
        System.out.println("sort edilmiş hali :"+Arrays.toString(names));

        System.out.println(Arrays.toString(plakalar));
        Arrays.sort(plakalar,2,7);
        System.out.println(Arrays.toString(plakalar));


        // fill
        int[]sayilar=new int[5];
        Arrays.fill(sayilar, 7);
        System.out.println(Arrays.toString(sayilar));


        int []arr1={2,4,6,8,10};
        int [] arr2=arr1;

        System.out.println(Arrays.toString(arr2));

        arr1[0]=20;
        System.out.println(Arrays.toString(arr1));

        arr2[4]=100;


        System.out.println(Arrays.toString(arr1));

    }
}
