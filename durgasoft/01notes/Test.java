import java.util.*;
class Test {
    public static void main(String[] args) {
        Object[] mixedArray = new Object[5];
        mixedArray[0] = 42;       // Integer
        mixedArray[1] = "hello";  // String
        mixedArray[2] = 3.14;     // Double

        for (Object element : mixedArray) {
            System.out.print(element+" "); //42 hello 3.14 null null 
        }
        System.out.println();
        ArrayList<Object> mixedList = new ArrayList<>();
            mixedList.add(42);        // Integer
            mixedList.add("hello");   // String
            mixedList.add(3.14);      // Double

            System.out.println(mixedList); //[42, hello, 3.14]
    }
}
