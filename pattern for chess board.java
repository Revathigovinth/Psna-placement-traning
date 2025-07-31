import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,row,col;
        n=sc.nextInt();
        for(row=1;row<=n;row++){
            for(col=1;col<=n;col++){
                if((row+col)%2==0){
                    System.out.print("1");
                }
                else{
                    System.out.print("0");
                }
            }
             System.out.println();
        }
    }
}
