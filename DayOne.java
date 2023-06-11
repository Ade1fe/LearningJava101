import java.util.Scanner;

public class DayOne {

    public static void main(String[] args) {
        System.out.println( "question 1: "+ addNumbers(30, 50));
         checkOdd(30);
         findHighestNum(20, 33, 15);
         checkLeapYear(1997);
         factorialNumber(5);
    }

    private static int addNumbers(int a, int b) {
        int res = a + b;
        return res;
    }

     public static void checkOdd(int num) {
        String result = (num % 2 == 1) ? "odd" : "even";
        System.out.println("question 2: "+num + " is " + result);
    }

    public static void findHighestNum(int f, int s, int t) {
    int highestNum = (f >= s && f >= t) ? f : ((s >= f && s >= t) ? s : t);
    System.out.println("question 3: "+ highestNum + " is the highest number.");
    }


  public static void checkLeapYear(int leap) {
    String leapYear = (leap % 4 == 0 && (leap % 100 != 0 || leap % 400 == 0))
            ? leap + " is a leap year"
            : leap + " is not a leap year";
    System.out.println("question 4: " + leapYear);
}

public static void factorialNumber(int fact) {
    int factorial = 1;
    for (int i = 1; i <= fact; i++) {
        factorial *= i;
    }
    System.out.println("question 5: The factorial of " + fact + " is: " + factorial);
}



}
