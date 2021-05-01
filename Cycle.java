class wheels
{
	private int wheels;
	public void setwheels(int wheels)
	{
		this.wheels=wheels;
		System.out.println("Cycle wheels:"+wheels);
	}
}

class bell
{
	private String color;
	private String belltype;
	
	public void setbellcolor(String color)
	{
		this.color=color;
		System.out.println("Cycle bell color:"+color);
	}
	
	public void setbelltype(String belltype)
	{
		this.belltype=belltype;
		System.out.println("Cycle bell type:"+belltype);
	}
}

class Cycle
{
	public static void main(String args[])
	{
		wheels w=new wheels();
		bell b=new bell();
		
		w.setwheels(2);
		b.setbellcolor("black");
		b.setbelltype("simple");
	}	
}