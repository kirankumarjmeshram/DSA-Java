import java.util.*;
class Test
{
	public static int max1(int a,int b,int c)
	{
		//using else if
		if(a>b && a>c)
			return a;
		else if(b>c)
			return b;
		else
			return c;
	}
	public static int max2(int a,int b,int c)
	{
		//conditional
		return (a>b && a>c)?a:(b>c?b:c);
	}
	public static int max3(int a,int b,int c)
	{
		//predefined 
		return Math.max(Math.max(a,b),c);
	}
	public static int min1(int a,int b,int c)
	{
		//using else if
		if(a<b && a<c)
			return a;
		else if(b<c)
			return b;
		else
			return c;
	}
	public static int min2(int a,int b,int c)
	{
		//conditional
		return (a<b && a<c)?a:(b<c?b:c);
	}
	public static int min3(int a,int b,int c)
	{
		//predefined 
		return Math.min(Math.min(a,b),c);
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

		System.out.println("max: "+max1(a,b,c)+" and min: "+min1(a,b,c));
		System.out.println("max: "+max2(a,b,c)+" and min: "+min2(a,b,c));
		System.out.println("max: "+max3(a,b,c)+" and min: "+min3(a,b,c));
	}
}
