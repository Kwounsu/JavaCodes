public class Main {
    static void palindrome(String str) {
        boolean flag = true;
        int i = 0, j = str.length() - 1; 
  
        while (i < j) { 
            if (str.charAt(i) != str.charAt(j)) 
                flag = false; 
            i++; 
            j--; 
        }
        if (flag) {
            System.out.println(str + " is palindrome.");
        } else {
            System.out.println(str + " is not palindrome.");
        }
    }

    public static void main(String[] args) {
        palindrome("Hello");
        palindrome("BOB");
    }
}
