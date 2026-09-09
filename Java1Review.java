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
        String[] arraya = {"ABC"};
        toLowerCaseCopy(arraya);
        System.out.println("---------------------");
        for (int i = 0; i < arraya.length; i++) {
            System.out.println(arraya[i]);
        }


    }
    public static double divide(double num, double num2) {
        return num / num2;
    }
    public static int divide(int num, int num2) {
        int quotient = num / num2;
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
        int num = 999999;
        for (int i = 0; i < numArray.length - 1; i++) {
            if (numArray[i] < num) {
                num = numArray[i];
            }
        }
        return num;
    }
    public static double average(int[] numArray) {
        int sum = 0;
        for (int i = 0; i < numArray.length; i++) {
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
        String[] arrayA = array;
        return arrayA; //it said unchanged, so its unchanged
    }
    public static int[] removeDuplicates(int[] array) {
       int[] arrayNew = array;
       int num1 = 0;
       int num2 = 0;
        for (int i = 0; i < arrayNew.length; i++) {
            num1 = arrayNew[i];
            System.out.println(num1);
            for (int j = i + 1; j < arrayNew.length; j++) {
                num2 = arrayNew[j];
                System.out.println(num2);
                if (num1 == num2) {
                    arrayNew[i] = 0;
                    arrayNew[j] = 0;
                }
            }
        }
        return arrayNew;
    }


    public static String main(String s) {
        return s;
    }
}