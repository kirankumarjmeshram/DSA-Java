class Test
{
	static boolean prime1(int n)
	{
		int factors = 0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
				factors++;
		}
		return factors==2;
	}
	static boolean prime2(int n)
	{
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
				return false;
		}
		return true;
	}
	static boolean prime3(int n,int i)
	{
		if(i==1)
			return true;
		if(n%i==0)
			return false;
		return prime3(n,i-1);
	}
	public static void main(String[] args)
	{
		for(int i=2;i<=10;i++)
			System.out.println(i+"\t"+prime1(i)+"\t"+prime2(i)+"\t"+prime3(i,i/2));
	}
}