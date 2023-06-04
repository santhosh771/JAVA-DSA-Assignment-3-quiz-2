
import java.util.Scanner; // import the Scanner class 

public class Question_5 {
  public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int sum=1;
		int i=1;
		while(i<=m)
		{
			sum=sum*n;
		i++;
		}
		System.out.print(sum);
  }
}