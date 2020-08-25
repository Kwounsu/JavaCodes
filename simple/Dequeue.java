import java.util.*;

public class test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Deque<Integer> deque = new ArrayDeque<Integer>();
        Set<Integer> set = new HashSet<Integer>();
        int n = in.nextInt();
        int m = in.nextInt();
        int maxUnique = 0;

        for (int i = 0; i < n; i++) {
            int num = in.nextInt();
            deque.add(num);
            set.add(num);
            if (deque.size() == m) {
                if (set.size() > maxUnique) maxUnique = set.size();
                int ele = deque.removeFirst();
                if (!deque.contains(ele)) set.remove(ele);
            }
        }
        in.close();
        System.out.println(maxUnique);
    }
}
