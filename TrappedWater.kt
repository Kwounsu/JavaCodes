fun main(args: Array<String>) {
    val T = readLine()!!.toInt()
    for (i in 0..T-1) {
        val N = readLine()!!.toInt()
        trappedWater(N)
    }
}

fun trappedWater(N: Int) {
    // Variables
    val str = readLine()
    var blocks = ArrayList<Int>()
    var water = 0
    var left = 0
    var right = N-1
    var maxLeft = 0
    var maxRigth = 0
    
    // Convert string to intArray
    for (i in 0..str!!.length-1) {
        if (!str[i].isWhitespace())
            blocks.add(str[i].toString().toInt())
    }

    // Calculate trapped water
    while (left < right) {
        if (blocks[left] <= blocks[right]) {
            if (blocks[left] >= maxLeft) maxLeft = blocks[left]
            else water += maxLeft - blocks[left]
            left++
        } else {
            if (blocks[right] >= maxRigth) maxRigth = blocks[right]
            else water += maxRigth - blocks[right]
            right++
        }
    }

    // Print trapped water
    println (water)
}

// Java
/*
public class Main {
    public static void main(String[] args) 
    {
        missingAndRepeating();
    }
    
    public static void missingAndRepeating() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            
            // Run tests 'T' times
            int T = Integer.parseInt(br.readLine());
            for (int t = 0; t < T; t++) {
                
                // Get the size of array N and array through stdin
                int N = Integer.parseInt(br.readLine());
                String str = br.readLine();

                // Variables
                List<Integer> blocks = new ArrayList<Integer>();
                int water = 0;
                int left = 0;
                int right = N-1;
                int maxLeft = 0;
                int maxRigth = 0;
                
                // Convert String to array
                for (int i = 0; i < str.length(); i++) {
                    if (!Character.isWhitespace(str.charAt(i))) {
                        blocks.add(Character.getNumericValue(str.charAt(i)));
                    }
                }
                
                // Calculate trapped water
                while (left < right) {
                    if (blocks.get(left) <= blocks.get(right)) {
                        if (blocks.get(left) >= maxLeft) maxLeft = blocks.get(left);
                        else water += maxLeft - blocks.get(left);
                        left++;
                    } else {
                        if (blocks.get(right) >= maxRigth) maxRigth = blocks.get(right);
                        else water += maxRigth - blocks.get(right);
                        right++;
                    }
                }

                // Print trapped water
                System.out.println (water);
            }
        } catch (IOException ioe) {
            System.out.println(ioe);
        }
    }
}
*/
