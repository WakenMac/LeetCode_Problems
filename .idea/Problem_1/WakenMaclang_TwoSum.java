package Problem_1;

/**
 * @author Waken Maclang <br>
 * January 9, 2025
 */

/*
 * Given an array of integers nums and an integer target, return indices of the two numbers such that
 * they add up to target.
 *
 * You may assume that each input would have exactly one solution, and you may not use the same
 * element twice.
 *
 * You can return the answer in any order.
 * 
 * Constraints:
 * 2 <= nums.length <= 10^4
 * -10^9 <= nums[i] <= 10^9
 * -10^9 <= target <= 10^9
 * 
 * Numbers can be negative
 * Sum can also be negative
 */

public class WakenMaclang_TwoSum{

    public static void main (String [] args){
        System.out.println("Hello World");
    }

    public int[] twoSum(int[] nums, int target) {
        
        //O(n^2)

        for (int index = 0; index < nums.length; index++){
            for (int innerIndex = index + 1; innerIndex < nums.length; innerIndex++){
                if (nums[index] + nums[innerIndex] == target)
                    return new int [] {index, innerIndex};
            }
        }

        return null;
    }

}