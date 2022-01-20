public class TestArray {
    public static void main(String[] args) {
        int arr[] ={10,20,30,40,50};
        //transversing array
        for(int i=0;i<arr.length;i++){
            //System.out.println(arr[i]);//print line by line

            System.out.print(arr[i]+" ");//10 20 30 40 50

        }
         System.out.println();
        //Average calculation
        float sum=0, avg;
        for(int i=0;i<arr.length;i++)
        sum= sum+arr[i];

        avg = sum/arr.length;

        System.out.println("Average = " + avg);//Average = 30.0
    }
}
