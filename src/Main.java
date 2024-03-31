import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter amount of money: ");
        float money = scanner.nextFloat();

        System.out.println("Enter exchange rate: ");
        float interestRate = scanner.nextFloat();

        System.out.println("Enter number of months: ");
        int month = scanner.nextInt();

        float totalInterest = 0;
        for (int i = 0; i < month; i++) {
            totalInterest += money * (interestRate / 100) * 12 * month;
        }
        System.out.println("Total of interest: " + totalInterest);
    }
}
