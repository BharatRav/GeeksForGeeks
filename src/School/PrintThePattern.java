package School;

public class PrintThePattern {
    void printPat(int n)
    {
        for(int i=0;i<n;i++){
            for(int j=n;j>0;j--){
                int k=n-i;
                while(k-->0)
                    System.out.print(j+" ");
            }
            System.out.print("$");
        }
    }
}
