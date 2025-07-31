import java.util.*;
public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,row,col;
        n=sc.nextInt();
        for(row=1;row<=n;row++){
            for(col=1;col<=n;col++){
                if(row==1||row==n||col==1||col==n){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
      }
}
