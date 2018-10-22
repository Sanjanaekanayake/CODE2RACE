import java.util.*;
class Even_fibonacci_numbers{
	public static void main(String args[])
	{
		int sum=0;
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value of N :");
		int N=s.nextInt();
		int [] arr=new int[N];
		arr[0]=0;
		arr[1]=1;
		int i=2;
		if(N>4)
		{
		while((arr[i-1]+arr[i-2])<N)
		{  
		  arr[i]=arr[i-1]+arr[i-2];
	    if(arr[i]%2==0)
		   sum=sum+arr[i];
	    i++;
		}
		}
		else if(N>1 && N<=4)
			sum=2;
		else
			sum=0;
		// 0 1 1 2 3 5 8 13 21 34 55 89
		
		System.out.println("Sum of even fibonacci numbers :"+sum);
	}
}
