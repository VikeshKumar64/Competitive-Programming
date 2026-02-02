/* Question Link:- https://codeforces.com/problemset/problem/2166/A
 My Submission:- https://codeforces.com/problemset/submission/2166/361186252

Thought/Apprroach :-
Brute force
*/


import java.util.Scanner;

public class A_Same_Difference {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        while(t-- > 0){
            int n = scanner.nextInt();
            String s = scanner.next();

            char last = s.charAt(n-1);
            int count = 0;
            for(int i = 0; i < n; i++){
                if(s.charAt(i) != last){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
