class StackLL{
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
        return this.size == 0;
    }

    void print(){
		if(isEmpty()){
			System.out.println("stack under flow");
			return;
		}
		Node temp = head;
		while(temp!=null){
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
		System.out.println();
	}

    void push(int data){
        head = new Node(data, head);
    }

    int peek(){
        if(isEmpty()){
            return -1;
        }
        return head.data;
    }

    int pop(){
        if(isEmpty()){
            return -1;
        }
        int temp = head.data;
        head = head.next;
        return temp;
    }

    boolean search(int data){
		if(isEmpty())
			return false;
		Node temp = head;
		while(temp!=null)
		{
			if(temp.data==data)
				return true;
			temp = temp.next;
		}
		return false;
	}

    public String toString()
    {
        StringBuffer sb = new StringBuffer();
        Node temp = head;
        sb.append("[");
        while(temp != null){
            if(temp.next != null)
                sb.append(temp.data+" ");
            else
                sb.append(temp.data);
            temp = temp.next;
        }
        sb.append("]");
        return sb.toString();
    }

}


class Test 
{
	public static void main(String[] args) 
	{
		StackLL s = new StackLL();
		s.push(111);
		s.push(222);
		s.push(333);
		s.push(444);
		s.print();

		System.out.println(s);
	}
}
