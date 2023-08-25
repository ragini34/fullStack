class K 
{
	public static void main(String[] args) 
	{
		int i = 0;
		while(i < 4)
		{
			System.out.println("begin" + i);
			if(i > 2)//if it is true continue on execute
			{
				continue;
			}
		System.out.println("end " + i);
		i++;
		}
	}
}
//begin 0
//end 0
//begin 1
//end 1
//begin 2
//end 2
//begin 3 ...infinite time it executes
