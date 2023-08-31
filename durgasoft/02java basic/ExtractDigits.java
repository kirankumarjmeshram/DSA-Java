import java.util.*;
class Test
{
	public static void extract(int n)
	{
		int d;
		while(n!=0)
		{
			d=n%10;
			System.out.println(d);
			n=n/10;
		}
	}
	public static void main(String[] args)
	{
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter n value: ");
		int n = obj.nextInt();
		extract(n);
	}
}
