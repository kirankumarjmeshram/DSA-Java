import java.util.Arrays;
import java.util.Scanner;

class SumOfPrime {
    public static boolean prime(int n){
        if(n==1)
            return false;
        for(int i=2;i<n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
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
			if(prime(item))
			{
				sum=sum+item;
			}
		}
		System.out.println(sum);
	}
    
}
