import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("When I started doing?");
        int chas1 = scanner.nextInt();
        int min1 = scanner.nextInt();
        int chas1_sec = chas1*3600, min1_sec = min1*60, sec1 = scanner.nextInt();
        System.out.println("At "+chas1+" hours "+min1+" minutes "+sec1+" seconds");
        int chas1_summ = chas1_sec+min1_sec+sec1;
        System.out.println("When I finished practicing?");
        int chas2 = scanner.nextInt();
        int min2 = scanner.nextInt();
        int chas2_sec = chas2*3600, min2_sec = min2*60, sec2 = scanner.nextInt();
        System.out.println("At "+chas2+" hours "+min2+" minutes "+sec2+" seconds");
        int chas2_summ = chas2_sec+min2_sec+sec2;
        int result = Math.abs(chas1_summ-chas2_summ);
        int chas_result = result/3600;
        int min_result = (result%3600)/60;
        int sec_result = (result%3600)%60;
        System.out.println("Worked: "+"Chasov - "+chas_result+" Minut - "+min_result+" Secund - "+sec_result);
    }
}