/* Question Link:- https://codeforces.com/problemset/problem/2175/A
 My Submission:- https://codeforces.com/problemset/submission/2175/360043529
*/

import java.util.HashSet;
import java.util.Scanner;

public class A_Little_Fairys_Painting {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for(int i = 0; i < t; i++){
            int n = sc.nextInt();
            HashSet<Integer> colors = new HashSet<>();
            int max = 0;
            for(int j = 0; j < n; j++){
                int x = sc.nextInt();
                colors.add(x);
            }
            int D = colors.size();  // distinct count

            int answer = Integer.MAX_VALUE;

            for (int c : colors) {
                if (c >= D) {
                    answer = Math.min(answer, c);
                }
            }
            System.out.println(answer);
        }
    }
}