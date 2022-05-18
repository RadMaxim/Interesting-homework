import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number ");
        int a = scanner.nextInt();
        System.out.println("Enter operation sign ");
        char c = scanner.next().charAt(0);
        System.out.println("Enter the second number ");
        int b = scanner.nextInt();

        switch (c)
        {
            case '-': System.out.println(a-b);break;
            case '+': System.out.println(a+b);break;
            case '*': System.out.println(a*b);break;
            case '/': System.out.println(a/b);break;

        }

    }
    }
