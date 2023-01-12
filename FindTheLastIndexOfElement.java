public class FindTheLastIndexOfElement {
    public static int findLastIndex(int [] arr,int n,int index,int ans){
        if(index==arr.length-1){
            return ans;
        }
        if((arr[index]==n) && index<arr.length){
            return findLastIndex(arr, n, index+1, index);
        }
        return findLastIndex(arr, n, index+1, ans);
    }
    public static void main(String[] args) {
        int [] arr={1,2,2,3,3,4,5};
        int index=findLastIndex(arr, 4, 0, -1);
        System.out.println(index);
    }
}
