import java.util.Arrays;
import java.util.Scanner;

class SortRows {
    public static void main(String[] args) 
	{
		Scanner obj = new Scanner(System.in);

		int[][] a = new int[3][3];
		int i,j;

		System.out.println("Enter matrix  elements: ");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				a[i][j] = obj.nextInt();
			}
		}

		for(i=0;i<3;i++)
		{
			Arrays.sort(a[i]);
		}

		System.out.println("updated matrix: ");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
}
