package ex1;

public class Main //class
{
    public static void main(String[] args) //method
    {
        //bits describe the size of the CPU's data bus

        int piI = 3;
        double piD = 3.14;
        float piF = 3.14f;

        /**
        * typeName variableName = value;
        *             OR
        * typeName variableName;
         */

        String greeting = "Hello, Dave";

        String name = "Matt "+"Allan "+"was born in "+ 2005;
            //number (2005) is converted into a string by the compiler

        //typing "so" and pressing TAB is the shortcut for System.out.println();

        /**
         * camel case
         * cannot name a variable as a variable type
         * e.g. double int = 1.1;
         * cannot start the name of a variable with a number
         */

        //commit: saves repository changes  on local
        //push: updates git commit changes and sends it to remote repo (GitHub)

        double unitPrice = 1.95;
        int quantity = 2;

        System.out.print("Total price: ");
        System.out.println(unitPrice * quantity);

        /**
         * calling methods:
         */

        int sum = add(12,5);

    }
    private static int add(int x, int y)
    {
        int sum = x + y;
        return sum;
    }
}
