class Shape_3
{
	public static void main(String args[])
	{
		int i,j,k;
		int s=3;
		for(i=1;i<=4;i++)
		{
			for(k=0;k<s;k++)
			{
				System.out.print(" ");
			}
					for(j=1;j<=i*2-1;j++)
					{
						System.out.print("*");
					}
					System.out.println();
					s--;
		}
				
	}
}



