package strings;
import java.util.*;

public class toggle {
    public static StringBuilder toggleCase(StringBuilder str){
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(Character.isUpperCase(ch)){
                ans.append(Character.toLowerCase(ch));
            }else if(Character.isLowerCase(ch)){
                ans.append(Character.toUpperCase(ch));
            }else{
                ans.append(ch);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder str = new StringBuilder(sc.nextLine());
        StringBuilder ans = toggleCase(str);
        System.out.println(ans);
        sc.close();

    }
}
