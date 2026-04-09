import java.util.*;

public class BuzzFizz {
    public static void main(String[] args) {

        Solution obj = new Solution();

        int n = 15; // input

        List<String> result = obj.fizzBuzz(n);

        System.out.println(result);
    }
}

class Solution {
    public List<String> fizzBuzz(int n) {

        List<String> result = new ArrayList<>();

        for(int i = 1; i <= n; i++) {
            if(i % 3 == 0 && i % 5 == 0) {
                result.add("FizzBuzz");
            }
            else if(i % 3 == 0) {
                result.add("Fizz");
            }
            else if(i % 5 == 0) {
                result.add("Buzz");
            }
            else {
                result.add(Integer.toString(i));
            }
        }

        return result;
    }
}