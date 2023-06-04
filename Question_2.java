
import java.util.Scanner; // import the Scanner class 

public class Question_2 {
  public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		long n = sc.nextLong();
		long i =1;
		while(i<=n)
		{
			if(i%2!=0)
			{
				System.out.print(i+" ");	
			}
		i++;
		}
		
  }
}