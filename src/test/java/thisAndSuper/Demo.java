package thisAndSuper;


class A{


    /*
    1. Default constructor
    2. super()
    3. Object class extend olması

     */


    public A(){
        super();   // Javada her class Object Class ını extent eder
        System.out.println("in A");
    }

    public A(int n){
        super();
        System.out.println("in A int");
    }

}


class B extends A{

    public B(){
        super();
        System.out.println("in B");

    }

    public B(int n){
        /*
        in A
        in A
        in B
        in B int


         */
        this();
    System.out.println("in B int");
    }

}

public class Demo {
    public static void main(String[] args) {

        B obj =new B(5);

    }

}
