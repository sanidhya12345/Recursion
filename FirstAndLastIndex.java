public class FirstAndLastIndex{
    public static int first=-1;
    public static int last=-1;
    public static void findLastFirst(int [] arr,int index,int element){
        //base case:-
        if(index==arr.length){
            System.out.println(first);
            System.out.println(last);
            return ;
        }
        if(arr[index]==element){
            if(first==-1){
                first=index;
            }
            else{
                last=index;
            }
        }
        findLastFirst(arr, index+1, element);
    }
    public static void main(String[] args) {
        int [] arr={1,2,3,4,4,4,5,6};
        findLastFirst(arr, 0,4);
    }
}