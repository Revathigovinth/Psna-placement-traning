import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int num=n;
        for(int i=2;i<=n/i;i++){
            int count=0;
            while(n%i==0){
                count++;
                n/=i;
            }
            if(count>0){
                System.out.println(i+"->"+count);
            }
        }
        if(n>1){
            System.out.println(n+"->1");
        }
    }
}
