/* Question Link:- https://codeforces.com/problemset/problem/1900/A
 My Submission:- https://codeforces.com/problemset/submission/1900/364998662


Thought/Apprroach :-
The pattern was when the '.' is consistently comes 3 time then the answer will be two other wise the total'.'

*/


import java.util.Scanner;

public class A_Cover_in_Water {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            String s = sc.next();

            char arr[] = s.toCharArray();

            int dotCount = 0;
            boolean consistentDot = false;

            for(int i = 0; i < n; i++){
                if(arr[i] == '.'){
                    dotCount++;
                    if(i >= 2 && arr[i-1] == '.' && arr[i-2] == '.'){
                        consistentDot = true;
                        break;
                    }
                }
            }
            System.out.println(consistentDot ? "2" : dotCount);
        }
    }
}
