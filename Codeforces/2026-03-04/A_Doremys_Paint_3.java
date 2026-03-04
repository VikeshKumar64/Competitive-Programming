/* Question Link:- https://codeforces.com/problemset/problem/1890/A
 My Submission:- https://codeforces.com/problemset/submission/1890/365372699


Thought/Apprroach :-
Good and Hard question for 800 in this there should only be two distinct number and there count should
very as per the size of the given array

*/
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class A_Doremys_Paint_3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            HashMap<Integer, Integer> map = new HashMap<>();
            for(int i = 0; i < n; i++){
                int num = sc.nextInt();
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
            if(map.size() > 2){
                System.out.println("NO");
            } else if (map.size() == 1){
                System.out.println("YES");
            }else{
                List<Integer> freq = new ArrayList<>(map.values());
                if (Math.abs(freq.get(0) - freq.get(1)) <= 1)
                    System.out.println("Yes");
                else
                    System.out.println("No");
            }


        }
    }
}
