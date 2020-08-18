public class Main {
    public static int bs(List<Integer> myList, int number) {
        int low = 0; 
        int high = myList.size() - 1;
        while (high >= low) { 
            int middle = (low + high) / 2; 
            if (myList.get(middle) == number) { 
                return middle; 
            } else if (myList.get(middle) < number) { 
                low = middle + 1; 
            } else if (myList.get(middle) > number) { 
                high = middle - 1; 
            } 
        } 
        return -1;
    }
    
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(new Integer[]{1,2,3,4,5,6,7,8,9,10,11,12});
        System.out.println(bs(myList, 3));
    }
}
