import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        try {

            String snum1 = scanner.next();
            String snum2 = scanner.next();
            String type = scanner.next();

            int num1 = Integer.parseInt(snum1);
            int num2 = Integer.parseInt(snum2);

            int result;
            switch(type) {
                case "sum":
                    result = num1 + num2;
                    break;
                case "sub":
                    result = num1 - num2;
                    break;
                case "mul":
                    result = num1 * num2;
                    break;
                case "div":
                    if (num2 == 0) {
                        System.out.println("Cannot divide by zero.");
                        return;
                    }
                    result = num1 / num2;
                    break;
                default:
                    System.out.println("Operation not found! Use one of: sum, sub, mul, div.");
                    return;
            }
            System.out.println("Result: " + result);
        } catch (NumberFormatException e) {
            System.out.println("Error: Both arguments must be integers.");
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }
    }
}
