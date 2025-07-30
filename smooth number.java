import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        if(a%b==0){
            System.out.println("Smooth Number");
        }
        else{
            System.out.println("Not a Smooth Number");
        }
    }
}
