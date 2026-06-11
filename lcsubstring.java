import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a,b;
        a=sc.next();
        b=sc.next();
        int m=a.length();
        int n=b.length();
        int dp[][]=new int[m+1][n+1];
        int max=0;
        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                if(a.charAt(i-1)==b.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1]+1;
                    max=Math.max(max,dp[i][j]);
                }
            }
        }
        System.out.println(max);
    }
}
