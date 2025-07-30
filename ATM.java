import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int amount=sc.nextInt();
    int[] notes={500,100,50,20,10,5,2,1};
    System.out.println("Total number of Notes");
    for(int note : notes){
      int count = amount / note;
      System.out.println(note + ":" + count);
      amount = amount % note ;
    }
  }
}
