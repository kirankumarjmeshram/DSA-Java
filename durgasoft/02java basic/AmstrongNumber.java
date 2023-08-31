class Test  {
        // int a = 234;
        // String s ="1221";
        // int len = String.valueOf(a).length();
        // int n = Integer.valueOf(s);
        // System.out.println(n);
        // System.out.println(len);

        public static boolean armstrong(int n)
	{
		int temp=n,s=0,d;
		while(n!=0)
		{
			d=n%10;
			s=s+(d*d*d);
			n=n/10;
		}
		return temp==s;
	}
	public static void main(String[] args) 
	{
		System.out.println(armstrong(123));//false
		System.out.println(armstrong(153));//true	
		System.out.println(armstrong(370));//true
		System.out.println(armstrong(407));//true			
	}
    
}
