public class Solution {
    public int[] solution(int[] A, int K) {
        // Implement your solution here
        int N = A.length;
        int[] rotatedAry = new int[N];
        for(int i=0; i< N; i++)
        {
            int newIndex= (i+K)%N;
            rotatedAry[newIndex]=A[i];
        }
        return rotatedAry;
    }
    public static void main(String args[]){
        Solution solution = new Solution();
        int[] result = solution.solution(new int[] {3,7,8,9}, 2);
        System.out.println(java.util.Arrays.toString(result));
    }
    
}
