import java.util.Scanner;
class Main{
	public static void main (String[] args)
    {
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int n=in.nextInt();
      for(int c=1;c<=n;c=c+1)
      {
        if(n%c==0)
        {
          System.out.println(c);
        }
      }
     
	}
}