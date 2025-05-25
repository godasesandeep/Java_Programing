class SinglyLL //409 ,410,411 is same program different approach
{
    public static void main(String arg[])
    {
        LinkedList obj =new LinkedList(); // LinkedList obj incase of c++
        obj.insertFirst(51);
        obj.insertFirst(21);
        obj.insertFirst(11);

        obj.insertLast(101);
        obj.insertLast(111);
        obj.insertLast(121);

        obj.insertAtPos(105,5);
        obj.deleteAtPos(2);

        //obj.deleteFirst();


        System.out.println("Number of element : "+obj.count());

        obj.display();
    }
}

class node 
{
    public int data;
    public node next;

    public node(int value)
    {
        data=value;
        next = null;
    }
}

/*

struct node 
{
    int data;
    struct node * next;
}

*/

class LinkedList
{
    public node first;
    public int iCount;

    public LinkedList()
    {
        System.out.println("Object of Linked list Created");
        first=null;
        iCount=0;
    }

    public void insertFirst(int no)
    {
        node newNode =null;
        newNode =new node(no);

        if(first==null)
        {
            first=newNode;
        }
        else
        {
            newNode.next=first;
            first=newNode;
        }
        iCount++;
    }
    
    public void display()
    {
        System.out.println("Elements are : ");
        node temp =first;

        while(temp !=null)
        {
            System.out.print(" |"+temp.data +" |->");
            temp=temp.next;
        }
        System.out.println("null");
    }

    public void insertLast(int no)
    {
        node newNode =null;
        newNode =new node(no);

        if(first==null)
        {
            first=newNode;
        }
        else
        {
            node temp =null;
            temp= first;
            while(temp.next!=null)
            {
                temp=temp.next;
            }
            temp.next=newNode;
        }
        iCount++;
    }

    public int count()
    {
        return iCount;
    }

    public void deleteFirst()
    {
        if(first==null)
        {
            System.out.println("link list is empty");
            return;
        }
        else
        {
            first=first.next;
        }
        iCount--;
    }

    public void deleteLast()
    {
        if(first==null)
        {
            System.out.println("link list is empty");
            return;
        }
        else if(first.next==null) //single node only
        {
            first=null;
        }
        else
        {
            node temp=null;
            temp=first;
            while(temp.next.next !=null) //if single node then it throw error so above else if necessary
            {
                temp=temp.next;
            }
            temp.next=null;
        }
        iCount--;
    }

    public void insertAtPos(int no, int pos)
    {
        if(pos<1||pos>iCount+1)
        {
            System.out.println("Invalid position");
            return;
        }
        if(pos==1)
        {
            insertFirst(no);
        }
        else if(pos==iCount+1)
        {
            insertLast(no);

        }
        else
        {
            int i=0;
            node temp = first;
            node newNode = new node(no);
            for(i=1;i<pos-1;i++)
            {
                temp=temp.next;
            }
            newNode.next=temp.next;
            temp.next = newNode;
            iCount++;
        }
    }

    public void deleteAtPos(int pos)
    {
        if(pos<1||pos>iCount)
        {
            System.out.println("Invalid position");
            return;
        }
        if(pos==1)
        {
            deleteFirst();
        }
        else if(pos==iCount+1)
        {
            deleteLast();

        }
        else
        {
            int i=0;
            node temp = first;
            for(i=1;i<pos-1;i++)
            {
                temp=temp.next;
            }
            temp.next = temp.next.next;
            iCount--;
        }
    }
}

/*

class LinkedList
{
    struct node * first;
    int iCount;
}
*/