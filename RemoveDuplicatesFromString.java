public class RemoveDuplicatesFromString {
    public static boolean [] map=new boolean[26];

    public static void remove(String str,int index,String newString){
        if(index==str.length()-1){
            System.out.println(newString);
            return ;
        }
        char currentChracter=str.charAt(index);
        if(map[currentChracter-'a']==true){
            remove(str, index+1, newString);
        }
        else{
            newString+=currentChracter;
            map[currentChracter-'a']=true;
            remove(str, index+1, newString);
        }
    }
    public static void main(String[] args) {
        String str="aabcdabbc";
        remove(str, 0, "");
    }
}
