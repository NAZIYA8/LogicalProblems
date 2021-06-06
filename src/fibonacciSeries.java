import java.util.Scanner;

public class fibonacciSeries {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
        int previousNumber = 0;
        int nextNumber = 1;

        System.out.println("Enter the maximum number");
        int maxNumber = scan.nextInt();

        for (int i=1; i<= maxNumber;i++){
            System.out.println(previousNumber+ " ");
            int sum = previousNumber + nextNumber;
            previousNumber=nextNumber;
            nextNumber=sum;
        }

    }
}
