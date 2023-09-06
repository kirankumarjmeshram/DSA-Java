import java.util.Scanner;
class SumDiagonal {
    public static void main(String[] args) 
	{
		Scanner obj = new Scanner(System.in);
		int[][] a = new int[3][3];

		int i,j;
		System.out.println("Enter matrix elements: ");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				a[i][j] = obj.nextInt();
			}
		}

		System.out.print("MATRIX ELEMENTS:");
		for(i=0; i<3;i++){
            for(j=0; j<3;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        
        System.out.print("SUM OF DIAGONAL: ");
        int sum =0;
		for(i=0; i<3;i++){
            sum+=a[i][i];
        }
        System.out.print(sum);

        System.out.println();

        System.out.print("SUM OF OPPOSITE DIAGONAL: ");
        sum =0;
		for(i=0; i<3;i++){
            sum+=a[i][3-i-1];
        }
        System.out.print(sum);
	}
}
