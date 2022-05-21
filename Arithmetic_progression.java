import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] arr = {1,2,3,4,5,6};
        int deff = arr[1]-arr[0];
        int count=0;
        for (int i=0; i< arr.length-1; i++){
           if ((arr[i+1]-arr[i])==deff)
               count++;
        }
        if (count== (arr.length-1))
            System.out.println("Arithmetic progression");
        else System.out.println("No");
    }
}

