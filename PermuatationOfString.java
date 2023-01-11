import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class PermuatationOfString {
    static Set<String> set=new HashSet<>();
    public static String swap(String a, int i, int j)
    {
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }

    private static void permute(String s,int start,int end){
        if(start==end){ 
           set.add(s);
        }
        else{
            for(int i=start;i<=end;i++){
                s=swap(s, start, i);
                permute(s, start+1, end);
                s=swap(s, start, i);
            }
        }
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String s=sc.next();
            permute(s, 0, s.length()-1);
            System.out.println(set.contains("ab"));
        }
    }
}
