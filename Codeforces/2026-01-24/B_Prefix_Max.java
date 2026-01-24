/* Question Link:- https://codeforces.com/contest/2185/problem/B
 My Submission:- https://codeforces.com/contest/2185/submission/359567413

Thought/Apprroach :-
First I thought of sorting the array then, I saw, if maximum number will be in 
starting then it always be maximum so why not just multiply with the length.
*/
import java.util.Scanner;

public class B_Prefix_Max {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            int m = sc.nextInt();
            int max = Integer.MIN_VALUE;
            for(int j = 0; j < m; j++){
                max = Math.max(max, sc.nextInt());
            }
            System.out.println(max*m);
        }
    }
}