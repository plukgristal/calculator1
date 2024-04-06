import java.math.BigDecimal;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        try {

            BigDecimal num1 = scanner.nextBigDecimal();
            BigDecimal num2 = scanner.nextBigDecimal();
            String type = scanner.next();

            BigDecimal result;
            switch(type) {
                case "sum":
                    result = num1.add(num2);
                    break;
                case "sub":
                    result = num1.subtract(num2);
                    break;
                case "mul":
                    result = num1.multiply(num2);
                    break;
                case "div":
                    result = num1.divide(num2);
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
