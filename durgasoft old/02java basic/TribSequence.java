import java.util.*;
class Test
{
	public static ArrayList<Integer> trib(int n)
	{
		ArrayList<Integer> list = new ArrayList<>();
		int a,b,c,d,i;
		a=0;
		b=1;
		c=2;
		list.add(a);
		list.add(b);
		list.add(c);
		for(i=3;i<n;i++)
		{
			d=a+b+c;
			list.add(d);
			a=b;
			b=c;
			c=d;
		}
		return list;
	}
	public static void main(String[] args) 
	{
		System.out.println(trib(7));//[0, 1, 2, 3, 6, 11, 20]
	}
}