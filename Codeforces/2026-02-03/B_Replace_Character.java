/* Question Link:- https://codeforces.com/problemset/problem/2047/B
 My Submission:- http://codeforces.com/problemset/submission/2047/361329320


Thought/Apprroach :-
What i did is first counted the maximum frequency character and replaced it with
the lowest frequency character and break.
*/


import java.util.HashMap;
import java.util.Scanner;

public class B_Replace_Character {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();

            HashMap<Character, Integer> map = new HashMap<>();
            for (char c : s.toCharArray()) {
                map.put(c, map.getOrDefault(c, 0) + 1);
            }

            // If only one distinct character
            if (map.size() == 1) {
                System.out.println(s);
                continue;
            }

            char maxChar = 0, minChar = 0;
            int maxFreq = 0, minFreq = Integer.MAX_VALUE;

            for (char c : map.keySet()) {
                int freq = map.get(c);

                if (freq > maxFreq) {
                    maxFreq = freq;
                    maxChar = c;
                }
                if (freq < minFreq) {
                    minFreq = freq;
                    minChar = c;
                }
            }

            // ⚠️ Important fix
            if (maxChar == minChar) {
                for (char c : map.keySet()) {
                    if (c != maxChar) {
                        minChar = c;
                        break;
                    }
                }
            }

            char[] arr = s.toCharArray();
            for (int i = 0; i < n; i++) {
                if (arr[i] == minChar) {
                    arr[i] = maxChar;
                    break;
                }
            }

            System.out.println(new String(arr));
        }
    }
}
