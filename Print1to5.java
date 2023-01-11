
public class Print1to5 {

    private static void printItoV(int n){
        if(n==5){
            return ;
        }
        System.out.println(n+1);
        printItoV(n+1);
    } 
    public static void main(String[] args) {
        printItoV(0);    
    }
}
