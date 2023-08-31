import java.util.Scanner;
class Test
{
	public static boolean pali1(int n)
	{
		int d,r=0,temp=n;
		while(n!=0)
		{
			d=n%10;
			r=r*10+d;
			n=n/10;
		}
		return r==temp;
	}
	public static boolean pali2(int n)
	{
		String s = Integer.toString(n);
		StringBuffer sb = new StringBuffer(s);
		sb.reverse();
		String ss = sb.toString();
		return s.equals(ss);
	}
	public static void main(String[] args)
	{
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter any number: ");
		int n = obj.nextInt();
		obj.close();

		System.out.println(pali1(n));
		System.out.println(pali2(n));
	}
}