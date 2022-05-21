import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        while( c!=0){
            if (b>a && b>c)
                System.out.println(b);
            a = b;
            b = c;
            c = scanner.nextInt();
        }
    }
}

