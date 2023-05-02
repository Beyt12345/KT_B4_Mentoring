package arrays;

public class Task2 {
    public static void main(String[] args) {
       String [] cars={"Toyota","Honda","BNW", "Mercedes", "Nissan"};

        System.out.println(arraydeArama(cars, "Nissan"));

       /*
       boolean bl=false;
        for (int i = 0; i < cars.length; i++) {
            if (cars[i].equalsIgnoreCase("Honda")){
                bl=true;
            }
        }

        if(bl){
            System.out.println("Bu marka araç bulunmaktadır");
        }
        else
        System.out.println("Bu marka araç bulunmamaktadır");

*/
    }


    public static String arraydeArama(String[] arry, String arananKelime){
        String result="Bu marka araç bulunmamaktadır";
        for (int i = 0; i < arry.length; i++) {
            if (arry[i].equalsIgnoreCase(arananKelime)){
                result="Bu marka araç bulunmaktadır";
                return result;
            }
        }

        return result;
        }


    }


