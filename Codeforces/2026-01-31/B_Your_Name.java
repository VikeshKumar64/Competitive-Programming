/* Question Link:- https://codeforces.com/problemset/problem/2167/B
 My Submission:- https://codeforces.com/problemset/submission/2167/360900719


Thought/Apprroach :-
Just sort the character array from string then compare....
*/

import java.util.Arrays;
import java.util.Scanner;

public class B_Your_Name {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            String r = sc.next();
            if(s.length() != r.length()){
                System.out.println("NO");
                continue;
            }
            char arrS[] = s.toCharArray();
            char arrR[] = r.toCharArray();
            Arrays.sort(arrS);
            Arrays.sort(arrR);
            boolean same = true;
            for(int i = 0; i < arrS.length; i++){
                if(arrS[i] != arrR[i]){
                    same = false;
                    break;
                }
            }
            System.out.println(same ? "YES" : "NO");
        }
    }
}
