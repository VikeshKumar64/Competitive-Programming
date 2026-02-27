/* Question Link:- https://codeforces.com/problemset/problem/1903/A
 My Submission:- https://codeforces.com/problemset/submission/1903/364731687


Thought/Apprroach :-
I saw that when ever the k is greated than 1 then it will always be true and if it is less then we have to 
check if it is already sorted or not? 
i also did to many silly mistakes.
*/



import java.util.Scanner;

public class A_Halloumi_Boxes {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int arr[] = new int[n];
            for(int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
            }
            if(k >= 2){
                System.out.println("YES");
                continue;
            }
            else{
                boolean sorted = true;
                for(int i = 1; i < n; i++){
                    if(arr[i] < arr[i-1]){
                        sorted = false;
                        break;
                    }
                }
                if(sorted){
                    System.out.println("YES");
                } else{
                    System.out.println("NO");
                }
            }
        }
    }
}
