import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int p=1,flag=0;
        while(a>=p){
            if(a==p){
                flag=1;
            }
            p=p*2;
        }
        if(flag==1){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
