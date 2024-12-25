import java.util.*;
class Test
{
	public static int max1(int a,int b)
	{
		//using if else
		if(a>b)
			return a;
		else
			return b;
	}
	public static int max2(int a,int b)
	{
		//conditional
		return (a>b)?a:b;
	}
	public static int max3(int a,int b)
	{
		//predefined 
		return Math.max(a,b);
	}
	public static int min1(int a,int b)
	{
		//using if else
		if(a<b)
			return a;
		else
			return b;
	}
	public static int min2(int a,int b)
	{
		//conditional
		return (a<b)?a:b;
	}
	public static int min3(int a,int b)
	{
		//predefined 
		return Math.min(a,b);
	}
	public static void main(String[] args)
	{
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter a value: ");
		int a = obj.nextInt();
		System.out.println("Enter b value: ");
		int b = obj.nextInt();
        obj.close();

		System.out.println("max: "+max1(a,b)+" and min: "+min1(a,b));
		System.out.println("max: "+max2(a,b)+" and min: "+min2(a,b));
		System.out.println("max: "+max3(a,b)+" and min: "+min3(a,b));
	}
}
