
public class Main {
    public static void main(String[] args) {
        int[][] x = {{ 1,1,1,1,1,1,1,1},{0,1,1,1,1,1,1,1},{0,0,0,0,1,1,1,1},{0,1,0,0,1,1,1,1},{0,0,0,0,0,0,1,1},{0,0,0,0,0,0,0,1},{0,0,0,0,1,0,0,1},{0,0,0,0,1,1,1,1}};
        int[] re = solution(x);
        System.out.println(re[0] +" "+ re[1]);
    }
    
    static public int check(int[][] arr, int x, int y, int size) {
        for (int i=x;i<x+size;i++) {
            for (int j=y;j<y+size;j++) {
                if (arr[x][y] != arr[i][j]) return 2;
            }
        }
        return arr[x][y];
    }
    
    static public int[] compression(int[][] arr, int x, int y, int size, int[] answer) {
        int checked = check(arr,x,y,size);
        if (checked == 0) {
            answer[0] = answer[0]+1;
        } else if (checked == 1) {
            answer[1] = answer[1]+1;
        } else {
            size /= 2;
            answer = compression(arr,x,y,size,answer);
            answer = compression(arr,x,y+size,size,answer);
            answer = compression(arr,x+size,y,size,answer);
            answer = compression(arr,x+size,y+size,size,answer);
        }
        return answer;
    }
    
    static public int[] solution(int[][] arr) {
        int[] answer = new int[2];
        compression(arr,0,0,arr.length,answer);
        return answer;
    }
}
