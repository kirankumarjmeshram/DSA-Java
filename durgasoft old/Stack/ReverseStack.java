import java.util.Stack;

class Test {
    static void bottomInsert(Stack<Integer> ss, int value)
	{
		int temp;
		if(ss.empty())
			ss.push(value);
		else
		{
			temp = ss.pop();
			bottomInsert(ss,value);
			ss.push(temp);
		}
	}

    static void reverseStack(Stack<Integer> ss){
        if(ss.empty()){
            return;
        }else{
            int temp = ss.pop();
            reverseStack(ss);
            bottomInsert(ss, temp);
        }
    }

    public static void main(String[] args) 
	{
		Stack<Integer> s = new Stack<Integer>();

		s.push(111);
		s.push(444);
		s.push(222);
		s.push(555);
		s.push(333);
		System.out.println(s);//[111, 444, 222, 555, 333]
		reverseStack(s);
		System.out.println(s);//[333, 555, 222, 444, 111]
	}
}
