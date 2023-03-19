package logicalOperators_IfStatements;

public class LogicalOperators {
    public static void main(String[] args) {
        /*

        &&-And
        ||- Or

                    &-AND          |- Or        !-Not

        T --- T      T              T           T - F
        T --- F      F              T           F -T
        F --- T      F              T
        F --- F      F              F


     r= x<y & a<b


         */


        int x=9;
        int y=7;
        int a=7;
        int b=11;

//    boolean result=x>y;
//        System.out.println("result = " + result);

        boolean result=x>y || a>b;
        System.out.println("result = " + result);


    }
}
