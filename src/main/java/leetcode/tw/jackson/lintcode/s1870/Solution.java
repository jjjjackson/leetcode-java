package leetcode.tw.jackson.lintcode.s1870;

public class Solution {

    public int stringCount(String str) {
        int counter = 0;
        int numberOfZero = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '0') {
                numberOfZero++;
            } else {
                counter += (1 + numberOfZero) * numberOfZero / 2; // answer += counter!
                numberOfZero = 0;
            }
        }

        if (numberOfZero != 0) {
            counter += (1 + numberOfZero) * numberOfZero / 2;
        }

        return counter;
    }
}
