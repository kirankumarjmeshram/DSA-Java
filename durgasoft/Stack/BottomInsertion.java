import java.util.Stack;

class Test {
    static void bottomInsert(Stack<Integer> ss, int value){
        int temp;
        if(ss.empty()){
            ss.push(value);
        }else{
            temp = ss.pop();
            bottomInsert(ss, value);
            ss.push(temp);
        }
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<Integer>();
        s.push(111);
        s.push(222);
        s.push(333);
        bottomInsert(s, 555); //[555, 111, 222, 333]
        System.out.println(s);
    }
}
