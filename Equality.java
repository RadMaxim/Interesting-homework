import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 1;
        int number1;
        int x = 10000;
        for (int i=1; i<10; i++)
            for (int j=1; j<10;j++)
                for (int k=1; k<10; k++)
                    for (int g=1; g<10; g++)
                        for (int h=1; h<10; h++){
                            if (i ==j*k*g*h){
                                number1 = number*i*x+number*j*(x/10)+number*k*(x/100)+number*g*(x/1000)+number*h*(x/10000);
                                System.out.println(number1);
                            }
                        }

    }
}
