/* Question Link:- https://codeforces.com/contest/2193/problem/A
 My Submission:- https://codeforces.com/contest/2193/submission/359898013

Thought/Apprroach :-
Ahh.. this question was straight forward so I don't took to much time.

*/
import java.util.Scanner;

public class A_DBMB_and_the_Array {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            int m = sc.nextInt();
            int s = sc.nextInt();
            int x = sc.nextInt();
            int sum = 0;
            for(int j = 0; j < m; j++){
                sum += sc.nextInt();
            }
            if(sum == s){
                System.out.println("YES");
            } else if(s - sum >=0 && (s - sum) % x == 0){
                System.out.println("YES");
                }
            else{
                System.out.println("NO");
            }
        }
    }
}
