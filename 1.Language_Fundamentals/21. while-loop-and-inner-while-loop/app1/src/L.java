class L
{
	public static void main(String[] args) 
	{
		int i = 0;
		while(i < 4)
		{
			i++;
			System.out.println("begin" + i);
			if(i > 2)//if it is true continue on execute
			{
				continue;
			}
		System.out.println("end " + i);
		}
	}
}