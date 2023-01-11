package OpenSelect;

public class PalindromeString {
    int isPalindrome(String S) {
        int s =0;
        int l=S.length()-1;

        while(s<l){
            if(S.charAt(s)!=S.charAt(l)) {
                return 0;
            }
            s++;
            l--;
        }
        return 1;
    }
}
