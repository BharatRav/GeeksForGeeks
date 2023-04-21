package POTD.Year_2023.April.Apr_21_23;

public class PrefixSuffixString {
    public int prefixSuffixString(String s1[],String s2[])
    {

        int count=0;
        for (int i=0;i<s2.length;i++) {
            for (String word:s1) {
                if(word.startsWith(s2[i]) || word.endsWith(s2[i])) {
                    count++;
                    break;
                }
            }
        }

        return count;
    }
}
