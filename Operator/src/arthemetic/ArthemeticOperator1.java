package arthemetic;
import java.util.Scanner;
public class ArthemeticOperator1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give the first Number");
        int a = scanner.nextInt();
        System.out.println("Give the Second Number");
        int b = scanner.nextInt();
        int addition = a + b;
        System.out.println("addition =" + addition);
    }
}
