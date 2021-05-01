import java.util.Scanner;
public class Substraction 
{
   public static void main(String args[])
   {
		private double n1, n2, sub;
		public Substraction()
		{
			n1 =0 ;
			n2 = 0;
			sub = 0;
		}
		public Substraction( int a1, int a2)
		{
			this.n1= a1;
			this.n2 = a2;
		}
		public double getNo1()
		{
			return n1;
		}
		public void setNo1(double a1)
		{
			this.n1 = a1;
		}
		public double getNo2()
		{
			return n2;
		}
		public void setNo2(double a2)
		{
			this.n2= a2;
		}
		public double getSub()
		{
			sub = doSub();
			return sub;
		}
		private double doSub()
		{
			return n1 - n2;
		}
	}
}
