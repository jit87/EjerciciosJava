import java.util.Scanner;

public class PAC1Ex1 {

    public static void main(String[] args) {

        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        number = scanner.nextInt(); //assigns the variable "number" the integer entered by keyboard

        if(number < 0) {
            System.out.println("[ERROR]: The given number is not positive");
        } else {
            fibonacci(number);
        }
    }

    private static void fibonacci(int n) {
        int old;
        int actual = 0;
        int next = 1;
        for (int i = 0; i < n; i++) {
            System.out.print(actual + ", "); //prints the 'i' value of the fibonacci succession
            old = actual;
            actual =  next;
            next = old + actual;

        }
    }
}

