import java.util.*;
class Test
{
	public static String method1(int n)
	{
		if(n%2==0)
			return "even";
		return "odd";
	}
	public static String method2(int n)
	{
		if((n&1)==0)
			return "even";
		return "odd";
	}
	public static void main(String[] args)
	{
		Scanner obj = new Scanner(System.in);

		for(int i=0;i<=10;i++)
			System.out.println(i+"\t"+method1(i)+"\t"+method2(i));
	}
}
