import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
class record
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String name;
		int marks;
	    String student[][] = new String[name][marks];
		int i,j;
		for(i=0;i<2;i++)
        {
			for(j=0;j<2;j++)
			{
				student[i][j] = sc.nextLine();
			}
		}
	
		for(i=0;i<2;i++)
		{
			for(j=0;j<2;j++)
		{
			System.out.println(student[i][j]);
		}
		}
	}
}
		