import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char ch=sc.next().charAt(0);
        if(ch>=97 && ch<=122){
            System.out.println("LOWERCASE");
        }
        else{
            System.out.println("UPPERCASE");
        }
    }
}
