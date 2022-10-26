
public class IneuronPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=10;
		for(int i=0;i<n;i++)
			
		{
			//printing "I"
			
			for(int j=0;j<n;j++)
			{
				if( (i==0)|| (i==n-1) || (j==(n-1)/2))
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			
		}
			
			//printing "N"

			System.out.print("  ");
			for(int j=0;j<n;j++)
			{
				if((j==0) ||(j==(n-1)) || (i==j))
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			
			//printing "E"

			System.out.print("  ");
			for(int j=0;j<n;j++)
			{
				if((j==0) ||(i==(n-1)/2) || (i==0) || (i==n-1))
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			
			//printing "U"

			System.out.print("  ");
			
			for(int j=0;j<n;j++)
			{
				if((j==0)&& (i<(n-1)) || ((i==(n-1))&&(j>0)&&(j<n-1) ) || ((j==(n-1))&&(i<(n-1))))
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			
			
			//printing "R"

			System.out.print("  ");
			
			for(int j=0;j<n;j++)
			{
				if( (j==0)&&(i>0) || ((i==0)&&(j<n-1) && (j>0)) || ((j==(n-1))&&(i!=(n-1)/2))  ||
						(i==(n-1)/2) && (j<(n-1))  )
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			//printing "O"

			System.out.print("  ");
			for(int j=0;j<n;j++)
			{
				if((j==0)&& (i<(n-1)) || ((i==(n-1))&&(j>0)&&(j<n-1) ) || ((j==(n-1))&&(i<(n-1))) ||
						(i==0)&&(j>0)&&(j<(n-1)))
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			
			//printing "N"

			System.out.print("  ");
			for(int j=0;j<n;j++)
			{
				if((j==0) ||(j==(n-1)) || (i==j))
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			
			
			
			System.out.println();
					
				
			}
		

	}}



