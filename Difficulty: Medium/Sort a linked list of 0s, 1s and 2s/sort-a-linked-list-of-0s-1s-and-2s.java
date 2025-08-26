/* class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
        next = null;
    }
}*/
class Solution {
    static Node segregate(Node head) {
        // code here
        PriorityQueue<Integer> p=new PriorityQueue<>();
        Node temp=head;
        int count1=0;
          int count2=0;
            int count3=0;
        
           Node temp1=head;
           while(temp!=null)
           {
               if(temp.data==0)
               {
                   count1++;
               }
               
               if(temp.data==1)
               {
                   count2++;
               }
               
               if(temp.data==2)
               {
                   count3++;
               }
               temp=temp.next;
           }
         while(temp1!=null)
           {
              if(count1!=0)
              {
               temp1.data=0;
               count1--;
              }
              else if(count2!=0)
              {
                  temp1.data=1;
                  count2--;
              }
              else
              {
                  temp1.data=2;
                  count3--;
                  
              }
              temp1=temp1.next;
              
              
              
           }
           return head;
    }
}