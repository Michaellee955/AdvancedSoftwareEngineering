package ds.stack;

public class app {
    public static void main(String[] args) {
        Stack st = new Stack(1);
        st.push(10);
        st.push(20);

        while(!st.isEmpty()){
            long value = st.pop();
            System.out.println(value);
        }
    }
}
