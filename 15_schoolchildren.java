import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count_1 = 3;
        int count_2 = 2;
        int count_3 = 0;
        int count_5 = 1;
        boolean count_4 = false;
        for (int i=2; i<10; i++) {
            for (int j = 2; j < 10; j++) {
                if ((i >= count_1 && j > count_2)) {
                    System.out.println(count_5+++") "+i + " * " + j + " = " + i * j);
                    count_4 = true;
                }
                if (i==2 && j>=2){
                    System.out.println(count_5+++") "+i + " * " + j + " = " + i * j);
                count_3++;
                }
            }
            if (count_3==8 && count_4 == true){
            count_1++;
            count_2++;
            }
        }
    }
}

