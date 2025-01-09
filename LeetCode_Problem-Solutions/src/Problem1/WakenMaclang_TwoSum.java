package Problem1;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Waken Maclang <br>
 * @date January 9, 2025
 */

public class WakenMaclang_TwoSum {

    public static void main (String [] args){

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
