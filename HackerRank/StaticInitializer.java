public class StaticInitializer {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
   Scanner sc = new Scanner(System.in);
    int B = sc.nextInt();
    int H = sc.nextInt();
    area(B,H);
}
static void area(int a,int b)
{
    if(a>=0 && a<100 && b>=0 && b<100)
    {
        int Area = a*b;
        System.out.println(Area);
    }
    else
    {
        System.out.println("java.lang.Exception: Breadth and height must be positive"); 
    }
}
}
