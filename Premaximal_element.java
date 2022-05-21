import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] arr = new int[7];
        for (int i=0;i<arr.length; i++){
            arr[i]= scanner.nextInt();
        }
        int max = arr[0];
        for (int i=0; i< arr.length; i++)
        if(max<arr[i])
            max = arr[i];
        int preMax = Integer.MIN_VALUE;
        for(int i=0;i<arr.length; i++){
            if (arr[i]>preMax && arr[i]<max)
                preMax = arr[i];
        }
        System.out.println(preMax);
    }
}

