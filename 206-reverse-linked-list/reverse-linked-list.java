
class Solution {
  public class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
    }
  }
public ListNode reverseList(ListNode head) {
    ListNode prev = null;
    ListNode curr = head;

    while(curr!=null){
        ListNode next = curr.next;
        curr.next = prev;
        prev = curr;
        curr = next;    
    }
    return prev;
    }
static void printN(Node head){
    while(head!= null){
        System.out.print(head.data + "-->");
        head = head.next;
    }
    System.out.println();
}

}