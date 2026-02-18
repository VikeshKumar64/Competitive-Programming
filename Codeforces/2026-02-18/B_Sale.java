/* Question Link:- https://codeforces.com/problemset/problem/34/B
 My Submission:- https://codeforces.com/problemset/submission/34/363480653


Thought/Apprroach :-
I also did this Question using recursion but , time limit exceeded ,
so what i did is sort the array and then from front of array run till capacity = 0 and the numbers are -ve.
*/


import java.util.Arrays;
import java.util.Scanner;

public class B_Sale {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int len = sc.nextInt();
        int cap = sc.nextInt();
        int arr[] = new int[len];
        for(int i = 0; i < len; i++){
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        int ans = 0;
        for(int i = 0; i < len  && cap > 0; i++){
            if(arr[i] < 0){
                ans += -arr[i];
                cap--;
            }
        }
        System.out.println(ans);
    }
}
