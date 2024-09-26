package strings;
import java.util.*;
public class reverseEachWord {
    public static StringBuilder reverse(StringBuilder str){
        StringBuilder ans =new StringBuilder("");
        StringBuilder rev =new StringBuilder("");
        for(int i = 0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch == ' '){
                rev.reverse();
                rev.append(ch);
                ans.append(rev);
                rev.setLength(0);
            }else{
                rev.append(ch);
            }
        }
        if(rev.length()>0){
            rev.reverse();
            ans.append(rev);
        }
        
        return ans;
    }    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder str = new StringBuilder(sc.nextLine());
        StringBuilder ans = reverse(str);
        System.out.println(ans);
        str.reverse();
        System.out.println(str);
        sc.close();
    }
}
