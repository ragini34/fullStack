class U
{
	public static void main(String[] args) 
	{
		for(int i =0; i < 2; i++)
		{
			System.out.println("loop1 begin");
			for(int j = 0; j < 5; j++)//initialization section executes
			{
				System.out.println("loop2 begin");
				if(j > 2)//when j becomes 3 than it terminates inner for loop
				{
					break;
				}
				System.out.println("loop2 end");
			}
		System.out.println("loop1 end");
	 }
	 System.out.println("main end");
	}
}
//i=0, 1, 2
//j=0, 1, 2, 3, 
//loop1 begin
//loop2 begin
//loop2 end