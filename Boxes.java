import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 3 sides of the first box ");
        int sideXbox1 = scanner.nextInt();
        int sideYbox1 = scanner.nextInt();
        int sideZbox1 = scanner.nextInt();
        System.out.println("Enter 3 sides of the second box ");
        int sideXbox2 = scanner.nextInt();
        int sideYbox2 = scanner.nextInt();
        int sideZbox2 = scanner.nextInt();
        if (sideZbox1 < sideYbox1){
            int temp = sideYbox1;
            sideYbox1 = sideZbox1;
            sideZbox1 = temp;
        }
        if (sideZbox1 < sideXbox1){
            int temp = sideXbox1;
            sideXbox1 = sideZbox1;
            sideZbox1 = temp;
        }
        if (sideYbox1 < sideXbox1){
            int temp = sideXbox1;
            sideXbox1 = sideYbox1;
            sideYbox1 = temp;
        }
        if (sideZbox2 < sideYbox2){
            int temp = sideYbox2;
            sideYbox2 = sideZbox2;
            sideZbox2 = temp;
        }
        if (sideZbox2 < sideXbox2){
            int temp = sideXbox2;
            sideXbox2 = sideZbox2;
            sideZbox2 = temp;
        }
        if (sideYbox2 < sideXbox2){
            int temp = sideXbox2;
            sideXbox2 = sideYbox2;
            sideYbox2 = temp;
        }
        if (sideXbox1>=sideXbox2 && sideYbox1>=sideYbox2 && sideZbox1>=sideZbox2)
            System.out.println("The first box into the second box");
        else System.out.println("The first box does not fit in the second box");
    }
}
    
