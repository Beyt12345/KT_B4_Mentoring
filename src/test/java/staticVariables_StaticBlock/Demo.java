package staticVariables_StaticBlock;

class Mobile
{
    String brand;
    int price;
    static String name;

    static
    {
        System.out.println("in static block");
    }


    public Mobile()
{
    brand="";
    price=200;
    System.out.println("in constructor");
    //  name="Phone";
}

    // static ve non-static değişkenler --- NonStatic methodlarda kullanılabilir
    public void show()
    {
        System.out.println((brand + " : " + price + " : " + name));
    }



// static bir method da non static variablelar kullanılamaz
    public static void show1(Mobile obj)
    {
        System.out.println((obj.brand + " : " + obj.price + " : " + name));
        System.out.println("in static method");
    }


}

public class Demo {
    public static void main(String[] args) {
        Mobile obj1=new Mobile();// önce class load edilir sonra obje
//        obj1.brand="Apple";
//        obj1.price=1500;
//        obj1.name="Smart Phone";


        Mobile obj2=new Mobile(); // dah önce class yüklendiği için obje oluşturulur
    /*    obj2.brand="Samsung";
        obj2.price=1700;
        obj2.name="Phone";

    // Mobile.name="Phone";

        Mobile.show1(obj1); // class a ait method class adı ile çağrılabilir

        obj1.show();
        obj2.show();
*/
    }
}
