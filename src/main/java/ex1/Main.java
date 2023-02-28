package ex1;

import java.net.SocketOption;
import java.util.SortedMap;

public class Main //class
{
    public static void main(String[] args) //signature of the method
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

        //length() method
        //int gets the number of characters in the "greeting" variable
        String greeting2 = "Hello, World!";
        int numberOfCharacters = greeting2.length();

        //toUpperCase method
        //creates a new String reading: "MISSISSIPPI" - two separate strings
        String river = "Mississippi";
        String bigRiver = river.toUpperCase();

        System.out.println(greeting2.length());

        //replace method
        river = river.replace("issipp", "our");
        System.out.println(river);
        //river is now "Missouri"

        System.out.println(river.replace("issipp", "our"));
        //river is still "Mississippi"



    }
    private static int add(int x, int y) //creating a method
    {
        int sum = x + y;
        return sum;
    }


}
