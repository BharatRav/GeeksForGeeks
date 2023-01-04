package POTD.Year_2022.December.Dec_08_22.Dec_11_22;

public class ArrayPairSumDivisibilityProblem {
    public boolean canPair(int[] nums, int k) {

        // Code here

        if(nums.length%2==1) {

            return false;

        }

        int mem[] = new int[k];

        for(int x : nums)

        {

            mem[x%k]++;

        }

        if(mem[0]%2==1){

            return false;

        }

        for(int i=1; i<=k/2; i++)

        {

            if(mem[i]!=mem[k-i]) return false;

        }

        return true;

    }
}
