import java.util.*;
class BubbleSort
{
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

		int i,j,temp;
		for(i=0;i<n;i++)
		{
			for(j=i+1;j<n;j++)
			{
				if(a[i]>a[j])
				{
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}

		System.out.println(Arrays.toString(a));
	}
}