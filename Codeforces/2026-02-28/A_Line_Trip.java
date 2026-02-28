/* Question Link:- https://codeforces.com/problemset/problem/1901/A
 My Submission:- https://codeforces.com/problemset/submission/1901/364820052


Thought/Apprroach :-
The difference between the arrays of Fuel and the last stop - last digit of FuelStation whole * 2 and the,
difference from 0 to strting station and the maximum will be the answer.
*/


import java.util.Scanner;

public class A_Line_Trip {
    public static void main(String args[]){
        Scanner sc =  new Scanner(System.in);

        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int x = sc.nextInt();
            int arr[] = new int[n];
            for(int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
            }
            int maxFuel = Math.max(((x - arr[n-1]) * 2), (arr[0] - 0));
            for(int i = 1; i < n; i++){
                maxFuel = Math.max(maxFuel, (arr[i] - arr[i-1]));
            }
            System.out.println(maxFuel);
        }

    }
}
