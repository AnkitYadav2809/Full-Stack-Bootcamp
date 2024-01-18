import java.util.*;

public class Student {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String name,course,id;
		String ch;
		int j=1,py=1,ph=1;
		
		boolean flag=true;
		while(flag)
		{
		System.out.println("Enter the Student Details");
		System.out.println("Enter the Student Name :");
		name=sc.nextLine();
		System.out.println("Enter the Student Course: Java, Python, PHP: ");
		course=sc.nextLine();
		if(course.equalsIgnoreCase("Java"))
		{
			System.out.println("System Id:"+course+j);
			j++;
		}
		else if(course.equalsIgnoreCase("Python"))
		{
			System.out.println("System Id:"+course+py);
			py++;
		}
		else if(course.equalsIgnoreCase("PHP"))
		{
			System.out.println("System Id:"+course+ph);
			ph++;
		}
		else
			System.out.println("Wrong Entry");
		System.out.println("Enter Y to enter the details or N to stop");
		ch=sc.nextLine();
		
		if(ch.equalsIgnoreCase("Y"))
			flag=true;
		else
			flag=false;

	}
	}

}
