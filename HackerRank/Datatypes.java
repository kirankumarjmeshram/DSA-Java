/*
 * Java has 8 primitive data types; char, boolean, byte, short, int, long, float, and double. For this exercise, we'll work with the primitives used to hold integer values (byte, short, int, and long):

A byte is an 8-bit signed integer.
A short is a 16-bit signed integer.
An int is a 32-bit signed integer.
A long is a 64-bit signed integer.
Given an input integer, you must determine which primitive data types are capable of properly storing that input.

To get you started, a portion of the solution is provided for you in the editor.
 */
public class Datatypes {
    public static void main(String []argh)
    {
       Scanner scanner = new Scanner(System.in);
    int T = scanner.nextInt();

    scanner.nextLine();

    List<String> inputNumbers = new ArrayList<>();

    String solution = "";

    for (int i = 0; i < T; i++) {
        String input = scanner.nextLine();
        inputNumbers.add(input);
    }

    scanner.close();

    for (String numAsString : inputNumbers) {

        try {
            long number = Long.parseLong(numAsString);
            boolean isLong = number >= -(Math.pow(2, 63)) && (number <= (Math.pow(2, 63) - 1));

            if (isLong) {
                solution = number + " can be fitted in:\n";

                if (number >= Byte.MIN_VALUE && number <= Byte.MAX_VALUE) {
                    solution += "* byte\n";
                }

                if (number >= Short.MIN_VALUE && number <= Short.MAX_VALUE) {
                    solution += "* short\n";
                }

                if (number >= Integer.MIN_VALUE && number <= Integer.MAX_VALUE) {
                    solution += "* int\n";
                }

                solution += "* long";
            }
        } catch (Exception e) {
            solution = numAsString + " can't be fitted anywhere.";
        }

        System.out.println(solution);
    }
  }
}
