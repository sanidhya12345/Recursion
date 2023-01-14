public class CheckArrayIsStrictlyINcreasing {

    public static boolean isSorted(int [] arr,int index){
        //base case:-
        if(index==arr.length-1){
            return true;
        }
        if(arr[index]<arr[index+1]){
            return isSorted(arr, index+1);
        }
        return false;
    }
    public static void main(String[] args) {
        int [] arr={1,2,3,4,4};
        System.out.println(isSorted(arr, 0));
    }
}
