import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first side of the triangle - ");
        int a = scanner.nextInt();
        System.out.println("Enter the second side of the triangle - ");
        int b = scanner.nextInt();
        System.out.println("Enter the third side of the triangle - ");
        int c = scanner.nextInt();
            if (a >= (b + c) || c >= (a + b) || b >= (a + c))
            {
                System.out.println("A triangle with such sides does not exist");
            }
            else
                System.out.println("Such a triangle exists");
    }
}
