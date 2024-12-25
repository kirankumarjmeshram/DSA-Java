import java.util.Scanner;

class Test {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter Two Integer Value: ");
        int a = obj.nextInt();
        int b = obj.nextInt();
        System.out.println("Before Swaping: a= "+a+" and b= "+b);
        a = a^b;
        b = a^b;
        a = a^b;

        System.out.println("After Swaping: a= "+a+" and b= "+b);
    }
}
