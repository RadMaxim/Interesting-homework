import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=0;
        int[] arr1 = new int[8];//x
int[] arr2 = new int[8];//y
for (int i = 0, b = 1; i < arr1.length; i++, b++){
System.out.println("Queen "+b+":");
arr1[i]  = scanner.nextInt();
arr2[i] = scanner.nextInt();
}
for (int i=0; i<arr1.length; i++)
    for (int j = 0; j < arr1.length; j++){
        if (((arr1[i] + arr2[i]) == (arr1[j] + arr2[j])
                || (arr1[i] == arr1[j]) || (arr2[i] == arr2[j]) || ((arr1[i] - arr2[i]) == (arr1[j] - arr2[j]))||((arr1[i] - arr1[j]) == (arr2[i] - arr2[j]))) && i!=j){
            System.out.println("Queen-"+(i+1)+" under attack "+"Queen-"+(j+1));
            n++;
            System.out.println("win: "+n);
            break;
        }
    }
        System.out.println("Under attack- "+n);

    }
}
