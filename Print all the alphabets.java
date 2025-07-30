import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        for(int i=0;i<a;i++){
            for(char ch='a';ch<='z';ch++){
                System.out.print(ch+ " ");
            }
            System.out.println();
        }
    }
}
