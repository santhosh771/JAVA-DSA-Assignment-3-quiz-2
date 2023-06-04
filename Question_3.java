
import java.util.Scanner; // import the Scanner class 

public class Question_3 {
  public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		long n = sc.nextLong();
		long sum=0;
		long i=1;
		while(i<=n)
		{
			sum=sum+i;
		i++;
		}
		System.out.print(sum);
  }
}