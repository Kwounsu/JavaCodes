public class Main {
    static String reverseString(String str) {
        String tmp = "";
        for (int i = str.length()-1; i >= 0; i--) {
            tmp += str.charAt(i);
        }
        return tmp;
    }
 
    public static void main(String[] args) {
        System.out.println(reverseString("Hello World"));
    }
}
