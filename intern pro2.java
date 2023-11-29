import java.util.*;
public class Main 
{
	public static void main(String[] args) 
	{
		Scanner ob=new Scanner(System.in);
		System.out.print("Enter student id : ");
		int id =ob.nextInt();
		System.out.print("\nEnter section :  ");
		char sec = ob.next().charAt(0);
		System.out.print("\nEnter name : ");
		char name=ob.next().charAt(0);
		System.out.println("\n\nEnter marks");
		System.out.print("\nPhysics : ");
		int phy=ob.nextInt();
		System.out.print("\nMaths : ");
		int mat=ob.nextInt();
		System.out.print("\nChemistry : ");
		int chm=ob.nextInt();
		System.out.print("\nEnglish : ");
		int eng=ob.nextInt();
		
		int total=phy+mat+chm+eng;
		float per=total/4;
		
		System.out.println("\n\nReport \n");
		System.out.print("Student Id : "+id);
		System.out.println("\tSection : "+sec);
		System.out.println("Student Name : "+name);
		System.out.println("\n\nPhysics : "+phy);
		System.out.println("Maths : "+mat);
		System.out.println("Chemistry : "+chm);
		System.out.println("English : "+eng);
		System.out.println("Total Marks : "+total);
		System.out.println("Percentage : "+per);
		
		if(per<=80)
		{
			System.out.println("Grade : A");
		}
		else if(per<=60)
		{
			System.out.println("Grade : B");
		}
		else if (per<=40)
		{
			System.out.println("Grade : C");
		}
		else if(per<=33)
		{
			System.out.println("Grade : D");
		}
		else
		{
			System.out.println("Fail");
		}
	}
}