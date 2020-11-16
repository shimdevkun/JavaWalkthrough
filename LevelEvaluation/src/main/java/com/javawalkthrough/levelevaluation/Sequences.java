package com.javawalkthrough.levelevaluation;

public class Sequences
{
    public static void main( String[] args )
    {
        // TODO: Uncomment the line below when done (and comment all code above if any)
        //testMethods();
    }

    /*
    * This method prints the first 5 odd numbers using a loop.
    * Output:
    * 1
    * 3
    * 5
    * 7
    * 9
    */
    public static void printOddNumbers() {
        // TODO: Implement this method to match the description above
    }

    /*
    * This method prints the multiples of both 2 and 3
    * between 1 and 30 inclusively.
    * You must use the % (remainder) operator.
    * Output:
    * 6
    * 12
    * 18
    * 24
    * 30
    */
    public static void printMultiplesOf2And3() {
        // TODO: Implement this method to match the description above
    }


    /*
    * This method prints a line of 10 * with a loop
    * Output: **********
    */
    public static void printLine() {
        // TODO: Implement this method to match the description above
    }

    /*
     * This method prints a line with a length of 10
     * by alternating * and - with a loop
     * Output: *-*-*-*-*-
     */
    public static void printLineComplex() {
        // TODO: Implement this method to match the description above
    }

    /*
    * This method prints the following shape:
    *           ***
    *           * *
    *           ***
    */
    public static void printRectangle() {
        // TODO: Implement this method to match the description above
    }

    /*
     * This method prints a shape with n lines and n columns
     * where n is the length parameter.
     * Output for 5:
     *           *****
     *           *   *
     *           *   *
     *           *   *
     *           *****
     */
    public static void printRectangleComplex(int length) {
        // TODO: Implement this method to match the description above
    }

    /*
    * This method prints a triangle
    * Output:
    *           *
    *          ***
    *         *****
    */
    public static void printTriangle() {
        // TODO: Implement this method to match the description above
    }






    // ----------------------------------------------------
    // ---------- DO NOT MODIFY THE TEST SECTION ----------
    // ----------------------------------------------------
    //region TEST

    /*
     * This method calls all methods within the Sequences class
     */
    public static void testMethods() {
        System.out.println( "First 10 odd numbers:" );
        printOddNumbers();

        System.out.println();

        System.out.println( "First 10 multiples of 2 and 3:" );
        printMultiplesOf2And3();

        System.out.println();

        System.out.println( "Simple line:" );
        printLine();

        System.out.println();

        System.out.println( "Complex line:" );
        printLineComplex();

        System.out.println();

        System.out.println( "Default rectangle:" );
        printRectangle();

        System.out.println();

        System.out.println( "4 x 4 rectangle:" );
        printRectangleComplex(4);

        System.out.println();

        System.out.println( "10 x 10 rectangle:" );
        printRectangleComplex(10);

        System.out.println();

        System.out.println( "Default triangle:" );
        printTriangle();
    }
    //endregion
}
