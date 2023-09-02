package durgasoft.Array;

class BasicArray {
    public static void main(String[] args) {
        int[] a ={11, 22, 33};
        System.out.println(a[0]); //11
		System.out.println(a[1]); //22
		System.out.println(a[2]); //33

		//System.out.println(a[-8]);//AIOBE : ArrayIndexOutOfBoundsException

        // length of an array
        int[] b= new int[10];
        int[] c = new int[1];
		int[] d = new int[0];

        System.out.println(b.length);//10
        System.out.println(c.length);//1
		System.out.println(d.length);//0

        //forEach
        for(int item:a)
		{
			System.out.println(item);
		}

    }
}
