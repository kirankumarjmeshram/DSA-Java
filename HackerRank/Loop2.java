/*
 * We use the integers , , and  to create the following series:
  You are given  queries in the form of , , and . 
  For each query, print the series corresponding to the 
  given , , and  values as a single line of  space-separated integers.
 */

public class Loop2 {
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
        
        for(int j = 0; j<n; j++ ){

        a += (int)( Math.pow(2,j)*b);
          System.out.print(a);
          System.out.print(" ");
          }       
          System.out.println();
        }
        in.close();
    }
}
