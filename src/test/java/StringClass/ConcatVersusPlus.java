package StringClass;

public class ConcatVersusPlus {
    public static void main(String[] args) {
        String s1 = "Kraft Technologie, 2500";
        String s2 = "Kraft Technologie, 3500";
        String s3 = "Kraft Technologie, 4500";
        String s4 = "Kraft Technologie, 2500";

        // 2 Çeşit
        // Tek parametreli
        // Çift parametreli

        System.out.println(s1.substring(0));
        System.out.println(s1.substring(6));

        System.out.println(s1.substring(0, 5));// 5 hariç yazdırır  -- Kraft
        System.out.println(s1.substring(16)); // 6 dahil 17 zaten yok
                                                //Technologie

        System.out.println(s1.length());
        System.out.println(s1.substring(s1.length() ));
    }
}
