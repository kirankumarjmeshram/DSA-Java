/**
 * StackArray
 */
public class StackArray {
    int size;
    int[] data;
    int top;
    StackArray(){
        size = 5;
        data = new int[size];
        top = -1;
    }

    int getSize(){
        return top + 1;
    }

    boolean isEmpty(){
        return top == -1;
    }

    void print(){
        if(isEmpty()){
            System.out.println("Stack is underflow");
            return;
        }
        for(int i=0;i<=top;i++){
            System.out.println(data[i]+" ");
        }
        System.out.println();
    }

    void push(int value){
        if(getSize()== data.length){
            System.out.println("Stack Overflow");
            return;
        }
        top++;
        data[top] = value;
    }

    int pop(){
        if(isEmpty()){
            System.out.println("Stack Underflow");
            return -1;
        }
        return data[top--];
    }

    boolean search(int value){
        if(isEmpty()){
            System.out.println("Stack Underflow");
            return false;
        }
        for(int i=0;i<=top;i++){
            if(value == data[i])
                return true;
        }
        return false;
    }
}

class Test
{
    public static void main(String[] args) {
        StackArray s = new StackArray();
        s.push(111);
        s.push(222);
        s.push(333);
		s.push(444);
        s.print();
        System.out.println(s.getSize());
        System.out.println(s.pop());//444
		s.print();
        System.out.println(s.search(333));//true
		System.out.println(s.search(999));//false
		s.push(555);
		s.push(666);
		s.push(777);
		s.print();
    }
}