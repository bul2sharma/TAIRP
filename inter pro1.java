import java.util.*;
public class Calculator 
{
	public static void main(String[] args) 
	{
		int a,b;
		char ch;
		Scanner ob=new Scanner(System.in);
		System.out.print("Enter a no : ");
		a=ob.nextInt();
		System.out.print("Enter a no : ");
		b=ob.nextInt();
		System.out.print("Enter an operator : ");
		ch=ob.next().charAt(0);
		switch(ch)
		{
			case '+':
			{
				System.out.println("a+b="+(a+b));
				break;
			}
			case '-':
			{
				System.out.println("a-b="+(a-b));
				break;
			}
			case'*':
			{
				System.out.println("a*b="+(a*b));
				break;
			}
			case'/':
			{
				System.out.println("a/b="+(a/b));
				break;
			}
			case '√':
			{
				System.out.println("√a="+(Math.sqrt(a)));
				break;
			}
			case'^':
			{
				System.out.println("a^="+(Math.exp(a)));
				break;
			}
			default:
			{
				System.out.println("Enter valid operator");
			}
		}
			
			
			
		
	}
}