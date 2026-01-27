/* Question Link:- https://codeforces.com/problemset/problem/2171/A
 My Submission:- https://codeforces.com/problemset/submission/2171/360122558


Thought/Apprroach :-
Just there is formula for chikens that 2c + 4k = n
*/
import java.util.Scanner;

public class A_Shizuku_Hoshikawa_and_Farm_Legs {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int num = sc.nextInt();
            if(num%2 != 0){
                System.out.println(0);
                continue;
            }
            int count = 0;
            for(int i = 0; i <= num/4; i++){
                int remain = num - (i*4);
                if(remain % 2 == 0) count++;
            }
            System.out.println(count);
        }
    }
}
