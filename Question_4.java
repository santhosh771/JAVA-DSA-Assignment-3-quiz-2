
import java.util.Scanner; // import the Scanner class 

public class Question_4 {
  public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		long n = sc.nextLong();
		long sum=0;
		int i=1;
		while(i<=10)
		{
			System.out.println(n +"*"+ i + "="+n*i);
			i++;
		}
		
  }
}