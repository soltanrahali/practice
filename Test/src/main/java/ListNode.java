import java.util.*;

// Java implementation of the approach
public class ListNode {
	
	int val;
	ListNode next;
	ListNode(){}
	ListNode(int val){this.val=val;}
	ListNode(int val, ListNode next){
		this.val=val;
		this.next=next;
	}


	// Function to delete the nth node from  the end of the given linked list
	public static ListNode removeNthFromEnd(ListNode head, int n)
	{

		// First pointer will point to the head of the linked list
		ListNode first = head;
		// Second pointer will point to theNth node from the beginning
		ListNode second = head;
		for (int i = 0; i < n; i++) {

			if (second.next == null) {

			
				if (i == n - 1)
					head = head.next;
				return head;
			}
			second = second.next;
		}

		while (second.next != null) {
			first = first.next;
			second = second.next;
		}

		first.next = first.next.next;
		
		return head;
	}

	public void push(int new_data)
	{
        ListNode new_node = new ListNode(new_data);
       // new_node.next = head;
       // head = new_node;
	 }

	// Driver code
	public static void main(String[] args)
	{
	
		
		

	}
}
