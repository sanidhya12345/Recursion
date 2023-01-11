import java.util.Scanner;

public class FibonacciSequence{
    private static int  fib(int n){
        //Base Case 
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        return fib(n-1)+fib(n-2);
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n=sc.nextInt();
            System.out.println(fib(n));
        }
    }
}