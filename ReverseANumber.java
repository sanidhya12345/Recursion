import java.util.Scanner;

public class ReverseANumber {
    private static int reverse(int n,int sum){
        if(n==0){
            sum=sum/10;
            return sum;
        }
        return reverse(n/10, (sum+(n%10))*10);
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number");
            int n=sc.nextInt();
            System.out.println(reverse(n, 0));
        }
    }
}
