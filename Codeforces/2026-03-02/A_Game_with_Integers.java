/* Question Link:- https://codeforces.com/problemset/problem/1899/A
 My Submission:- https://codeforces.com/problemset/submission/1899/365129915


Thought/Apprroach :-
the first will only lose when the when n % 3 == 0 and the n remainder is 1 or 2 then he will win.

*/
import java.util.Scanner;

public class A_Game_with_Integers {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            if(n%3 == 0) System.out.println("Second");
            if(n%3 == 1 || n%3 == 2) System.out.println("First");
        }
    }
}