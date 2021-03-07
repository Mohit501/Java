import java.util.Scanner;
import java.util.*;

class student
{
	String student_name; //name of the student
	int id_no;
	double spi;
	int no_of_sub_registered;
	int[] subject_code,subject_credit,grade_point;
	String[] grade_obtained;
	
	public void get_detail()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter Student name: ");
		this.student_name = sc.nextLine();
		System.out.println("enter Id NO: ");
		this.id_no = sc.nextInt();
		System.out.println("enter number of studernts registered: ");
		this.no_of_sub_registered = sc.nextInt();
		this.subject_code = new int[no_of_sub_registered];
		this.subject_credit = new int[no_of_sub_registered];
		this.grade_obtained = new String[no_of_sub_registered];
		this.grade_point = new int[no_of_sub_registered];
		
		
		for(int i=0;i<no_of_sub_registered;i++)
		{
			System.out.println("enter Subject code: ");
			this.subject_code[i] = sc.nextInt();
            System.out.println("Enter subject credit: ");
            this.subject_credit[i] = sc.nextInt();
            System.out.println("Enter grade obtained: ");
            this.grade_obtained[i] = (String)sc.next();
            switch(this.grade_obtained[i])
			{
             case "AA":this.grade_point[i] = 10; break;
			 case "AB":this.grade_point[i] =  9; break;
			 case "BB":this.grade_point[i] =  8; break;
			 case "BC":this.grade_point[i] =  7; break;
			 case "CC":this.grade_point[i] =  6; break;
			 case "CD":this.grade_point[i] =  5; break;
			 case "DD":this.grade_point[i] =  4; break;
			 case "FF":this.grade_point[i] =  0;break;
			}
		}
	}
	void calculate()
	{
		int points=0,credits =0;
		for(int i=0;i<this.no_of_sub_registered;i++)
		{
			points+=(this.subject_credit[i]*this.grade_point[i]);
			credits = this.subject_credit[i];
		}
		this.spi = (double)points/credits;
		System.out.println("SPI is: "+this.spi);
	}
	public void print_details()
	{
		System.out.println("Result of Student "+this.student_name);
		System.out.println(this.id_no);
		System.out.println("subject code \t subject credit\t obtained grade");
		for(int i=0;i<this.no_of_sub_registered;i++)
		{
		System.out.println(this.subject_code[i]+"\t\t\t"+this.subject_credit[i]+"\t\t\t"+this.grade_obtained);
		}
	}
	public static void main(String args[]){
		{
			
			
			student[] obj = new student[2];
			for(int i=0;i<2;i++)
			{
				obj[i] = new student();
				obj[i].get_detail();
				obj[i].calculate();
				obj[i].print_details();
			}
		}
	}
}