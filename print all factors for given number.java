import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            if(n%i==0){
                if(i==n){
                    System.out.println(i);
                }else{
                    System.out.print(i+",");
                }
            }
        }
        System.out.println();
    }
}
