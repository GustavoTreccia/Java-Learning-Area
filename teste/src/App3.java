public class App3 {

    public int solution(int[] A) {
        boolean changeNeeded = false;
        int flips = 0;
        int[] sequence = A; 
        for (int i = 0; i < A.length; i++) {
            sequence[i] = A[i];
        }
        for (int i = 0; i < sequence.length - 1; i++) { 

            if (sequence[i] == sequence[i + 1]) 
            {
                flips++;
                changeNeeded = true;
            }
            if (sequence[i] == 1 && changeNeeded) 
            {
                sequence[i] = 0;
                changeNeeded = false;
            } else if (sequence[i] == 0 && changeNeeded) 
            {
                sequence[i] = 1;
                changeNeeded = false; 
            }
        }
        if (sequence[0] == sequence[1]) {
            flips++;

        }
        return flips;
    }
}
