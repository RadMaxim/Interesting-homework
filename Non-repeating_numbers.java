import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] arr = new int[10];
        int count = 0;
        for(int i = 0; i<arr.length; i++){
            arr[i]= scanner.nextInt();
        }
        for (int i = 0; i< arr.length; i++){
            count=0;
            for (int j = 0; j< arr.length; j++){
                if (arr[i] == arr[j] && i != j){
                    count++;
                    if (count != 0) break;
                }
            }
            if (count == 0) System.out.println(arr[i]);
        }

    }
}
