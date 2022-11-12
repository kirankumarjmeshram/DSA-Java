package String;

public class ReverseString {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        boolean a = true;
        int len = A.length();
        for(int i=0;i<len/2;i++){
          if(A.charAt(i) != A.charAt(len-i-1)){
            a=false;
          }
        }
        if(a){
          System.out.println("Yes");
        }else{
          System.out.println("No");
        }
        
    }
}
