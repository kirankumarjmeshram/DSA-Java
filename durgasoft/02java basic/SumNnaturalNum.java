import java.util.*;
class Test
{
	public static int sumofn1(int n) //O(n)
	{
		int i,s=0;
		for(i=0;i<=n;i++)
			s=s+i;
		return s;
	}
	public static int sumofn2(int n)
	{
		if(n==0)
			return 0;
		return n+sumofn2(n-1);
	}
	public static int sumofn3(int n)//O(1)
	{
		return n*(n+1)/2;
	}
	public static void main(String[] args)
	{
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter n value: ");
		int n = obj.nextInt();

		System.out.println(sumofn1(n));
		System.out.println(sumofn2(n));
		System.out.println(sumofn3(n));
	}
}
