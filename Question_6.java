
import java.util.Scanner; // import the Scanner class 

public class Question_6 {
  public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		long n = sc.nextLong();
		long sum=0;
		long i =1;
		while(i<=n)
		{
			if(i%2!=0)
			{
				sum=sum+i;	
			}
		i++;
		}
		System.out.print(sum);	
  }
}