import java.util.*;
class SingleLinkedList1
{
    static Node head;
    static class Node
    {
        int data;
        Node next;
        Node(int d)
        {
            data = d;
            next = null;
        }
    }
    
    public void printList()
    {
        Node n = head;
        while(n!=null)
        {
            System.out.print(n.data+"->");
            n = n.next;
        }
    }
    
    public static void getNewNode(int dat)
    {
        Node n = head;
        if(head==null)
            head=new Node(dat);
        else
        {
            n = head;
            while(n.next!=null)
            n = n.next;
            n.next=new Node(dat);
        }
    }
    
    public static void main(String S[])
    {
        SingleLinkedList1 sll = new SingleLinkedList1();
        int d;        
        while(true)
        {
            System.out.println("Add data y/n(1 or 0)");
            Scanner sc = new Scanner(System.in);
            int c = sc.nextInt();
            if(c==1)
            {
                    System.out.println("Enter Element");
                    d = sc.nextInt();
                    sll.getNewNode(d);
            }
            else
                break;
        }
        sll.printList();
    }
}