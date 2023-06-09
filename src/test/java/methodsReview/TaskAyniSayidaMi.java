package methodsReview;

public class TaskAyniSayidaMi {


    public static void main(String[] args) {

        System.out.println(ayniSayidaMi("Ankara ile Bursa arasi 500km.", "Ankara", "Bursa"));
        System.out.println(ayniSayidaMi("Ankara Bursa kadar yeşil değil. Bursa bir başka.", "Ankara", "Bursa"));
        System.out.println(ayniSayidaMi("Istanbul çok uzak", "Ankara", "Bursa"));
        System.out.println(ayniSayidaMi("Bursa ve Istanbul deneyelim", "Bursa", "Ankara"));
    }

    //  Bursa ile Ankara kelimeli cümlenin içerinde aynı sayıda dönüyorsa true
    //  farklı sayılarda dönüyorsa false yazdıran metodu yazınız.
    //  Ankara ile Bursa arası 500 km. True
    //  Ankara Bursa kadar yeşil değil. Bursa bir başka. False
    //  İstanbul çok uzak. false

    public static boolean ayniSayidaMi(String str, String istenen1, String istenen2) {
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.toLowerCase().contains(istenen1.toLowerCase())) {
                str = str.replaceFirst(istenen1, "");
                count1++;
            }
            if (str.toLowerCase().contains(istenen2.toLowerCase())) {
                str = str.replaceFirst(istenen2, "");
                count2++;
            }
        }
        if (count1 == count2&& count2==0) {
            return false;
        }
        else if (count1==count2){
            return true;
        }

        else return false;
    }
}
