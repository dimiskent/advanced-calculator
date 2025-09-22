public class Calculator {
    public double processCalculation(double x, double y, char operation) {
        return switch (operation) {
            case '+' -> add(x, y);
            case '-' -> sub(x, y);
            case '*' -> mul(x, y);
            case '/' -> div(x, y);
            default -> throw new IllegalArgumentException("Bad operator");
        };
    }
    public int processCalculation(int x, int y, char operation) {
        return switch (operation) {
            case '+' -> add(x, y);
            case '-' -> sub(x, y);
            case '*' -> mul(x, y);
            case '/' -> div(x, y);
            default -> throw new IllegalArgumentException("Bad operator");
        };
    }
    private int add(int x, int y) {
        return x + y;
    }
    private int sub(int x, int y) {
        return x - y;
    }
    private int mul(int x, int y) {
        return x * y;
    }
    private int div(int x, int y) {
        return x / y;
    }
    private double add(double x, double y) {
        return x + y;
    }
    private double sub(double x, double y) {
        return x - y;
    }
    private double mul(double x, double y) {
        return x * y;
    }
    private double div(double x, double y) {
        return x / y;
    }
}
