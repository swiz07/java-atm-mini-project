import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Account account1 = new Account("Patrick", 60, 89291239, 1234);

        System.out.println("Please enter your PIN:");
        int input = scanner.nextInt();

        if (account1.pinLogin(input)) {

            int choice;

            do {
                System.out.println("\n===== ATM =====");
                System.out.println("1. Deposit");
                System.out.println("2. Withdraw");
                System.out.println("3. Check balance");
                System.out.println("4. Change PIN");
                System.out.println("5. Exit");
                System.out.println("Choose an option:");

                choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("How much do you want to deposit?");
                        double deposit = scanner.nextDouble();
                        account1.depositMoney(deposit);
                        break;

                    case 2:
                        System.out.println("How much do you want to withdraw?");
                        double withdraw = scanner.nextDouble();
                        account1.withdrawMoney(withdraw);
                        break;

                    case 3:
                        account1.checkBalance();
                        break;

                    case 4:
                        System.out.println("Enter your new PIN:");
                        int updatePin = scanner.nextInt();
                        account1.changePin(updatePin);
                        break;

                    case 5:
                        System.out.println("Goodbye, see you next time");
                        break;

                    default:
                        System.out.println("Invalid option. Please choose 1-5.");
                }

            } while (choice != 5);
        }

        scanner.close();
    }
}
