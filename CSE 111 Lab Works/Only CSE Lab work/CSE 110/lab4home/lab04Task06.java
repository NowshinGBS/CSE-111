import java.util.Scanner;
public class lab04Task06
{
  public static void main (String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int num;
    num=sc.nextInt();
    
    if(num%2==0)
    {
      System.out.print("The number is even");
    }
    else
    {
      System.out.print("The number is odd");
    }
  }
}