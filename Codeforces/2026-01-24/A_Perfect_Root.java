/* Question Link:- https://codeforces.com/contest/2185/problem/A
 My Submission:- https://codeforces.com/contest/2185/submission/359561486

Thought/Apprroach :-
I thought there is a trick to this question cause the test cases values 
were very unpredictable.
*/
import java.util.Scanner;

public class Perfect_Root {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            long x = sc.nextInt();
            for(int j = 1; j < x + 1; j++){
                System.out.println(j);
            }
        }
    }
}

