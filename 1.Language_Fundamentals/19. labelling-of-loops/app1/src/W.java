class W
{
	public static void main(String[] args) 
	{
		loop1:
		for(int i = 0; i < 2; i++)
		{
			System.out.println("loop1 begin");
			for(int j = 0; j < 5; j++)
			{
				System.out.println("loop2 begin");
				if(j > 2)
				{
					break loop1;//breaking main loop1 anr terminates to main end
				}
				System.out.println("loop2 end");
			}
		System.out.println("loop1 end");
	 }
	 System.out.println("main end");
	}
}
//i = 0,
//j = 0, 1, 2,3,
//loop1 begin
//loop2 begin
//loop2 end
//loop2 begin
//loop2 end
//loop2 