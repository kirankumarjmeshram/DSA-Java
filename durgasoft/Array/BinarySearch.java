class BinarySearch {
    public static void main(String[] args) 
	{
		int a[] = {2,4,6,7,8};
        int n = a.length; 
		int index=-1,key;
		key = 6;

		int low,high,mid;
		low = 0;
		high = n-1;
		while(low<=high)
		{
			mid = (low+high)/2;
			if(a[mid]==key)
			{
				index = mid;
				break;
			}
			else if(key<a[mid])
				high = mid-1;
			else
				low = mid+1;
		}
		

		System.out.println(index);//2
	}
}
