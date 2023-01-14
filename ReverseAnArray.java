import java.util.Arrays;

public class ReverseAnArray {

    public static void reverse(int [] array,int start,int end){
        if(start>end) return;
        if(start<=end){
            int temp=array[start];
            array[start]=array[end];
            array[end]=temp;
        }
        reverse(array, start+1, end-1);
    }
    public static void main(String[] args) {
        int [] array={1,2,3,4,5};
        System.out.println("Before reversing:- "+Arrays.toString(array));
        reverse(array, 0, array.length-1);
        System.out.println("After reversing:- "+Arrays.toString(array));
    }
}
