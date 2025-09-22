import java.util.Scanner;

public class Input {
    private final Scanner scanner;
    public Input() {
        scanner = new Scanner(System.in);
    }
    public void close() {
        scanner.close();
    }
    public boolean askContinue() {
        String q;
        do {
            System.out.print("=> ");
            q = scanner.next().toLowerCase().substring(0, 1);
        } while(q.charAt(0) != 'y' && q.charAt(0) != 'n');
        return q.charAt(0) == 'y';
    }
    public char getValidCharInput() {
        String regex = "[+\\-*/]";
        String res;
        do {
            System.out.print("=> ");
            res = scanner.next().substring(0, 1);
        } while(!res.matches(regex));
        return res.charAt(0);
    }
    public String getValidNumberInput() {
        String regex = "^(?!-0(\\.0+)?$)-?(0|[1-9]\\d*)(\\.\\d+)?$";
        String res;
        do {
            System.out.print("=> ");
            res = scanner.next();
        } while(!res.matches(regex));
        return res;
    }
}
