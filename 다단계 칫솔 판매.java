import java.util.HashMap;
import java.util.List;
import java.util.Arrays;


class Solution {
    public int[] solution(String[] enroll, String[] referral, String[] seller, int[] amount) {
        int[] answer = new int[enroll.length];
        for (int i = 0; i < enroll.length; i++){
            answer[i] = 0;
        }
        
//         HashMap<String, String> parent = new HashMap<String, String>();
//         for (int i = 0; i < enroll.length; i++){
//             parent.put(enroll[i], referral[i]);
//         }
        HashMap<String, Integer> parent = new HashMap<String, Integer>();
        for (int i = 0; i < enroll.length; i++){
            parent.put(enroll[i], i);
        }
        
//         List<String> enrollList  = Arrays.asList(enroll);
        for (int i = 0; i < seller.length; i++){
            String cur = seller[i];
            int money = amount[i] * 100;
            
            while (cur != "-") {
                int fee = (int)(money * 0.1);
                int earn = money - fee;
                
//                 try {
//                     int index = enrollList.indexOf(cur);
//                     answer[index] += earn;
//                 } catch(IndexOutOfBoundsException e) {
//                     break;
//                 }
                try {
                    answer[parent.get(cur)] += earn;
                } catch(Exception e) {
                    break;
                }
                
//                 cur = parent.get(cur);
                cur = referral[parent.get(cur)];
                money = fee;
            }
        }
        
        return answer;
    }
}
