import java.util.*;
class Test
{
	public static int max1(int a,int b,int c,int d)
	{
		//using else if
		if(a>b && a>c && a>d)
			return a;
		else if(b>c && b>d)
			return b;
		else if(c>d)
			return c;
		else
			return d;
	}
	public static int max2(int a,int b,int c,int d)
	{
		//conditional
		return (a>b && a>c && a>d)?a:(b>c && b>d?b:(c>d?c:d));
	}
	public static int max3(int a,int b,int c,int d)
	{
		//predefined 
		return Math.max(Math.max(a,b),Math.max(c,d));
	}
	public static int min1(int a,int b,int c,int d)
	{
		//using else if
		if(a<b && a<c && a<d)
			return a;
		else if(b<c && b<d)
			return b;
		else if(c<d)
			return c;
		else
			return d;
	}
	public static int min2(int a,int b,int c,int d)
	{
		//conditional
		return (a<b && a<c && a<d)?a:(b<c && b<d?b:(c<d?c:d));
	}
	public static int min3(int a,int b,int c,int d)
	{
		//predefined 
		return Math.min(Math.min(a,b),Math.min(c,d));
	}
	public static void main(String[] args)
	{
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter a value: ");
		int a = obj.nextInt();
		System.out.println("Enter b value: ");
		int b = obj.nextInt();
		System.out.println("Enter c value: ");
		int c = obj.nextInt();
		System.out.println("Enter d value: ");
		int d = obj.nextInt();

		System.out.println("max: "+max1(a,b,c,d)+" and min: "+min1(a,b,c,d));
		System.out.println("max: "+max2(a,b,c,d)+" and min: "+min2(a,b,c,d));
		System.out.println("max: "+max3(a,b,c,d)+" and min: "+min3(a,b,c,d));
	}
}
