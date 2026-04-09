import java.util.*;

public class Difference {
    public static void main(String[] args) {

        Solution obj = new Solution();

        int n = 10;   
        int m = 3;    

        int result = obj.differenceOfSums(n, m);

        System.out.println(result);
    }
}

class Solution {
    public int differenceOfSums(int n, int m) {
        int num1 = 0;
        int num2 = 0;

        for(int i = 1; i <= n; i++) {
            if(i % m == 0) {
                num2 += i;
            } else {
                num1 += i;
            }
        }

        return num1 - num2;
    }
}