import java.util.Scanner;

class Test {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter Integer Value :");
        int n = obj.nextInt();
        System.out.println(-~n);
    }
}
