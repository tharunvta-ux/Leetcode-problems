/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
   static Map<Integer,Integer>m=new HashMap<>();
    ListNode l;
    public void traverse(ListNode head)
    {
        ListNode temp=head;
        while(temp!=null)
        {
            m.put(temp.val,m.getOrDefault(temp.val,0)+1);
            temp=temp.next;
        }
    }
    public void add(int data)
    {
        ListNode newNode=new ListNode(data,null);
        if(l==null)
        {
            l=newNode;
        }
        else
        {
            ListNode temp=l;
            while(temp.next!=null)
            {
                temp=temp.next;
            }
            temp.next=newNode;

        }
    }
    public ListNode deleteDuplicates(ListNode head) {

        l=null;
        traverse(head);
        ListNode temp=head;
        while(temp!=null)
        {
           
            if(m.containsKey(temp.val))
            {

                add(temp.val);
            }
            m.remove(temp.val);
            temp=temp.next;
        }
     return l;   
    }

}