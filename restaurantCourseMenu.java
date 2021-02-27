public class Main {
    public static void main(String[] args) {
        String[] orders = {"ABCFG", "AC", "CDE", "ACDE", "BCFG", "ACDEH"};
        int[] course = {2,3,4};
        String[] re = solution (orders,course);
        
        for (String s:re)
            System.out.println(s);
    }
    
    static public List sortByValue(final Map map) {
        List<String> list = new ArrayList();
        list.addAll(map.keySet());

        Collections.sort(list,new Comparator() {
            public int compare(Object o1,Object o2) {
                Object v1 = map.get(o1);
                Object v2 = map.get(o2);
                return ((Comparable) v2).compareTo(v1);
            }
        });
        // Collections.reverse(list);
        return list;
    }
    
    static public String[] solution(String[] orders, int[] course) {
        ArrayList<String> answerList = new ArrayList<>();
        
        for (int c=0;c<course.length;c++) {
            HashMap<String,Integer> map = new HashMap<String,Integer>();
            int max = 0;
            for (String order:orders) {
                if (order.length() < course[c]) continue;
                for (int i=0;i<order.length()-course[c]+1;i++) {
                    for (int j=i+1;j<order.length()-course[c]+2;j++) {
                        String str = order.substring(i,i+1) + order.substring(j,j+course[c]-1);
                        if (map.containsKey(str)) {
                            int count = map.get(str);
                            map.remove(str);
                            map.put(str,count+1);
                            if (max < count+1) max = count+1;
                        } else {
                            map.put(str,1);
                        }
                    }
                }
            }
            Iterator it = sortByValue(map).iterator();
            while(it.hasNext()) {
                String temp = (String) it.next();
                if (max > map.get(temp)) {
                    break;
                } else {
                    System.out.println(temp + " = " + map.get(temp));
                    answerList.add(temp);
                }
            }
        }
        
        String[] answer = new String[answerList.size()];
        int size=0;
        for(String temp : answerList){
            answer[size++] = temp;
        }
        return answer;
    }
}
