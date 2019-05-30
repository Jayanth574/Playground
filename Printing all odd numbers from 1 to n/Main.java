import java.util.Scanner;
class Main {
	public static void main (String[] args)
    {
	     // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      for(int c=0;c<=n;c=c+1)
      {
        if(c%2!=0)
        {
          System.out.println(c);
        }
      }
	}
}