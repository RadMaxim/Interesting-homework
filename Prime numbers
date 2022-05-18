import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number");
        int a = scanner.nextInt();
        int count=0;
        int i=2;
        while (i<=a){
            count=1;
            if (a%i==0){
                count=0;
                for (int j=2; j<i; j++){ if( i%j == 0 ) count++;break;}
                if (count==0){System.out.println(i);a = a/i;}
            }
            i++;
            if (count==0)i--;

        }
    }
}
