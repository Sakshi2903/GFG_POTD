class Solution {
    // Function to pairwise swap elements of a linked list.
    // It should returns head of the modified list
    public Node pairwiseSwap(Node head)
    {
        // code here
        Node tmp=head;
        Node tmp2=head.next;
        Node prev=null;
        int i=0,tmpx=0;
        while(tmp2!=null && tmp!=null)
        {
            if(tmp==head)
            {
                head=tmp.next;
                tmpx=1;
            }
            tmp.next=tmp2.next;
            tmp2.next=tmp;
            if(i>0)
            {
                prev.next=tmp2;
            }
            prev=tmp;
            tmp=tmp.next;
            if(tmp!=null)
                tmp2=tmp.next;
            i=tmpx;
        }
        return head;
    }
}
