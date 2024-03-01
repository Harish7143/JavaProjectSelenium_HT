package practiceJava;

public class NestedLoopDemo {

	public static void main(String[] args) {
	int count=0;
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=5;j++)
			{
				System.out.println("value of i is " + i + "   " +"value of j is " + j);
				count++;
			}
			System.out.println(" ");
		}
		System.out.println("count is" + count);

	}

}
