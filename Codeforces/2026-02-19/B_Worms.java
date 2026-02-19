/* Question Link:- https://codeforces.com/problemset/problem/474/B
 My Submission:- https://codeforces.com/problemset/submission/474/363604571


Thought/Apprroach :-
This Question was good, In this we have to make the prifix array and use binary search untill the 
q[i] <= arr[i] and the answer will be left ponter.
*/

import java.util.Scanner;

public class B_Worms {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int q = sc.nextInt();
        int qArray[] = new int[q];
        for(int i = 0; i < q; i++){
            qArray[i] = sc.nextInt();
        }

        int prifix[] = new int[n];
        prifix[0] = arr[0];
        for (int i = 1; i < n; i++) {
            prifix[i] = prifix[i - 1] + arr[i];
        }

        for(int i = 0; i < q; i++){
            int left = 0;
            int right = n - 1;
            while(left < right){
                int mid = left + (right - left) / 2;
                if(prifix[mid] < qArray[i]){
                    left = mid + 1;
                }else {
                    right = mid;
                }
            }
            System.out.println(left + 1);
        }



    }
}