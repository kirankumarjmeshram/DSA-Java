import java.util.Scanner;

class Test
{
    public static void swap1(int x, int y) {
        System.out.println("before swaping a: "+x+" and b: "+y);
        int temp = x;
        x = y;
        y = temp;
        System.out.println("after  swaping a: "+x+" and b: "+y);

    }
    public static void swap2(int x, int y){
        System.out.println("before swaping a: "+x+" and b: "+y);
        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println("after  swaping a: "+x+" and b: "+y);

    }
    public static void swap3(int x, int y){
        System.out.println("before swaping a: "+x+" and b: "+y);
        x = x * y;
        y = x / y;
        x = x / y;
        System.out.println("after  swaping a: "+x+" and b: "+y);
    }
    public static void swap4(int x,int y)
	{
		System.out.println("before swaping a: "+x+" and b: "+y);
		//logic
		x = x ^ y;
		y = x ^ y;
		x = x ^ y;
		System.out.println("after  swaping a: "+x+" and b: "+y);
	}
    public static void swap5(int x,int y)
	{
		System.out.println("before swaping a: "+x+" and b: "+y);
		//logic
		x = x+y-(y=x);
		System.out.println("after  swaping a: "+x+" and b: "+y);
	}

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a value: ");
        int a = obj.nextInt();
        System.out.println("Enter b value: ");
        int b = obj.nextInt();
        swap1(a,b);
    }
}