public class Main {
    public static void printOccurence(ArrayList<String> array) {
        HashMap<String,Integer> map = new HashMap<String,Integer>();
        // Count the occurence
        for (int i = 0; i < array.size(); i++){
            String str = array.get(i);
            if (map.containsKey(str)) {
                int count = map.get(str);
                map.remove(str);
                map.put(str,count+1);
            } else {
                map.put(str,1);
            }
        }
    
        Iterator it = sortByValue(map).iterator();
        
        while(it.hasNext()) {
            String temp = (String) it.next();
            System.out.println(temp + " = " + map.get(temp));
        }
    }
    
    public static List sortByValue(final Map map) {
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
    
    public static void main(String[] args) {
        Random r = new Random();
        ArrayList<String> list = new ArrayList<>();
        for (int i=0;i<399999;i++) { 
            ArrayList<Integer> l = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45));
            int ind;
            ind = r.nextInt(44);
            int n1 = l.get(ind);
            l.remove(ind);
            ind = r.nextInt(43);
            int n2 = l.get(ind);
            l.remove(ind);
            ind = r.nextInt(42);
            int n3 = l.get(ind);
            l.remove(ind);
            ind = r.nextInt(41);
            int n4 = l.get(ind);
            l.remove(ind);
            ind = r.nextInt(40);
            int n5 = l.get(ind);
            l.remove(ind);
            ind = r.nextInt(39);
            int n6 = l.get(ind);
            l.remove(ind);
            ind = r.nextInt(38);
            int n7 = l.get(ind);
            l.remove(ind);
            
            int[] arr = new int[7];
            arr[0]=n1; arr[1]=n2; arr[2]=n3; arr[3]=n4; arr[4]=n5; arr[5]=n6; arr[6]=n7;
            Arrays.sort(arr);
            
            String s = arr[0]+" "+arr[1]+" "+arr[2]+" "+arr[3]+" "+arr[4]+" "+arr[5]+" "+arr[6];
            list.add(s);
        }
        printOccurence(list);
    }
}
