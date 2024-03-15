//Singly Linked list : Just a declaration part & operation part are there.Total 8 operations
//1)Display all 2) Add first 3) Add last 4) Add atpo 5)Delete first 6) Delete last 7)Delete at pos 8)Del all
//Creating anode
 class SinglyLinkedList
 {
    static class Node
    {
        private int data;
        private Node next;

        public Node()
        {
            data=0;
            next=null;
        }
        public Node(int value)
        {
            data=value;
            next=null;
        }
    }

    Node head;
public SinglyLinkedList()
{
    head=null;
}

boolean isempty()
{
    if(head==null)
    {
        return true;
    }
    else {
        return false;
    }
}

void Display()
{
    if(isempty())
    {
        System.out.println("List is empty");
    }
    else{
        Node trav;
        trav=head;
        while(trav!=null) //Rember first write down the thing then apply terminating condition. Go step by step.
        {
        System.out.println(trav.data);
        trav=trav.next;
        }
    }
}

void addFirst() //Make before break // First do for general case then optimize for special case.
{
    Node nn=new Node(5);
    nn.next=head;
    head=nn;
}

void addLast()
{
    //Here we need to first travel upto the last element 
    Node nn=new Node(8);
    Node trav;
    trav=head;
 while(trav.next!=null)
{
 trav=trav.next;
}

trav.next=nn;

}

}

class Test
{
    public static void main(String args[])
    {

    }
}