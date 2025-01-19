import java.util.Scanner;

public class testJava { 
    public static void main (String[] args)  {
        Scanner scanner = new Scanner(System.in);

        boolean exitProgram = false;

        while (exitProgram != true) {
            char userInput;
            System.out.println("What would you like to do?");
            System.out.println("[c] Use Calculator");
            System.out.println("[x] Exit Program");
            System.out.print(">: ");
            userInput = scanner.nextLine().toLowerCase().charAt(0);

            // USE THE CALCULATOR
            if(userInput == 'c') {
                double val1, val2;
                char operation;

                System.out.println("\nThis is a Calculator");
                System.out.println("Just type out in this format");
                System.out.println("(y [ENTER] operation [ENTER] y [ENTER])");
                System.out.println("[+]Add [-]Subtract");
                System.out.println("[*]Mulitply [/]Divide");

                System.out.print("Value 1>:\t");
                val1 = scanner.nextDouble();
                scanner.nextLine();
                System.out.print("Operation>:\t");
                operation = scanner.nextLine().charAt(0);
                System.out.print("Value 2>:\t");
                val2 = scanner.nextDouble();
                scanner.nextLine();
            // PROCESS THE OPERATION AND GIVES THE ANSWER
                switch (operation) {
                    case '+':
                    System.out.println("The answer is: " + (val1 + val2) + "\n");
                    break;

                    case '-':
                    System.out.println("The answer is: " + (val1 - val2) + "/\n");
                    break;

                    case '*':
                    System.out.println("The answer is: " + (val1 * val2) + "\n");
                    break;

                    case '/':
                    System.out.println("The answer is: " + (val1 / val2) + "\n");
                    break;

                    default:
                    System.out.println("Operation input is invalid\n");
                    break;
                }
            } else if (userInput == 'x') {
                exitProgram = true;
                System.out.println("Exiting Program...");
                System.out.println("Thank you for using my calculator");
            } else {
                System.out.println("Invalid input. Try Again\n");
            }
        }     
        scanner.close();
    }
}