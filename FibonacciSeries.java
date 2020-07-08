public class FibonacciSeries {
 
	public static void main(String[] args) 
	{
	
		 int MaxCount = 89, n1= 0, n2= 1;
	        System.out.print("Fibonacci Series of 1-89 numbers:");
 
	        int i=1;
	        while(i <= MaxCount)
	        {
	            System.out.print(n1+" ");
	            int sum = n1 + n2;
	            n1 = n2;
	            n2 = sum;
	            i++;
	        }
 
	}
 
}