public class Main {
    static int ROW = 4; 
    static int COLUMN = 4; 
    
    static void spiralMatrix(int a[][]) {
        /*  
         * i - iterator 
         * r - starting Row index 
         * c - starting Column index 
         * w - ending roW index 
         * n - ending columN index 
         */
        int i, r = 0, c = 0, w = ROW, n = COLUMN;
  
        while (r < w && c < n) { 
            // Print the first row from the remaining rows 
            for (i = c; i < n; i++) { 
                System.out.print(a[r][i] + " "); 
            } 
            r++; 
  
            // Print the last column from the remaining columns 
            for (i = r; i < w; i++) { 
                System.out.print(a[i][n - 1] + " "); 
            } 
            n--; 
  
            // Print the last row from the remaining rows */ 
            if (r < w) { 
                for (i = n - c; i >= c; i--) { 
                    System.out.print(a[w - 1][i] + " "); 
                } 
                w--; 
            } 
  
            // Print the first column from the remaining columns */ 
            if (c < n) { 
                for (i = w - 1; i >= r; i--) { 
                    System.out.print(a[i][c] + " "); 
                } 
                c++; 
            } 
        } 
    }
    
    public static void main(String[] args) {
        int myMatrix[][] = {{1,2,3,4},
                            {5,6,7,8},
                            {9,10,11,12},
                            {13,14,15,16}};
        spiralMatrix(myMatrix);
    }
}
