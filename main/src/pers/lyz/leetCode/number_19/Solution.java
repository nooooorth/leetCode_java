package pers.lyz.leetCode.number_19;

public class Solution{

	public static void main(String[] args){
		ListNode key = new ListNode(1);
		key.next = new ListNode(1);
		key.next.next = new ListNode(2);
		ListNode a = deleteDuplicates(key);
		System.out.println(a.val+ a.next.val);
	}
	public static class ListNode {
		int val;
		ListNode next;
		ListNode(int x) {
			val = x;
			}
	}
	public static ListNode deleteDuplicates(ListNode head) {
		ListNode key = head;
		if(key ==null ||key.next == null)
			return key;
		boolean flag = true;
		while (flag){
			if(key.val == key.next.val)
				key.next = key.next.next;
			else
				key = key.next;

			if(key.next == null)
				flag = false;
		}
		return head;
    }
}