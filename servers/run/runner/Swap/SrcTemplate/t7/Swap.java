import java.io.*;

public class Swap{
	
    public static void main() throws IOException{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	System.out.print("Enter the value of a:");
	int a = Integer.parseInt(br.readLine());
	System.out.print("Enter the value of b:");
	int b = Integer.parseInt(br.readLine());

	int temp = 0;
	temp = a;
	b = a;
	a = temp;
	System.out.println("Value of a:"+a);
	System.out.println("Value of b:"+b);
    }

}
