import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] arr = new int[10];
        int pred_max=0;
        int max = arr[0];
        for (int i=0; i<arr.length; i++){
            System.out.println("Enter "+(i+1)+" item: ");
            arr[i]=scanner.nextInt();;
        }
        for (int i=0; i<arr.length; i++)
            if(arr[i]>max){
                pred_max = max;
                max = arr[i];
            }
        System.out.println("Maximum element: "+max+" and predmaximal element: "+pred_max);

    }
}

