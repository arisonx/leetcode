public class AddTwoNumbers {

    public static void main(String[] args) {

        int[] l1 = { 2, 4, 3,4 };
        int[] l2 = { 5, 6, 4,5 };

        int[] result = new AddTwoNumbers().Solution1(l1, l2);
        for (int i = 0; i < result.length; i++) {
            System.out.println("Value:" + result[i] + "  indice: " + i);
        }

    }

    public int[] Solution1(int[] l1, int[] l2) {
        StringBuilder stbl1 = new StringBuilder();
        StringBuilder stbl2 = new StringBuilder();
        for (int i = 0, j = 0; i < l1.length && j < l2.length; i++, j++) {
            stbl1.append(l1[i]);
            stbl2.append(l2[j]);
        }

        int n1 = Integer.parseInt(stbl1.toString());

        int n2 = Integer.parseInt(stbl2.toString());

        int rs = n2 + n1;

        int i = String.valueOf(rs).length();
        String resultString = String.valueOf(rs);

        int[] result = new int[i];

        for (int j = 0; j < result.length; j++) {
            result[j] = Character.getNumericValue(resultString.charAt(j));
        }

        return result;
    }

}



class Solution {
    // Add Two Numbers (Java improved)
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode curr = dummyHead;
        int carry = 0;
        while (l1 != null || l2 != null || carry != 0) {
            int x = (l1 != null) ? l1.val : 0;
            int y = (l2 != null) ? l2.val : 0;
            int sum = carry + x + y;
            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            if (l1 != null)
                l1 = l1.next;
            if (l2 != null)
                l2 = l2.next;
        }
        return dummyHead.next;
    }
}
