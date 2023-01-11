import java.util.Scanner;

public class ReverseAstring {
    private static String reverse(String ans,String s,int length){
        if(length==-1){
            return ans;
        }
        char ch=s.charAt(length);
        return reverse(ans+ch, s, length-1);
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String s=sc.next();
            System.out.println(reverse("",s,s.length()-1));
        }
    }
}
