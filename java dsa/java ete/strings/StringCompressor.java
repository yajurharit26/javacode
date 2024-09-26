package strings;
import java.util.*;

public class StringCompressor {
    public static String CompressString(String str){
        String ans  = "" + str.charAt(0);
        int count  = 1;
        for (int i = 1; i < str.length(); i++) {
            char curr =  str.charAt(i);
            char prev =  str.charAt(i-1);
            if(curr == prev){
                count ++;
            }else{
                if(count>1)ans+= count;
                count = 1;
                ans += curr;
            }

        }  
        if(count>1) ans += count;
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String Compressed = CompressString(str);
        System.out.println(Compressed);
    }
}
