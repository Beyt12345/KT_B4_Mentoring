package methods;

public class MethodCont {
    public static void main(String[] args) {
     //   System.out.println(add(5, 6));

        System.out.println(oddOrEven(5));


    }

    public static int add(int num1,int num2){
        return num1+num2;
    }


    public static String oddOrEven(int n){
        String result="";
        if(n%2==0){
            result ="Even number";
        }else {
            result ="Odd number";
        }
        return result;
    }


}
