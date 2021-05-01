import java.util.*;
import java.awt.*;

abstract class Shape
{
	private double height;
	private double width;
	private double redious;
	
	public void draw() 
	{
	
	}
	public void fill() 
	{
	
	}
	
	public void setRect(double height,double width)
	{
		this.height=height;
		this.width=width;
		
	}
	
	public void setCir(double redious)
	{
		this.redious=redious;
	}
	
	public void setSque(double height)
	{
		this.height=height;
	}
	
	public double getHeight()
	{
		return height;
	}
	
	public double getwidth()
	{
		return width;
	}
	
	public double getRedious()
	{
		return redious;
	}
}

class Circle extends Shape
{
		public double getArea()
		{
			return ( getRedious() * getRedious() ) * 3.14;
		}
		
		 public void draw()
		{
			System.out.println("Drawing Circle.........");
			
		}
		
		public void fill(String color)
		{
			System.out.println("Circle=" +color);
		}
}

class Recentangle extends Shape
{
	
	public double getArea()
	{
		return ( getHeight() * getwidth() ) / 2;
	}
	
	 public void draw()
	{
		System.out.println("Drawing Recentagle.........");
	}
	
	public void fill(String color)
	{
		System.out.println("Rectangle=" +color);
	}
}

class Sequare extends Shape
{
	public double getArea()
	{
		return( getHeight() * getHeight() );
	}
	
	public void draw()
	{
		System.out.println("Drawing Sequre.........");
	}
	
	public void fill(String color)
	{
		System.out.println("Square=" +color);
	}
}

class shapedemo
{
	public static void main(String [] args)
	{
		Shape s;
		
		Recentangle rect=new Recentangle();
		s=rect;
		s.setRect(68,5);
		rect.draw();
		rect.fill("red");
		System.out.println("Area of Rectangle="+rect.getArea());
		
		Circle cir=new Circle();
		s=cir;
		s.setCir(15);
		cir.draw();
		cir.fill("green");
		System.out.println("Area of Circle="+cir.getArea());
		
		Sequare sque=new Sequare();
		s=sque;
		s.setSque(10);
		sque.draw();
		cir.fill("blue");
		System.out.println("Area of Sequare="+sque.getArea());
	}
}