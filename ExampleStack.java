package strukdat3;
import java.util.Stack;
/**
 *
 * @author Sujimmy
 */
public class ExampleStack {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Stack st = new Stack();
        
        st.push("Aku");
        st.push("Anak");
        st.push("Indonesia");
        
        System.out.println("Next :\n"+st.peek());
        st.push("Kaya");
        System.out.println(st.pop());
        st.push("!");
        
        int count = st.search("Aku");
        while (count != -1 && count>1){
            st.pop();
            count--;
        }
        System.out.println(st.pop());
        System.out.println(st.empty());
        
    }
    
}