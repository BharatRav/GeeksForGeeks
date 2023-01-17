package OpenSelect;

public class LongestValidParenthesis {
    static int maxLength(String S){
        if (S==null || S.length()==0) return 0;

        int maxlen =0;
        int open=0,close=0;

        //Moving Left to Right
        for (int i=0;i<S.length();i++) {
            if (S.charAt(i)=='(') {
                open++;
            } else {
                close++;
            }
            if (close>open) {
                open =close =0;
            }
            if (open==close) {
                maxlen=Math.max(maxlen,2*open);
            }
        }

        open=close=0;
        //Moving Right to Left
        for (int i=S.length()-1;i>=0;i--) {
            if (S.charAt(i)=='(') {
                open++;
            } else {
                close++;
            }
            if (open>close) {
                open=close=0;
            }
            if (open==close) {
                maxlen = Math.max(maxlen,2*open);
            }
        }
        return maxlen;
    }
}
