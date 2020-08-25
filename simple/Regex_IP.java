import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

class Solution{

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }

    }
}

class MyRegex {
    // 0-255 (0-99|000-199|200-249|250-255)
    String num = "(\\d{1,2}|[0-1]\\d{2}|2[0-4]\\d|25[0-5])";
    public String pattern = num+"."+num+"."+num+"."+num;
}
