import java.util.*;
class Test
{
	public static int fact1(int n)
	{
		int i,p=1;
		for(i=1;i<=n;i++)
			p=p*i;
		return p;
	}
	public static int fact2(int n)
	{
		if(n==0)
			return 1;
		return n*fact2(n-1);
	}
	public static void main(String[] args)
	{
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter n value: ");
		int n = obj.nextInt();

		System.out.println(fact1(n));
		System.out.println(fact2(n));
	}
}