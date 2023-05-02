package encopsulation;

class Human{
    private int age;
    private String name;

    // ulaşmak için           get+variable name
    // set etmek için  de      set+variable name


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

        obj.setAge(30);
        obj.setName("Abdullah");

        System.out.println((obj.getName() + " : " + obj.getAge()));




    }
}
