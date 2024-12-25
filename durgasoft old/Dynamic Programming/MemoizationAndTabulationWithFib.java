class Test
{
	static int c1 = 0;
	public static int fib1(int n)
	{
		c1++;
		if(n==0 || n==1)
			return n;
		return fib1(n-1)+fib1(n-2);
	}
	static int c2 = 0;
	//memoization
	public static int fib2(int n,int[] f)
	{
		c2++;
		if(n==0 || n==1)
			return n;
		if(f[n]!=0)
			return f[n];
		f[n] = fib2(n-1,f)+fib2(n-2,f);
		return f[n];
	}
	public static int fib3(int n){
		//tabulation
		//we will create an array to store all the results
		//we are not using any recursion
		int dp[] = new int[n+1];
		dp[0] = 0;
		dp[1] = 1;
		for(int i=2;i<=n;i++){
			dp[i] = dp[i-1]+dp[i-2];
		}
		return dp[n];
	}
	public static void main(String[] args)
	{
		int n = 5;
		//0 1 1 2 3 5 8  - - - - 
		System.out.println(fib1(n));//5
		System.out.println("Number of calls: "+c1);//15
		int[] f = new int[n+1];
		System.out.println(fib2(n,f));//5
		System.out.println("Number of calls: "+c2);//15
		System.out.println(fib3(n));//5
	}
}