import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] arr = new int[6];
        for (int i=0;i<arr.length; i++){
            arr[i]=scanner.nextInt();
        }
        for (int j=0; j< arr.length; j++)
            for (int i=0; i<arr.length-1; i++){
                if(arr[i]>arr[i+1]){
                    int temp = arr[i+1];
                    arr[i+1]=arr[i];
                    arr[i]=temp;
                }
            }
        for (int i=0; i< arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}

