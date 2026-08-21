
class Solution {
  static class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
    }
  }
  public  ListNode reverseList(ListNode head){
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
  public static void printn(Node head){
    while(head!=null){
        System.out.print(head.data +"-->");
    }
    System.out.println();
  }
}

