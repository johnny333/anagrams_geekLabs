package pl.gbzl.kolecki;

public class Main {

    public static void main(String[] args) {
        System.out.println(isAnagram("kto","kot"));
        System.out.println(isAnagram("warszawa","warsztaty"));
    }
    static Boolean isAnagram(String a1,String a2){
        boolean result =true;
        if (a1.length()==a2.length()){
            for (int i = 0; i < a1.length(); i++) {
                if(!a2.toLowerCase().contains(String.valueOf(a1.toLowerCase().charAt(i)))) return false;
            }
        }
        else {
            return false;
        }
        return result;
    }

}
