package Problem4_MedianOfTwoSortedArrays;

/**
 * Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the
 * two sorted arrays.
 * <br>
 * <br> Example:
 * <br> Input: nums1 = [1,3], nums2 = [2]
 * <br> Output: 2.00000
 * <br> Explanation: merged array = [1,2,3] and median is 2.
 *
 * @author Waken Maclang
 * @since January 12, 2025
 */

public class WakenMaclang_MedianOfTwoSortedArrays {

    //Helper method taken from merge sort
    public static int [] merge(int [] firstArray, int [] secondArray){
        int [] newArray = new int[firstArray.length + secondArray.length];

        int l = 0, r = 0, counter = 0;

        while (l < firstArray.length && r < secondArray.length){
            if (firstArray[l] < secondArray[r]){
                newArray[counter] = firstArray[l];
                l++;
            }   else {
                newArray[counter] = secondArray[r];
                r++;
            }

            counter++;
        }

        while (l < firstArray.length){
            newArray[counter] = firstArray[l];
            counter++;
            l++;
        }

        while (r < secondArray.length){
            newArray[counter] = secondArray[r];
            counter++;
            r++;
        }

        return newArray;
    }

    //Method to accommodate for the possibility of one or two medians (Based if array size is odd or even)
    public static double getMedian(int [] refArray){
        if (refArray.length % 2 == 1){
            int median = (int) Math.floor((double) refArray.length / 2);
            return refArray[median];
        }   else {
            int median = refArray.length / 2;
            double firstNum = refArray[median - 1];
            double secondNum = refArray[median];
            System.out.println(firstNum + " " + secondNum);
            return ((firstNum + secondNum) / 2);
        }
    }

    public static double findMedianSortedArrays(int [] nums1, int [] nums2){
        int [] newArray = merge(nums1, nums2);
        return getMedian(newArray);
    }

    //Test
    public static void main (String [] args){
        int [] first = {1, 2};
        int [] second = {3, 4};

        System.out.print(findMedianSortedArrays(first, second));
    }

}
