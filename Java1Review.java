/**
 * Implement each of the 10 methods tested in JUnitTests.java. Study the tests
 * to determine how the methods should work.
 */
public class Java1Review {

    public static void main(String[] args) {
        // If you want to write your own tests, do so here. (Do not modify
        // JUnitTests.java.) To run this method in Eclipse, right-click
        // Java1Review.java in the Package Explorer and select "Run As" >
        // "Java Application" from the context menu.
    }
    public static double divide(double num, double num2) {
        double quotient = num / num2;
        return quotient;
    }
    public static boolean isDivisibleBy7(int num) {
        boolean answer;
        if ((num % 7) == 0) {
           answer = true;
        }
        else {
            answer = false;
        }
        return answer;
    }
    public static int findMin(int num, int num2, int num3){
       int lowest;
        if (num < num2 && num < num3) {
            lowest = num;
        }
        else if (num2 < num && num2 < num3) {
            lowest = num2;
        }
        else {
            lowest = num3;
        }
        return lowest;
    }
    public static int findMin(int[] numArray) {
        int num = 0;
        for (i = 0; i < numArray.length; i++) {
            if (numArray[i] < num) {
                num = numArray[i];
            }
        }
        return num;
    }
    public static double average(int[] numArray) {
        int sum = 0;
        for (i = 0; i < numArray.length; i++) {
            sum += numArray[i];
        }
        double average = (double)sum/ (double)numArray.length;
        return average;
    }
    public static void toLowerCase(String[] array) {
        String[] lowerCase = array;
        for (int i = 0; i < lowerCase.length; i++) {
            String a = lowerCase[i];
            lowerCase[i] = a.toLowerCase();
        }
        array = lowerCase;

    }
    public static String[] toLowerCaseCopy(String[] array) {
        return array; //it said unchanged, so its unchanged
    }


}