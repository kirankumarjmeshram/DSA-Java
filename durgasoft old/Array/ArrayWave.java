import java.util.Arrays;
import java.util.Scanner;
//print all the elements in an array in wave form
class ArrayWave {
    public static void main(String[] args) 
	{
		int a[] = {1, 2, 3, 4, 5, 6};
        int n = a.length;
		Arrays.sort(a);
		for(int i=1;i<n-1;i=i+2)
		{
			int temp = a[i];
			a[i] = a[i+1];
			a[i+1] = temp;
		}
		System.out.println(Arrays.toString(a));//[1, 3, 2, 5, 4, 6]
	}
}
