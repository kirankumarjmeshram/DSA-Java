import java.util.Arrays;
import java.util.Scanner;

class SortAll {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int a[][] = new int[3][3];
        System.out.println("Add number: ");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                a[i][j] = obj.nextInt();
            }
        }
        System.out.println("Matrix Elements ");

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        int k=0;
        int[] b = new int[9];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                b[k]=a[i][j];
                k++;
            }
        }
        Arrays.sort(b);
        System.out.println(Arrays.toString(b));
        k=0;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                a[i][j] = b[k];
                System.out.print(a[i][j]+" ");
                k++;
            }
            System.out.println();
        }
    }
}
