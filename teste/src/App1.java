import java.util.ArrayList;
import java.util.List;

public class App1 {
    public int solution(int[] A) {

        int count = 0;
        List<Integer> list = new ArrayList<Integer>();
    
    
        for (int i : A) {
            list.add(i);
        }

        boolean check = false;

        for (int j = 0; j < A.length-2 ; j++) {
            if ((list.get(j) - list.get(j + 1) > 0) && (list.get(j + 1) - list.get(j + 2) < 0)) {
                check = true;
            } else if ((list.get(j) - list.get(j + 1) < 0) && (list.get(j + 1) - list.get(j + 2) > 0)) {
                check = true;
            } else {
                check = false;
                break;
            }
        }
        if (check) {
            return 0;
        }
    
        List<Integer> ab = new ArrayList<Integer>();
    
        for (int i = 0; i < A.length; i++) {
            ab.clear();
            ab.addAll(list);
            ab.remove(i);
            int f = 0;
            boolean b = false;
            while (f < A.length - 3) {
                if (!b && f != 0) {
                    break;
                }
                if ((ab.get(f) - ab.get(f + 1) > 0) && (ab.get(f + 1) - ab.get(f + 2) < 0)) {
                    b = true;
                } else if ((ab.get(f) - ab.get(f + 1) < 0) && (ab.get(f + 1) - ab.get(f + 2) > 0)) {
                    b = true;
                } else {
                    b = false;
                }
                f++;
            }
            if (b) {
                count++;
            }
        }
        if (count == 0)
            count = -1;
    
        return count;
    }
}

/* 
#include <stdio.h>
        
    char aestheticallyPleasantCheck (int A[], int N) {
          int x;
          char pleasant = 0;
          for (x = 0; x < N - 2; x++){
                if ((A[x] < A[x + 1] && A[x + 1] > A[x + 2]) || (A[x] > A[x + 1] && A[x + 1] < A[x + 2])){
                    pleasant = 1;
                } else {
                    break;
                }
            }
            if (pleasant == 1 && x == N - 2) {
                return 0;
            } else {
                return 1;
            }
        }
        
        int solution (int A[], int N) {
          int count = 0;
          int ArrayCopy[N];
        
          if (aestheticallyPleasantCheck (A, N) == 0)
            {
              return 0;
            }
        
            for (int i = 0; i < N; i++){
                for (int m = 0; m < N; m++){
                    ArrayCopy[m] = A[m];
                }
            
                for (int m = i; m < N - 1; m++){
                    ArrayCopy[m] = ArrayCopy[m + 1];
                }
        
                if (aestheticallyPleasantCheck (ArrayCopy, N - 1) == 0){
                  count++;
                }
            }
        
            if (count == 0){
                count = -1;
            }
        
          return count;
        }
        
        
        /*
        Example test:   [3, 4, 5, 3, 7]
        Example test:   [1, 2, 3, 4]
        Example test:   [1, 3, 1, 2]
        */
/*       
        main ()
        {
        
          int A[] = { 3, 4, 5, 3, 7 };  // Expected 3 .^.^
          int B[] = { 1, 2, 3, 4 }; // 
          int C[] = { 1, 3, 1, 2 }; //
          int D[] = { 5, 3, 7, 8, 9 };
          printf ("Got %d : Expected 3\n", solution (A, sizeof (A) / sizeof (int)));
          printf("Got %d : Expected -1\n", solution( B, sizeof(B)/sizeof(int)));
          printf("Got %d : Expected 0\n", solution( C, sizeof(C)/sizeof(int)) );
          printf ("Got %d : Expected -1\n", solution (D, sizeof (D) / sizeof (int)));
          
          return 0;
        }

*/
