fun canFormPalindrome(str: String): Boolean {
    var chars = mutableListOf<Char>()
    for (char in str) {
        if (chars.contains(char)) {
            chars.remove(char)
        } else {
            chars.add(char)
        }
    }
    if (chars.size > 1) {
        return false
    } else {
        return true
    }
}

fun main(args: Array<String>) {
    println(canFormPalindrome("edcabbbacd"))
}

// Java
/*
public class Main {
    public static boolean canFormPalindrome(String str) {
        List<Character> chars = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            if (chars.contains(str.charAt(i))) {
                chars.remove(new Character(str.charAt(i)));
            } else {
                chars.add(str.charAt(i));
            }
        }
        if (chars.size() > 1) {
            return false;
        } else {
            return true;
        }
    }
    
    public static void main(String[] args) {
        System.out.println(canFormPalindrome("abbc"));
    }
}
*/
