package Problem3_LengthOfLongestSubstring;

/**
 * Given a string s, find the length of the longest substring without repeating characters.
 * <br>
 * <br> Example:
 * <br> Input: s = "abcabcbb"
 * <br> Output: 3
 * <br> Explanation: The answer is "abc", with the length of 3.
 *
 * @author Waken Maclang
 * @since January 12, 2025
 */

import java.util.HashSet;

public class WakenMaclang_LengthOfLongestSubstring {

    /*
    My solution (Pseudocode):

        Traverse String
        Increment tempCounter
            Check hashSet if ascii int value exists
                If not, increment tempCounter
                Else check to replace maxNum & re-instantiate the hashSet then backtrack to the character after
                    the character with the same character as the duplicate then retry traversal

        Example: abcdabcebb
     */

//    public int lengthOfLongestSubstring(String s){
//        HashSet<Integer> charList = new HashSet<>();
//        int maxCount = 0;
//
//        for (int i = 0; i < s.length(); i++){
//            if (charList.contains((int) s.charAt(i))){
//                maxCount = (charList.size() > maxCount)? charList.size() : maxCount;
//                char duplicate = s.charAt(i);
//                while (s.charAt(i - 1) != duplicate)
//                    i--;
//                charList = new HashSet<>();
//            }
//
//            charList.add((int) s.charAt(i));
//            if (i == s.length() - 1)
//                return (charList.size() > maxCount)? charList.size() : maxCount;
//        }
//
//        return maxCount;
//    }

    // Improved solution.
    // Inspired from Rahul Varma (LeetCode Problem 3: 3 Method's || C++ || JAVA || PYTHON || Beginner Friendly)
    public int lengthOfLongestSubstrning(String s){
        int left = 0, right, maxCount = 0;
        HashSet<Integer> charList = new HashSet<>();

        //Traverse the characters of the string once
        for (right = 0; right < s.length(); right++){

            //If a duplicate character is found
            if (charList.contains((int) s.charAt(right))){
                maxCount = Math.max(charList.size(), maxCount);

                //Shift the left character upnil the duplicate is found
                while(s.charAt(left) != s.charAt(right)){
                    charList.remove((int) s.charAt(left));
                    left++;
                }

                //Remove the duplicate then increment the lefft pointer
                charList.remove((int) s.charAt(left));
                left++;
            }

            //Adds the current character (right pointer) to the HashSet
            charList.add((int) s.charAt(right));
        }

        return (charList.size() > maxCount)? charList.size() : maxCount;
    }

    public static void main (String [] args){
        String tempString = " ";
        System.out.println((int) tempString.charAt(0));
    }

}
