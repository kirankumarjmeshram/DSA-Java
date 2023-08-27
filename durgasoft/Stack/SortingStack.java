import java.util.Stack;

class Test{
    static void sortedInsert(Stack<Integer> ss, int value){
        int temp;
        if(ss.empty() || value>ss.peek()){
            ss.push(value);
        }else{
            temp = ss.pop();
            sortedInsert(ss, value);
            ss.push(temp);
        }
    }

    static void sortedStack(Stack<Integer> ss){
        if(!ss.empty()){
            int temp = ss.pop();
            sortedStack(ss);
            sortedInsert(ss, temp);
        }
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<Integer>();
        s.push(1);
        s.push(3);
        s.push(5);
        s.push(2);
        s.push(4);
        sortedStack(s);
        System.out.println(s);
    }
}
