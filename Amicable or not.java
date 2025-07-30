import java.util.*;
public class Amicable{
  public static int SumofDivisors{
    int sum=0;
    for(int i=1;i<=num/2;i++){
      if(num%i==0){
        sum+=i;
    }
  }
    return sum;
  }
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    if(SumofDivisors(a)==b && SumofDivisors(b)==a){
      System.out.println("Amicable pair");
    }
    else{
      System.out.println("Not a Amicable pair");
    }
  }
}

    
