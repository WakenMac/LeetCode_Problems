package Problem2_AddTwoNumbers;

/**
 * <p>
 * You are given two non-empty linked lists representing two non-negative integers.
 * The digits are stored in reverse order, and each of their nodes contains a single digit.
 * Add the two numbers and return the sum as a linked list.
 *
 * <br>
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 * </p>
 *
 * @author Waken Maclang
 * @since January 10, 2025
 */

public class WakenMaclang_AddTwoNumbers {

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2){
        ListNode solution = new ListNode(0);
        ListNode curr = solution;
        int carry = 0;

        //Traverses the two listNodes
        while(l1 != null || l2 != null || carry != 0){
            //Handle the sum
            int x = (l1 == null)? 0 : l1.val;
            int y = (l2 == null)? 0 : l2.val;
            int sum = x + y + carry;

            //Handles the carry value (Higher digit)
            carry = sum / 10;

            //Adds the lower digit to the next node
            curr.next = new ListNode(sum % 10);
            curr = curr.next;

            //Moves the first and second reference nodes to the next node
            l1 = (l1 == null)? null : l1.next;
            l2 = (l2 == null)? null : l2.next;
        }

        return solution.next;
    }

    public static void main(String [] args){
        ListNode l1_2 = new ListNode(4);
        ListNode l1_1 = new ListNode(3, l1_2);
        ListNode l1 = new ListNode(8, l1_1);

        ListNode l2_2 = new ListNode(4);
        ListNode l2_1 = new ListNode(3, l2_2);
        ListNode l2 = new ListNode(4, l2_1);

        ListNode node = addTwoNumbers(l1, l2);

        String refString = "";
        while (l1 != null){
            refString = l1.val + refString;
            l1 = l1.next;
        }

        System.out.print(refString + " + ");

        refString = "";
        while (l2 != null){
            refString = l2.val + refString;
            l2 = l2.next;
        }

        System.out.print(refString + " = ");

        refString = "";
        while (node != null){
            refString = node.val + refString;
            node = node.next;
        }

        System.out.print(refString);
    }

}
