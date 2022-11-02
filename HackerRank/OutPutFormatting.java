import java.util.Scanner;

public class OutPutFormatting {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String s1=sc.next();
                int x=sc.nextInt();
                int n = s1.length();
                int leftSpace = 15-n;
                //String spaces = ' ';
                for(int j=0;j<leftSpace;j++){
                    s1+=' ';
                }
                
                
                //Complete this line
                if(x>=100){
                    System.out.println(s1+x);
                }else if(x>=10){
                    System.out.println(s1+'0'+x);
                }else{
                    System.out.println(s1+'0'+'0'+x);
                }
                //System.out.println(s1+' '+x);
            }
            System.out.println("================================");

    }
}
