package StringClass;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        String str1="Hello";
        String str2="Hello";
        String str=new String("Hello");
        System.out.println(str);

        System.out.println((str1==str2));
        System.out.println((str1==str));

    }
}
