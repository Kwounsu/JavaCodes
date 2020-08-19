import java.util.ArrayList;
 
public class Main {
    public static void main(String[] args) {
        ArrayList<Character> arrayList = new ArrayList<>();
        String str = "something is happening";
        for (int i = 0; i < str.length(); i++) {
            for (int j = i+1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j) && !arrayList.contains(str.charAt(i))) {
                    arrayList.add(str.charAt(i));
                }
            }
        }
        System.out.println(arrayList);
    }
}
