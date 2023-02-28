package ex2;

import java.awt.Rectangle;
//import java.awt.*; - imports the entire java.awt library

public class Main
{
    public static void main(String[] args)
    {
        /**
        Constructing Objects
         "Rectangle" object holds four numbers:
            x, y, width, height
         does not know what a rectangle is initially, so must import
         Alt+Enter for import syntax
         **/

        //java.awt.Rectangle rect1 = new java.awt.Rectangle(5, 10, 20, 30);

        //construct 4 rectangles using the "new" operator
        Rectangle rect1 = new Rectangle(5, 10, 20, 30);
        Rectangle rect2 = new Rectangle(15, 20, 30, 40);
        Rectangle rect3 = new Rectangle(10, 5, 25, 20);
        Rectangle rect4 = new Rectangle(20, 10, 25, 30);
        Rectangle rect5 = rect1;

        rect1.setLocation(100, 200);

    }
}
