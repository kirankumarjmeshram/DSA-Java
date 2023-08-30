import java.util.Scanner;

class Test {
    public static String upperToLower(String s){
        String ns = "";
        for (int i = 0; i < s.length(); i++) {
            ns+= (char)(s.charAt(i)|32);
        }
        return ns;
    }
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter any String :");
        String s = obj.nextLine();
        obj.close();
        System.out.println(upperToLower(s));
    }
}
