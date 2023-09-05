import java.util.Arrays;
import java.util.Scanner;

class SplitArray {
    public static void main(String[] args) 
	{
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter size of array: ");
		int i,n = obj.nextInt();

		int a[] = new int[n];
		System.out.println("Enter "+n+" elements: ");
		for(i=0;i<n;i++)
			a[i] = obj.nextInt();

		System.out.println(Arrays.toString(a));
		System.out.println("Enter the location to split: ");
		int location = obj.nextInt();
		int b[] = new int[location];
		int c[] = new int[n-location];
		int k=0;
		for(i=0;i<location;i++)
			b[k++] = a[i];
		k=0;
		for(i=location;i<n;i++)
			c[k++] = a[i];

		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		System.out.println(Arrays.toString(c));
        /*
         * Enter size of array: 
                7
                Enter 7 elements: 
                88
                66
                55
                44
                99
                11
                22
                [88, 66, 55, 44, 99, 11, 22]
                Enter the location to split:
                5
                [88, 66, 55, 44, 99, 11, 22]
                [88, 66, 55, 44, 99]
                [11, 22]
         */
	}
}
