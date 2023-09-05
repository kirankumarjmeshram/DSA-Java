import java.util.Arrays;
import java.util.Scanner;
//sum of elements which are ending with 3
public class Sum {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n = obj.nextInt();
        int a[] = new int[n];
        System.out.println("Enter "+n+"elements: ");
        for (int i = 0; i < n; i++) {
            a[i] = obj.nextInt();
        }
        System.out.println(Arrays.toString(a));

        int sum = 0;
        for (int i : a) {
            if(i%10 == 3){
                sum = sum+i;
            }
        }
        System.out.println(sum);
    }
}
