package methodsReview;

public class Task {
    public static void main(String[] args) {
        // iki keleime alın
        // aynı harflerden oluşuyorsa true
        // oluşmuyorsa false
        //Nefes -- Enfes

        System.out.println(ikiKelimeAynımi("Zehraa", "Ezhara"));
    }

    public static boolean ikiKelimeAynımi(String str1, String str2){
        String str1new=str1.toLowerCase();
        String str2new=str2.toLowerCase();

        if(str1new.length()!=str2new.length()){
            return false;
        }

        for (int i = 0; i < str1new.length(); i++) {
            int index=str2new.indexOf(str1new.charAt(i));

            if(index==-1){
                return false;
            }

            str2new= str2new.substring(0,index)+str2new.substring(index+1);

        }
return true;

    }
}
