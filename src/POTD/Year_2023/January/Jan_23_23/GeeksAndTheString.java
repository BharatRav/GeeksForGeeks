package POTD.Year_2023.January.Jan_23_23;

import java.util.Stack;

class GeeksAndTheString {
    public static String removePair(String s) {
        Stack<Character> st = new Stack<>();

        String res ="";
        for (int i=0;i<s.length();i++) {
            char ch= s.charAt(i);

            if (!st.empty() && st.peek()==ch) {
                st.pop();
            } else {
                st.push(ch);
            }
        }
        // System.out.println(st);

        while(!st.empty()) {
            res =st.pop()+res;
        }

        if(res.length()==0) {
            return "-1";
        }
        return res;
    }
}
