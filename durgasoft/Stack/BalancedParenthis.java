import java.util.*;
class Test {
    static boolean isBalanceParenthis(String s)
    {
        Stack <Character> ss = new Stack<Character>();
        for(char ch:s.toCharArray())
        {
            switch(ch)
            {
                case '(' :
                case '[' :
                case '{' : ss.push(ch); break;
                case ')' : if(ss.pop()!= '(')
                                return false;
                            break;
                case ']' : if(ss.pop() != '[')
                                return false;
                            break;
                case '}' : if(ss.pop() != '{')
                                return false;
                            break;
            }
        }
        return ss.empty();
    }

    public static void main(String[] args) 
	{
		System.out.println(isBalanceParenthis("()"));//true
		System.out.println(isBalanceParenthis("[]"));//true
		System.out.println(isBalanceParenthis("{}"));//true
		System.out.println(isBalanceParenthis("(())"));//true
		System.out.println(isBalanceParenthis("([})"));//false
		System.out.println(isBalanceParenthis("([{}])"));//true
		System.out.println(isBalanceParenthis("([{]})"));//false
	}
}
