import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
        static void main(String[] args) throws IOException {
                Calculator calc = new Calculator();
                InputStreamReader is = new InputStreamReader(System.in);
                BufferedReader br = new BufferedReader(is);
                String input = null;
                System.out.println("type exit to exit program");
                while (!input.equals("exit")) {

                        input = br.readLine();

                        if ("add".equals(input)) {
                                System.out.println("Enter 2 numbers to add");
                                int numa = Integer.parseInt(br.readLine());
                                int numb = Integer.parseInt(br.readLine());
                                System.out.println(calc.add(numa, numb));
                        } else if ("subtract".equals(input)) {
                                System.out.println("Enter 2 numbers to subtract");
                                int numa = Integer.parseInt(br.readLine());
                                int numb = Integer.parseInt(br.readLine());
                                System.out.println(calc.subtract(numa, numb));
                        } else if ("multiply".equals(input)) {
                                System.out.println("Enter 2 numbers to multiply");
                                int numa = Integer.parseInt(br.readLine());
                                int numb = Integer.parseInt(br.readLine());
                                System.out.println(calc.multiply(numa, numb));
                        } else if ("divide".equals(input)) {
                                System.out.println("Enter 2 numbers to divide");
                                int numa = Integer.parseInt(br.readLine());
                                int numb = Integer.parseInt(br.readLine());
                                System.out.println(calc.divide(numa, numb));
                        } else if ("fibonacci".equals(input)) {
                                System.out.println("Enter Nth fibonnaci number");
                                int numa = Integer.parseInt(br.readLine());
                                System.out.println(calc.fibonacciNumberFinder(numa));
                        } else if ("binary".equals(input)) {
                                System.out.println("Enter a number to convert to Binary");
                                int numa = Integer.parseInt(br.readLine());
                                System.out.println(calc.intToBinaryNumber(numa));
                        } else if ("uniqueID".equals(input)) {
                                System.out.println("Enter something to make a unique ID");
                                String numa = br.readLine();
                                System.out.println(calc.createUniqueID(numa));
                        } else {
                                System.out.println("invalid input");
                        }
                }
        }
}