package com.company;

public class LL
{
    private Node head;
    private  Node tail;
    private int size;
    public LL()
    {
        this.size=0; //self initialised by constructor during object creation
    }

    public void insertAtBeginning(int val)
    {
        Node node=new Node(val);
        node.next = head;
        head = node;

        if(tail==null)
        {
            tail = head;
        }
        size++;
    }

    public void insertAtEnd(int val)
    {
        if(tail==null)
        {
            insertAtBeginning(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }

    public void insert(int val,int index)
    {
        if(index==0)
        {
            insertAtBeginning(val);
            return;
        }
        if(index==size)
        {
            insertAtEnd(val);
            return;
        }

        Node temp = head;
        for(int i=1;i<index;i++)
        {
            temp=temp.next;
        }
        Node node = new Node(val,temp.next);
        temp.next = node;

        size++;
    }

    public int deleteFromBeginning()   //returns the deleted value
    {
        int val = head.value;
        head=head.next;
        if(head == null)
        {
            tail = null;
        }
        size--;
        return val;
    }

    public  int deleteFromLast()  //returns deleted value
    {
        if(size<=1)
        {
            return deleteFromBeginning();
        }

        Node secondlast = get(size-2);
        int val = tail.value;
        tail = secondlast;
        tail.next = null;
        return val;
    }

    public int delete(int index)
    {
        if(index==0)
        {
            return deleteFromBeginning();
        }
        if(index==size-1)
        {
            return deleteFromLast();
        }

        Node previous = get(index-1);
        int val = previous.next.value;

        previous.next=previous.next.next;

        return val;
    }

    public Node get(int index)  //returns a reference pointer to that node
    {
        Node node = head;
        for(int i=0;i<index;i++)
        {
            node=node.next;
        }
        return node;
    }

    public Node find(int value)
    {
        Node node = head;
        while(node!=null)
        {
            if(node.value == value)
            {
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public void display()
    {
        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.value + "->");
            temp = temp.next;
        }
        System.out.println("END");
    }

    private class Node
    {
        private int value;
        private Node next;

        public Node(int value) //constructor
        {
            this.value=value;
        }
        public Node(int value,Node next) //constructor
        {
            this.value=value;
            this.next=next;
        }
    }

    public static void main(String[] args) {
        LL list = new LL();
        list.insertAtBeginning(1);
        list.insertAtBeginning(2);
        list.insertAtEnd(5);
        list.delete(1);
        list.insert(3,1);
        list.display();
        list.find(2);
    }

}
