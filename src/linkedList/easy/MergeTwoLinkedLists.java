package linkedList.easy;
import linkedList.ListNode;

public class MergeTwoLinkedLists {
    public static void main(String[] args) {
        MergeTwoLinkedLists solution = new MergeTwoLinkedLists();
        ListNode result = solution.mergeTwoLists(new ListNode(1), new ListNode(5));
        System.out.println(result.val);
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode sorted = new ListNode(0);
        ListNode current = sorted;
        while (list1 != null || list2 != null) {
            if (list2 == null || (list1 != null && list1.val <= list2.val)) {
                current.next = new ListNode(list1.val);
                list1 = list1.next;
            } else if(list2 != null) {
                current.next = new ListNode(list2.val);
                list2 = list2.next;
            }
            current = current.next;
        }

        return sorted.next;
    }
}
