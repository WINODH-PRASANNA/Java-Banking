import java.util.*;

public class ATM_Project {

    public static void main(String[] args) {
        int pin = 1234;
        int balance = 10000;

        int AddAmount = 0;
        int TakeAmount = 0;

        String name;

        Scanner scanner = new Scanner (System.in);

        System.out.println (" -----> Enter your pin number <----- ");

        int password = scanner.nextInt();

        if (password == pin) {
            System.out.println(" -----> Enter your Name <----- ");
            name = scanner.next();
            System.out.println(" >>>>>>> Welcome " + name + " <<<<<<< ");

            while (true) {
                System.out.println(" -----> press 1 to check your balance ");
                System.out.println(" -----> press 2 to deposit money ");
                System.out.println(" -----> press 3 to withdrow money ");
                System.out.println(" -----> press 4 to take resipt ");
                System.out.println(" -----> press 5 to EXIT");

                int opt = scanner.nextInt();
                switch (opt) {
                    case 1 -> System.out.println(" >>>>> Your current balance is " + balance + " <<<<< ");
                    case 2 -> {
                        System.out.println(" -----> How much amount did you want to deposit your amount <----- ");
                        AddAmount = scanner.nextInt();
                        System.out.println(" >>>>> Successfully creadited <<<<<");
                        balance = AddAmount + balance;
                    }
                    case 3 -> {
                        System.out.println(" -----> How much amount did you want to withdrow your amount <----- ");
                        TakeAmount = scanner.nextInt();
                        if (TakeAmount > balance) {
                            System.out.println(" >>>>> Your balance is insufficient <<<<< ");
                            System.out.println(" >>>>> Try less than yuur avalable balance <<<<< ");
                        } else {
                            System.out.println(" >>>>> Successfully taken <<<<< ");
                            balance = balance - TakeAmount;
                        }
                    }
                    case 4 -> {
                        System.out.println(" -----> Welcome to ATM <----- ");
                        System.out.println(" >>>>> Hello " + name);
                        System.out.println(" >>>>> Avalable balance is      " + balance);
                        System.out.println(" >>>>> Amount deposited         " + AddAmount);
                        System.out.println(" >>>>> Amount withdrow          " + TakeAmount);
                        System.out.println(" >>>>> Thank you for comming <<<<< ");
                    }
                }
                if (opt == 5) {
                    System.out.println(" >>>>> Thankyou <<<<< ");
                    break;
                }
            }
        } else {
            System.out.println(" >>>>> Wrong pin number <<<<< ");
        }
    }
}
