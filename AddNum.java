import java.util.Scanner;
public class AddNum
{
	public static void main(String args[])
	{
		double no1,no2,ans;
		Scanner in=new Scanner(System.in);
		System.out.println("Input First Number:");
		no1=in.nextDouble();
		System.out.println("Input 2nd Number:");
		no2=in.nextDouble();
		ans=no1+no2;
		//System.out.println("Addition od two Number="+ans);
		System.out.println("Addition of two Number="+ no1 + no2);
		System.out.println(no1 + no2);
	}
}