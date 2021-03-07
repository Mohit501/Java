class pentagonal_number
{
	public static void main(String args[])
	{
		int pent,n;
		for(n=0;n<=100;n++)
		{
			pent = n*(3*n-1)/2;
			System.out.println(pent);
		}
	}
}