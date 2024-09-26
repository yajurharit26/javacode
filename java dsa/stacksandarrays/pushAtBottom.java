package stacksandarrays;
import java.util.Stack;

public class pushAtBottom{
    public static void pushAtBot(Stack<Integer> st, int n){
        if (st.empty()) {
            st.push(n);
            return;
        }
        int temp = st.peek();
        pushAtBot(st,n);
        st.push(temp);

    }
    public static void main(String[] args) {
        Stack<Integer> st  = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        pushAtBot(st,4);
    }
    
}
