package POTD.Year_2023.January.Jan_31_23;

public class minimumTimeAHasToBeRepeatedSuchThatBIsASubstringOfIt {
    static int minRepeats(String A, String B) {
        // code here
        StringBuilder sb = new StringBuilder();
        sb.append(A);
        int ans=1;
        // to generate a string whose size is greater than B;

        while(sb.length()<B.length()){

            sb.append(A);
            ans++;
        }

        // generate the string while you do not find the substring and
        // for safety generate the string 2 time the B length to cover all cases

        while(((sb.toString()).indexOf(B))==-1 && sb.length()<(2*B.length())){
            sb.append(A);
            ans++;
        }
        if((sb.toString()).indexOf(B)!=-1) return ans;
        return -1;
    }

    public static void main(String[] args) {
        String A = "pacd";
        String B = "cdabcdab";
        System.out.println(minRepeats(A,B));
    }
}
