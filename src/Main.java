public class Main {
    public static void main(String[] args) {
        Input input = new Input();
        Calculator calc = new Calculator();
        do {
            System.out.println("Enter your 1st number!");
            String num1 = input.getValidNumberInput();

            System.out.println("Enter your 2nd number!");
            String num2 = input.getValidNumberInput();

            System.out.println("Enter your operation (+ - * /)");
            char operation = input.getValidCharInput();
            System.out.printf("Result of %s %c %s: ", num1, operation, num2);
            if(num1.contains(".") || num2.contains(".")) {
                // double
                System.out.println(calc.processCalculation(Double.parseDouble(num1), Double.parseDouble(num2), operation));
            } else {
                // int
                System.out.println(calc.processCalculation(Integer.parseInt(num1), Integer.parseInt(num2), operation));
            }
            System.out.println("Continue? (y)es or (n)o");
        } while(input.askContinue());
        input.close();
    }
}
