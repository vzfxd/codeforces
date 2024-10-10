import java.util.Scanner;

public class A_Watermelon{
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int input = scanner.nextInt();
            solve(input);
        }
    }

    private static void  solve(int input){
        if(input % 2 == 0 && input != 2){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}