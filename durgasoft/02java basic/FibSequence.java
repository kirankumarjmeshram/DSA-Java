import java.util.*;
class Test
{
	public static ArrayList<Integer> fib(int n)
	{
		ArrayList<Integer> list = new ArrayList<>();
		int a,b,c,i;
		a=0;
		b=1;
		list.add(a);
		list.add(b);
		for(i=2;i<n;i++)
		{
			c=a+b;
			list.add(c);
			a=b;
			b=c;
		}
		return list;
	}
	public static void main(String[] args) 
	{
		System.out.println(fib(7));//[0, 1, 1, 2, 3, 5, 8]
	}
}