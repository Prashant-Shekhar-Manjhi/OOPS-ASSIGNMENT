import java.util.*;

class Calculator
{
	String ex1,ex2,ex3;
	int a,b;
	int add()
	{
		return a+b;
	}
	int sub()
	{
		return a-b;
		
	}
	int mul()
	{
		return a*b;
	}
	int div()
	{
		return a/b;
	}
}

public class Q1
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);

		boolean flag = true;
		char op = s.nextLine().charAt(0);
		Calculator calc = new Calculator();
		try
		{
			calc.a = Integer.parseInt(s.nextLine());
		}
		catch(NumberFormatException e)
		{
			System.out.println(e);
			flag = false;
		}
		try
		{
			calc.b = Integer.parseInt(s.nextLine());
		}
		catch(NumberFormatException e)
		{
			System.out.println(e);
			flag = false;
		}
		if(op == '+' && flag)
		{
			System.out.println(calc.add());
		}
		else if(op == '-' && flag)
		{
			System.out.println(calc.sub());
		}
		else if(op == '*' && flag)
		{
			System.out.println(calc.mul());
		}
		else if(op == '/' && flag)
		{
			try
			{
				System.out.println(calc.div());
			}
			catch(ArithmeticException e)
			{
				System.out.println(e);
			}
		}
		else if(flag)
			System.out.println("Invalid Operator");

	}
}

