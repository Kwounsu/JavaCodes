public class Main {
    static void spiralMatrix(int matrix[][]) {
        int left = 0;
        int right = matrix[0].length - 1;
        int top = 0;
        int bottom = matrix.length - 1;

        while((bottom >= top) && (right >= left)){
            // Traverse from Left to Right
            for(int j = left; j <= right; j++){
                System.out.print(matrix[top][j] + " ");
            }
            top++;

            // Traverse from Top to Bottom
            for(int i = top; i <= bottom; i++){
                System.out.print(matrix[i][right] + " ");
            }
            right--;

            // Traverse from Right to Left
            for(int j = right; j >= left; j--){
                System.out.print(matrix[bottom][j] + " ");
            }
            bottom--;

            // Traverse from Bottom to Top
            for(int i = bottom; i >= top; i--){
                System.out.print(matrix[i][left] + " ");
            }
            left++;
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
