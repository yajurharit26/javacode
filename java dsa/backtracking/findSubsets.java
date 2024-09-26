public class findSubsets {
    public static void findSubset(String str,int i,String ans){
      if (i == str.length()){
        System.out.println(ans);
        return;
      }
      findSubset(str, i+1, ans + str.charAt(i));
      findSubset(str, i+1, ans);
    }
    public static void main(String[] args) {
        String str=  "abc";
        findSubset(str, 0, "");
    }
}
