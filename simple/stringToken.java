/*
 * Input: He is a very very good boy, isn't he?
 * Output: 
 *        10 // # of tokens
 *        He
 *        is
 *        a
 *        very
 *        very
 *        good
 *        boy
 *        isn
 *        t
 *        he
 */

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        String s = new Scanner(System.in).useDelimiter("\\Z").next().trim();

        if (s.length() > 0) {
            String token[] = s.split("[!,?._'@\\s]+");
            System.out.println(token.length);
            for (String str: token) System.out.println(str);
        }
        else System.out.println(0);
    }
}
