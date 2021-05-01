import java.util.*;
public class MyCalc
{
	public static void main(String args[])
	{
		double no1,no2,ans;
		int ch;
		Scanner in=new Scanner(System.in);
		Addition add=new Addition();
		Substraction sub=new Substraction();
		Multiplication mul=new Multiplication();
		System.out.println("Input First Number:");
		no1=in.nextDouble();
		System.out.println("Input 2nd Number:");
		no2=in.nextDouble();
		System.out.println("1.ADDITION\n");
		System.out.println("2:SUBSTRACTION\n");
		System.out.println("3.MULTIPLICATION\n");
		System.out.println("Enter Your Choice:");
		
		ch=in.nextInt();
		if(ch==1)
		{
			add.setNo1(no1);
			add.setNo2(no2);
			ans=add.getSum();
			System.out.println("Sum of"+add.getNo1()+"+"+add.getNo2()+"="+ans);
		}
		else if(ch==2)
		{
			sub.setNo1(no1);
			sub.setNo2(no2);
			ans=sub.getSub();
			System.out.println("Sub of"+sub.getNo1()+"-"+sub.getNo2()+"="+ans);
		}
		else
		{
			mul.setNo1(no1);
			mul.setNo2(no2);
			ans=mul.getProd();
			System.out.println("mul of"+mul.getNo1()+"*"+mul.getNo2()+"="+ans);
		}
	}
}