public class App2 {
    int solution(int[] A) {
        int ans = 0;
        for (int i = 0; i < A.length; i++) {
            if (ans > A[i]) {
                ans = A[i];
            }
        }
        return ans;
    }
}
