package arrays;

public class ArraysDataTypes {

    //new repo
    public static void main(String[] args) {
        int [] dizi1 =new int[5];
        String [] dizi2=new String[6];
        boolean [] dizi3=new boolean[3];
        double [] dizi4=new double[4];

        dizi2[3]="Emine"; // 4. elemente atama yaptık
        dizi1[0]=4;
        dizi1[1]=5;
        dizi1[2]=6;
        dizi1[3]=7;
        dizi1[4]=9;

//        4 5 6 7 9
//        0 1 2 3 4  //index
//

        System.out.println("dizi1[4] = " + dizi1[4]);

        dizi1[4]=45;

        System.out.println("dizi1[4] = " + dizi1[4]);


        for (int i = 0; i < dizi1.length; i++) {
            System.out.println("dizi["+i+"] = " + dizi1[i]);
        }


        for (int i = 0; i < dizi2.length; i++) {
            System.out.println("dizi2[i] = " + dizi2[i]);
        }

        for (int i = 0; i < dizi3.length; i++) {
            System.out.println("dizi3[boolean] = " + dizi3[i]);
        }

        for (int i = 0; i < dizi4.length; i++) {
            System.out.println("dizi4[double] = " + dizi4[i]);
        }


        System.out.println("dizi1.length = " + dizi1.length);
    }
}
