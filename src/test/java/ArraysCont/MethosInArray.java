package ArraysCont;

import java.util.Arrays;

public class MethosInArray {
    public static void main(String[] args) {
        int plakalar[]={1,4,34,56,47,6,35};
        // elemanları başlangıçta atandı

        int [] sayilar={12,44,32,10,56,24,76,12};
        ilkVeSonElementKontrol(plakalar);
        ilkVeSonElementKontrol(sayilar);


        System.out.println(".........");

        String[] klupler={"Galatasaray", "Beşiktaş","Fenerbahce", "Trabzon","Ankaragücü"};

        ilkElementKontrol(klupler, new String[]{"Galatasaray","Milan","Real Madrid"});

        System.out.println("Reverse arrayden dönen değerler");
        for(int i: reverseArray(sayilar) ){
            System.out.print(i+", ");
        }

//        2Yol

        System.out.println(Arrays.toString(reverseArray(sayilar)));
    }









    public static void ilkVeSonElementKontrol(int [] abc){
        if(abc[0]==abc[abc.length-1]){
            System.out.println("Dizinin ilk ve son" +
                    " elemanı birbirine eşittir");
        }else{
            System.out.println("Dizinin ilk ve " +
                    "son elemanı eşit DEGİL");
        }


    }

    public static void ilkElementKontrol(String[]str1,String[]str2){
        if (str1[0].equalsIgnoreCase(str2[0])){
            System.out.println("String Dizinin ilk elemanları birbirine eşittir");
        }else{
            System.out.println("String Dizinin ilk elemanları eşit DEGİL");
        }
    }

    public static int [] reverseArray(int[] arr){

        //        int plakalar[]={1,4,34,56,47,6,35};// 7

        int []newArray=new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            newArray[i]=arr[arr.length-(i+1)]; // 7 istediğim 6 -- index out of bound
        }
        return newArray;
    }
}
