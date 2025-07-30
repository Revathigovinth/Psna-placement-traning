import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    float m=sc.nextFloat();
    float n=sc.nextFloat();
    int intsum=a+b;
    int intdiff=a-b;
    float floatsum=m+n;
    float floatdiff=m-n;
    System.out.println(intsum+" "+intdiff);
    System.out.println(floatsum+" "+floatdiff);
  }
}
