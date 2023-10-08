class Solution {
    Node sortedInsert(Node head1, int key) {
        // Add your code here.
        Node nn=new Node(key);
        nn.next=null;
        
        if(head1.data>key)
        {
            nn.next=head1;
            head1=nn;
        }
        else
        {
            Node tmp=head1;
            Node prev=null;
            while(tmp.data<=key && tmp.next!=null)
            {
                prev=tmp;
                tmp=tmp.next;
            }
            if(tmp.data<=key)
            {
                tmp.next=nn;
            }
            else
            {
                prev.next=nn;
                nn.next=tmp;
            }
        }
        return head1;
    }
}
