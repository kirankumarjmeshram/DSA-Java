//123 ----> 1! + 2! + 3! = 1 + 2 + 6 = 9  false
//145 ----> 1! + 4! + 5! = 1 + 24 + 120 = 145  true
class Test
{
	public static int fact(int n)
	{
		if(n==0)
			return 1;
		return n*fact(n-1);
	}
	public static boolean strong(int n)
	{
		int temp=n,s=0,d;
		while(n!=0)
		{
			d=n%10;
			s=s+fact(d);
			n=n/10;
		}
		return temp==s;
	}
	public static void main(String[] args) 
	{
		System.out.println(strong(123));//false
		System.out.println(strong(145));//true	
        
	}
}