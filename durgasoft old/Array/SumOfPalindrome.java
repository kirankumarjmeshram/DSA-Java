import java.util.Arrays;
import java.util.Scanner;

class SumOfPalindrome {
    static boolean pali(int n)
	{
		int temp,r=0,d;
		temp = n;
		while(n!=0)
		{
			d=n%10;
			r=r*10+d;
			n=n/10;
		}
		return temp==r;
	}
	public static void main(String[] args) 
	{
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter size of array: ");
		int n = obj.nextInt();

		int a[] = new int[n];
		System.out.println("Enter "+n+" elements: ");
		for(int i=0;i<n;i++)
			a[i] = obj.nextInt();

		System.out.println(Arrays.toString(a));

		int sum=0;
		for(int item:a)
		{
			if(pali(item))
			{
				sum=sum+item;
			}
		}
		System.out.println(sum);
	}
}
