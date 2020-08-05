 class Pattern
 {
	 public static void main(String args[])
	{
	 int n=5;
	 int i,j;
	 int x=n,y=n;
	 for(i=1;i<=n;i++)
	 {
		 for(j=1;j<=n*2;j++)
		 {
			 if(j==x||j==y)
			 {
				 System.out.print(x);
			 }
			 else
			 {
				 System.out.print(" ");
			 }
		 }
		 x--;
		 y++;
		 System.out.println();
		 }
	 }
 }
