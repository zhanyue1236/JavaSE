import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        scanner.close();
        int res = lengthOfLongestSubstring(s);
        System.out.println(res);
    }
    public static int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int left = 0;
        int right = 0;
        int res = 0;
        int n = s.length();
        while (right < n)
        {
            char c = s.charAt(right);
            if (!set.contains(c))
            {
                set.add(c);
                res = Math.max(res, right - left + 1);
                right ++;
            }
            else
            {
                set.remove(s.charAt(left));
                left ++;
            }
        }
        return res;
    }

}