// implementation of stack by using linked list.
public class StackLL {
    class Node
    {
        int data;
        Node next;
        Node(int data, Node next){
            this.data = data;
            this.next = next;
            size++;
        }
    }
    Node head;
    int size;
    StackLL(){
        head = null;
        size = 0;
    }

    int getSize(){
        return this.size;
    }

    boolean isEmpty(){
        return this.size==0;
    }

    void print(){
        if(isEmpty()){
            System.out.println("Stack underflow");
        }
        Node curr = head;
        while(curr!= null){
            System.out.print(curr.data +" ");
            curr = curr.next;
        }

        System.out.println();
    }

    void push(int data){
        head = new Node(data, head);
    }

    int peak(){
        if(isEmpty()){
            return -1;
        }
        return head.data;
    }

    int pop(){
        if(isEmpty())
            return -1;
        int temp = head.data;
        head = head.next;
        return temp;
    }

    boolean search(int data){
        if(isEmpty())
            return false;
        Node temp = head;
        while(temp != null){
            if(temp.data == data)
                return true;
            temp = temp.next;
        }
        return false;
    }
}

class Test
{
    public static void main(String[] args) {
        StackLL s = new StackLL();
        System.out.println(s.isEmpty());
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        s.push(60);
        s.print();
        System.out.println(s.pop());
        System.out.println(s.search(30));
        System.out.println(s.search(35));
        System.out.println(s.peak());
        s.print();
    }
}