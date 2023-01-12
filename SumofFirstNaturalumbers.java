import java.util.Scanner;

public class SumofFirstNaturalumbers {

    private static int sumofFirstNaturalumbers(int i,int n,int sum)
    {
        //Base Case
        if(i==5){
            sum+=i;
            return sum;
        }
        sum+=i;
        return sumofFirstNaturalumbers(i+1, n, sum);
      }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n=sc.nextInt();
            System.out.println(sumofFirstNaturalumbers(1, 5,0));
        }
        
    }
}
