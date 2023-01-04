package POTD.Year_2022.December.Dec_08_22.Dec_10_22;

import java.util.Stack;

public class BuildTheSmallest {
    static String buildLowestNumber(String str, int k) {
        //143729 k=2
        //Output: "1329"

        //10056" k=3
        //Output: "0"
        Stack<Character> st = new Stack<>();
        for (int i=0;i<str.length();i++) {
            char ch = str.charAt(i);

            while (!st.isEmpty() && k>0 && st.peek()>ch) {
                st.pop();
                k--;
            }
            st.push(ch);
        }


        while (!st.isEmpty() && k>0) {
            st.pop();
            k--;
        }

        //adding charecters in string builder
        StringBuilder sb = new StringBuilder();
        while (!st.isEmpty()) {
            sb.append(st.pop());
        }

        //handling zeros
        int n = sb.length();
        for (int i=n-1;i>=0;i--) {
            if (sb.charAt(i) != '0') {      //it is reverse number
                break;
            }
            if (sb.charAt(i) =='0') {       //reverse number so 0 we dont want on left side of number 0054(no), 5400(yes)
                sb.deleteCharAt(i);
            }
        }
        return sb.length()==0?"0":sb.reverse().toString();
    }
}
