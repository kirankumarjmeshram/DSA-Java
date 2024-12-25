import java.util.Scanner;
class Test
{
	public static int reverse1(int n)
	{
		int d,r=0;
		while(n!=0)
		{
			d=n%10;
			r=r*10+d;
			n=n/10;
		}
		return r;
	}
	public static int reverse2(int n)
	{
		String s = Integer.toString(n);
		StringBuffer sb = new StringBuffer(s);
		sb.reverse();
		String ss = sb.toString();
		return Integer.parseInt(ss);
	}
	public static void main(String[] args)
	{
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter any number: ");
		int n = obj.nextInt();

		System.out.println(reverse1(n));
		System.out.println(reverse2(n));
	}
}
