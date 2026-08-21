class Solution {
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
        }
    }
    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
        
    }
    public static void printLL(Node head){
        while(head!=null){
            System.out.print(head.data +"-->");
        }
        System.out.println();
    }
}