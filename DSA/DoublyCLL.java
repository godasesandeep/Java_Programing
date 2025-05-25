class DoublyCLL //program417 refer
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
    public node prev;

    public node(int value)
    {
        data=value;
        next = null;
        prev = null;
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
    public node last;
    public int iCount;

    public LinkedList()
    {
        System.out.println("Object of Linked list Created");
        first=null;
        last = null;
        iCount=0;
    }

    public void insertFirst(int no)
    {
        node newNode = null;
        newNode =new node(no);

        if(first == null && last == null)
        {
            first = newNode;
            last = newNode
        }
        else
        {

        }
        last.next =first;
        first.prev = last;
        iCount++;

    }
    
    public void display()
    {
        
    }

    public void insertLast(int no)
    {
        node newNode = null;
        newNode =new node(no);

        if(first == null && last == null)
        {
            first = newNode;
            last = newNode
        }
        else
        {
            last.next = newNode;
            newNode =
        }
        last.next =first;
        first.prev = last;
        iCount++;
        
    }

    public int count()
    {
        return iCount;
    }

    public void deleteFirst()
    {
        
    }

    public void deleteLast()
    {
       
    }

    public void insertAtPos(int no, int pos)
    {
        
    }

    public void deleteAtPos(int pos)
    {
        
    }
}

/*

class LinkedList
{
    struct node * first;
    int iCount;
}
*/