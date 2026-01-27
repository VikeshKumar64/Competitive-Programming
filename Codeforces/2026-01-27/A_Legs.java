/* Question Link:- https://codeforces.com/contest/1996/problem/A
 My Submission:- https://codeforces.com/contest/1996/submission/360117952


Thought/Apprroach :-
Just divide the number with 4 and its remainder with 2
*/

import java.util.Scanner;

public class A_Legs {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        for(int i = 0; i < t; i++){
            int a = sc.nextInt();
            System.out.println(a/4 + (a%4)/2);
        }
    }
}
