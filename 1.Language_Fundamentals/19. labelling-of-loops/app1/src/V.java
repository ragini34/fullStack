class V
{
	public static void main(String[] args) 
	{
		loop1:
		for(int i =0; i < 2; i++)
		{
			System.out.println("loop1 begin");
			for(int j = 0; j < 5; j++)
			{
				System.out.println("loop2 begin");
				if(j > 2)
				{
					continue loop1;
				}
				System.out.println("loop2 end");
			}
		System.out.println("loop1 end");
	 }
	 System.out.println("main end");
	}
}
//labelling of loop introduced in java 1.5
//label name should valid identifier
//it works only in nested loop condition
//i = 0, 1, 2 at this it executes outer main value
//j= 0,1,2,
//loop1 begin
//loop2 begin
//loop2 end
//loop2 begin
//loop2 end
//loop