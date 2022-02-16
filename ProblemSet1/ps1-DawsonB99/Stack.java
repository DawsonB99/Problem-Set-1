/**
 * Implements a generic stack.  
 * 
 * @author Dawson Bridger
 * @version Fall 2019
 */
public class Stack<E> implements StackInterface<E>
{
    private class Node<E>
    {
        private E value;
        private Node<E> next;

        public Node(E value, Node<E> next)
        {
            this.value = value;
            this.next = next;
        }
    }

    private Node<E> head;

    public Stack()
    {
        head = null;
    }

    //add the required methods here
    public void push (E element)
    {
        Node<E> newNode = new Node<E>(element, head);
        head = newNode;
    }

    public E pop ()
    {
        Node<E> removedNode = head;
        head = head.next;
        return removedNode.value;
    }

    public E peek()
    {
        if(head == null)
        {
            return null;
        }
        else
        {
            return head.value;
        }
    }

    public boolean isEmpty()
    {
        if(head == null)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public void clear()
    {
        head = null;
    }

    public int search (Object obj)
    {
        Node<E> finger = head;
        int index = 1;
        boolean isFound = false;
        while (finger != null && !isFound)
        {
            if(finger.value.equals(obj))
            {
                isFound = true;
            }
            else
            {
                finger = finger.next;
                index++;
            }
        }
        if(!isFound)
        {
            index = -1;
        }
        return index;
    }

    public String toString()
    {
        String str = "";
        Node<E> finger = head;
        while(finger != null)
        {
            str = str + " " + finger.value;
            finger = finger.next;
        }
        if(str.length() > 0)
        {
            str = str.substring(1);
        }
        return str;
    }

}
