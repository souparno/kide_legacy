import java.io.*;

public class FibonacciSeries{
	
    public static void main() throws IOException{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int n;
	System.out.print("Enter the value of n:");
	n = Integer.parseInt(br.readLine());
	System.out.println("Fibonacci Series:");
	int a = 0,b=1,c;
	System.out.println(a);
	System.out.println(b);
	//=========== Write your code within the block ===========//
	//IGNORE
	for(int i = 3; i <= n; i++)
        {
		c=a+b;
		System.out.println(c);
		a=b;
		b=c;
            
	}
	//END
	//========================================================//

    }

}

	

	

