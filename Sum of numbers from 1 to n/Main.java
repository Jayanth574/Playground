import java.util.Scanner;
class Main{
	public static void main (String[] args)
    {
	     // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int sum=0;
      for(int c=0;c<=n;c=c+1)
      {
        sum=sum+c;
      }
      System.out.println(sum);
	}
}