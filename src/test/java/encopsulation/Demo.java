package encopsulation;

class Human{
    private int age;
    private String name;

    // ulaşmak için           get+variable name
    // set etmek için  de      set+variable name


    public Human() {
    }

    public Human(int age, String name) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age=age;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



}


public class Demo {
    public static void main(String[] args) {
        Human obj=new Human();
//        System.out.println("obj.age = " + obj.age);
//        System.out.println("obj.name = " + obj.name);

    //    obj.setAge(30);
   //     obj.setName("Abdullah");

        Human obj1=new Human(42,"Mehmet");

        System.out.println((obj.getName() + " : " + obj.getAge()));
        System.out.println((obj1.getName() + " : " + obj1.getAge()));




    }
}
/*
    variables ve Methodlar------- küçük harf  slow();    Slow();
     class e constructor------   büyük harf

 */