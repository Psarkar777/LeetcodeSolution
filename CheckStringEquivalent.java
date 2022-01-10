// Leetcode : 1662

/*
* Given two string arrays word1 and word2, return true if the two arrays represent the same string, and false otherwise.

A string is represented by an array if the array elements concatenated in order forms the string.



Example 1:

Input: word1 = ["ab", "c"], word2 = ["a", "bc"]
Output: true
Explanation:
word1 represents string "ab" + "c" -> "abc"
word2 represents string "a" + "bc" -> "abc"
The strings are the same, so return true.
Example 2:

Input: word1 = ["a", "cb"], word2 = ["ab", "c"]
Output: false
Example 3:

Input: word1  = ["abc", "d", "defg"], word2 = ["abcddefg"]
Output: true
* */

package Leetcode;

public class CheckStringEquivalent {
    public static String helper(String[] words) {
        StringBuilder sb = new StringBuilder();
        for(String word : words) {
            sb.append(word);
        }
        return sb.toString();
    }

    public static boolean arrayStringAreEqual(String[] word1, String[] word2) {
        return helper(word1).equals(helper(word2));
    }

    public static void main(String[] args) {
        String[] word1 = {"ab", "c"};
        String[] word2 = {"a", "bc"};
        System.out.println(arrayStringAreEqual(word1, word2));
    }
}
