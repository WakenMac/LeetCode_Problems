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
 * 
 * input x, and y is any other value in the array
 * x - ? = target.
 */

import java.util.HashMap;
import java.util.Map;

public class WakenMaclang_TwoSum{

    public static void main (String [] args){
        WakenMaclang_TwoSum sample = new WakenMaclang_TwoSum();
        int [] nums = {3,2,4};
        int [] result = sample.twoSum(nums, 6);
        System.out.println(result[0] + " " + result[1]);
    }

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        
        //Checks if the missingValue is found within the HashMap
        //If not, add the current number to the HashMap
        //Else return the two indexes

        //Discrepancy resolved:
        //(1) Reduces the issue of double iterations. Regardless if the number's compliment is not
        //    part of the hashmap yet, the compliment in the succeeding part of the array is bound to
        //    find the compliment's compliment is already stored in the HashMap
        //(2) Issues with compliments that have the same values which causes issues
        //    with the HashMap's value (index) returned after passing the kay.
        for (int index = 0; index < nums.length; index++){
            int missingValue = target - nums[index];

            if (map.containsKey(missingValue) && map.get(missingValue) != index)
                return new int [] {index, map.get(missingValue)};
            
            map.put(nums[index], index);
        }

        return null;
    }
}

/*
 * HashMap<Integer, Integer> hashMap = new HashMap<>();
        
    //Stores the index into the hashTable 
    //O(n)
    for (int index = 0; index < nums.length; index++)
        hashMap.put(nums[index], index);
    
    for (int index = 0; index < nums.length; index++){
        int missingValue = target - nums[index];
        if (hashMap.containsKey(missingValue))
            return new int [] {index, hashMap.get(missingValue)};
    }

    return null;
 */