import java.util.*;
class Test
{
	public static boolean prime1(int n)
	{
		int i,f=0;
		for(i=1;i<=n;i++)
		{
			if(n%i==0)
				f++;
		}
		return f==2;
	}
	public static boolean prime2(int n,int i)
	{
		if(i==1)
			return true;
		if(n%i==0)
			return false;
		return prime2(n,i-1);
	}
	public static void main(String[] args)
	{
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter n value: ");
		int n = obj.nextInt();

		System.out.println(prime1(n));
		System.out.println(prime2(n,n/2));
	}
}
