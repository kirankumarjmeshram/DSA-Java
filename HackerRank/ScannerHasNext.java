/*
 * The challenge here is to read  lines of input until you reach EOF, then number and print all  lines of content.

Hint: Java's Scanner.hasNext() method is helpful for this problem.
 */
public class ScannerHasNext {
    Scanner sc = new Scanner(System.in);
        int i = 1;
        while(sc.hasNext()) {
            System.out.println(i + " " + sc.nextLine());
            i++;
        }
}
