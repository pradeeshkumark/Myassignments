package week1.day2;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int range=8;//Range is decalred
		int a=0;//First Fibonacci  number
		int b=1;//Second Fibonacci number
		
		System.out.println("Fibonacci Series up to " + range + ":");;
		
		for(int i=0;i<=range;i++)
		{
			if(i<range)
			{
				System.out.println(a);// Print the current Fibonacci number
				int temp=a;
				a=b;
				b=b+temp;
			}
			
			
			
		}

	}

}
