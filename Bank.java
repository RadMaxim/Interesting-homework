import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Deposit amount");
         float deposit = scanner.nextInt();// вся сумма
        System.out.println("Bank interest");
        float procent = scanner.nextInt(); //процент
        System.out.println("Deposit term");
        int time = scanner.nextInt(); //месяц
        for (int i=1; i<=time; i++){
            deposit = deposit*(1+(procent/100));
          System.out.println(deposit);
        }
    }
}
